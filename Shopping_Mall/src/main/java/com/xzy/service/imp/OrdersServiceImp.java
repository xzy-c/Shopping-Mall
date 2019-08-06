package com.xzy.service.imp;

import com.xzy.dao.OrdersMapper;
import com.xzy.pojo.*;
import com.xzy.service.base.OrdersService;
import com.xzy.vo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class OrdersServiceImp implements OrdersService {
    @Autowired
    OrdersMapper ordersmapper;

    public Goods findGoodsById(int goods_Id){
        return ordersmapper.getGoodsByGoodsId(goods_Id);
    }

    /**
     * 单点生成订单
     * */
    @Override
    public Orders addOrders(int goods_Id, int user_Id, int ordersItem_Sum) {
        //增加订单
        Orders orders=new Orders();
        Goods goods=new Goods();
        goods=ordersmapper.findGoodsById(goods_Id);
        User_Addr addr=new User_Addr();
        addr=ordersmapper.findByAddress(user_Id);
        orders.setOrders_Date(new Date());
        orders.setOrders_Apply(0);
        orders.setOrders_Return(0);
        orders.setUser_Addr_Id(addr.getUser_Addr_Id());
        orders.setOrders_Subs(0);
        orders.setUser_Id(user_Id);
        orders.setOrders_Dis(0);
        //订单总价
        float money;
        //金额  需要减去该用户的优惠券  首先应该先通过商品拿到店铺的ID，然后通过店铺和user_id一起来确定该用户
        //是否有优惠券  有优惠券的时候需要减去该优惠券，当使用该优惠券以后需要删除
        int shop_Id=ordersmapper.getShopByGoodsId(goods.getGoods_Id()).getShop_Id();
        Coupon coupon=ordersmapper.selectCoupon(user_Id,shop_Id);

        if(coupon!=null)
        {
            //查询优惠券面值
            Shop shop=new Shop();
            shop=ordersmapper.getShopByGoodsId(goods_Id);
            money=ordersItem_Sum*goods.getGoods_Price()-shop.getCoupon();
            orders.setOrders_Mone(money);

            //删除优惠券
            ordersmapper.deleteCoupon(coupon.getCoupon_Id());
        }
        else
        {
            money=ordersItem_Sum*goods.getGoods_Price();
            orders.setOrders_Mone(money);
        }

        System.out.println(orders);
        ordersmapper.addOrders(orders);



        //生成订单项
        OrdersItem ordersItem=new OrdersItem();
        ordersItem.setGoods_Id(goods.getGoods_Id());
        ordersItem.setOrders_Id(orders.getOrders_Id());
        ordersItem.setOrdersItem_Sum(ordersItem_Sum);
        ordersItem.setOrdersItem_Sub(orders.getOrders_Mone());
        ordersmapper.addOrdersItem(ordersItem);
        //生成待支付订单后删商品库存
        System.out.println(ordersItem);
        ordersmapper.delOne(goods_Id);
        //购买完商品修改成交量
        int goods_Num=goods.getGoods_Num()+ordersItem_Sum;
        ordersmapper.increaseGoods(goods_Id,goods_Num);

        return orders;
    }

    //购物车增加订单
    @Override
    public Orders addCartOrders(int user_Id,int []goods_Rel_Id) {
        //先生成订单
        float orders_Mone=0.0f;
        Orders orders=new Orders();
        User_Addr addr=ordersmapper.findByAddress(user_Id);
        System.out.println(addr.toString());
        orders.setOrders_Date(new Date());
        orders.setOrders_Apply(0);
        orders.setOrders_Return(0);
        orders.setUser_Addr_Id(addr.getUser_Addr_Id());
        orders.setOrders_Mone(orders_Mone);
        orders.setOrders_Subs(0);
        orders.setUser_Id(user_Id);
        orders.setOrders_Dis(0);
        System.out.println(orders.toString());
        ordersmapper.addOrders(orders);

        //生成订单项
        for(int i=0;i<goods_Rel_Id.length;i++)
        {
            Goods_Rel goods_Rel=new Goods_Rel();
            OrdersItem ordersItem=new OrdersItem();
            //获得到购物车关联表
            goods_Rel=ordersmapper.getGoodsRel(goods_Rel_Id[i]);

            System.out.println(goods_Rel.toString());

            System.out.println(orders.getOrders_Id());

            ordersItem.setOrders_Id(orders.getOrders_Id());
            ordersItem.setOrdersItem_Sum(goods_Rel.getGoods_Rel_Am());
            float price=ordersmapper.getGoodsPrice(goods_Rel.getGoods_Id());
            System.out.println(price);
            ordersItem.setGoods_Id(goods_Rel.getGoods_Id());

            System.out.println(ordersItem.toString());

            //生成订单项以后  减去库存
            ordersmapper.delOne(goods_Rel.getGoods_Id());

            int shop_Id=ordersmapper.getShopByGoodsId(goods_Rel.getGoods_Id()).getShop_Id();
            Coupon coupon=ordersmapper.selectCoupon(user_Id,shop_Id);
            if(coupon!=null)
            {
                //有优惠券，应当在订单项小计时减去优惠券，并且把价格加和在总价上，删除优惠券
                int card=ordersmapper.getShopById(shop_Id).getCoupon();
                System.out.println(ordersmapper.getShopById(shop_Id));
                System.out.println(card+"**************************");
                ordersItem.setOrdersItem_Sub(price*goods_Rel.getGoods_Rel_Am()-card);

                orders_Mone=orders_Mone+(price*goods_Rel.getGoods_Rel_Am()-card);
                ordersmapper.deleteCoupon(coupon.getCoupon_Id());
            }
            else{
                ordersItem.setOrdersItem_Sub(price*goods_Rel.getGoods_Rel_Am());
                orders_Mone=orders_Mone+price*goods_Rel.getGoods_Rel_Am();
            }

            ordersmapper.addOrdersItem(ordersItem);
            //删除购物车中的商品
            //ordersmapper.delCart(goods_Rel_Id[i]);
            //增加商品成交量
            Goods goods=ordersmapper.getGoodsByGoodsId(ordersItem.getGoods_Id());
            int goods_Num=goods.getGoods_Num()+goods_Rel.getGoods_Rel_Am();
            ordersmapper.increaseGoods(goods.getGoods_Id(),goods_Num);
            //修改订单总价
            orders.setOrders_Mone(orders_Mone);
            ordersmapper.updatePrice(orders_Mone,orders.getOrders_Id());
        }
        return orders;
    }


    //删除订单
    public void delOrders(int id){
        //首先应该删除订单项，再删除订单,     先拿到该订单的订单id，查询出订单项集合，动态SQL删除
        ordersmapper.delOrdersItem(id);
        ordersmapper.delOrders(id);
    }

    //订单详情页面
    @Override
    public Orderdetails getOrdersDetails(int orders_Id,int user_Id) {

        //首先通过拿到的user_id查询地址
        Orderdetails orderDetails=new Orderdetails();
        User_Addr user_Addr=new User_Addr();
        user_Addr=ordersmapper.findByAddress(user_Id);
        orderDetails.setUser_Addr(user_Addr);

        //然后通过拿到的订单id开始封装订单下的店铺和商品
        List<OrdersItem> ordersItem=new ArrayList<OrdersItem>();
        ordersItem=ordersmapper.getAllOrdersItem(orders_Id);
        GoodsIdList goodsIds=new GoodsIdList();
        for(OrdersItem item1:ordersItem){
            //遍历订单项,拿到订单项的商品集合
            goodsIds.getIds().add(item1.getGoods_Id());
        }
        List<Integer> shop_Id=new ArrayList<Integer>();
        shop_Id=ordersmapper.getShopList(goodsIds);
        ArrayList<ShopAndGoods1> shopAndGoods=new ArrayList<ShopAndGoods1>();
        for(Integer i:shop_Id)
        {
            ShopAndGoods1 shops=new ShopAndGoods1();
            shops.setShop_Name(ordersmapper.selectShopName(i));
            ArrayList<GoodsVo> goodsVo=new ArrayList<GoodsVo>();
            for(OrdersItem item2:ordersItem)
            {
                //按照店家分类
                if(ordersmapper.getShopByGoodsId(item2.getGoods_Id()).getShop_Id()==i)
                {
                    //同一个商家的商品  开始封装
                    goodsVo.add(ordersmapper.selectGoodVo(item2.getGoods_Id()));
                }
            }
            shops.setGoodsVo(goodsVo);
            shopAndGoods.add(shops);
            orderDetails.setShopAndGoods(shopAndGoods);
        }
        System.out.println(orderDetails);
        return orderDetails;
    }


    //查询订单，按照店铺分类，返回给前端
    public OrdersAll getAllShopAndGoods(int user_id,int state){
        //返回的所有订单  并且根据店铺分类
        OrdersAll ordersAll=new OrdersAll();
        //订单和按商家分类好的
        ArrayList<OrdersAndGoods> ordersAndGoods=new ArrayList<OrdersAndGoods>();
        //首先通过userid查询到所有订单集合
        List<OrdersVo> orders=ordersmapper.getAllOrders(user_id,state);
        System.out.println(orders.toString());
        //遍历订单集合
        for(OrdersVo item:orders)
        {
            //最终返回对象的封装
            OrdersAndGoods Orders=new OrdersAndGoods();
            //得到该订单下的所有订单项
            List<OrdersItem> ordersItem=ordersmapper.getAllOrdersItem(item.getOrders_Id());
            GoodsIdList goodsIds=new GoodsIdList();
            //得到订单项中的所有商品集合
            for(OrdersItem item1:ordersItem)
            {
                goodsIds.getIds().add(item1.getGoods_Id());
            }
            //得到商品集合中的所有店家，根据店家分类，得到店家集合
            List<Integer> shop_Id=new ArrayList<Integer>();
            shop_Id=ordersmapper.getShopList(goodsIds);
            ArrayList<ShopAndGoods1> shops=new ArrayList<ShopAndGoods1>();
            //一个订单的商家处理完
            for(Integer i:shop_Id)
            {
                ShopAndGoods1 shopAndGoods=new ShopAndGoods1();
                shopAndGoods.setShop_Name(ordersmapper.selectShopName(i));
                for(OrdersItem item2:ordersItem)
                {
                    //应该是从订单项的
                    if(ordersmapper.getShopByGoodsId(item2.getGoods_Id()).getShop_Id()==i)
                    {
                        //就是一个订单的某一商家的商品，开始封装
                        GoodsVo goodsVo=new GoodsVo();
                        goodsVo=ordersmapper.selectGoodVo(item2.getGoods_Id());
                        goodsVo.setGoods_Num(item2.getOrdersItem_Sum());
                        shopAndGoods.getGoodsVo().add(goodsVo);
                    }
                }
                shops.add(shopAndGoods);
            }
            Orders.setOrdersVo(item);
            Orders.setShopAndGoods(shops);
            ordersAndGoods.add(Orders);
        }
        ordersAll.setOrdersAndGoods(ordersAndGoods);
        System.out.println(ordersAll.toString());
        return ordersAll;
    }


    //修改支付状态
    public void updateOrders(int orders_Id){
        ordersmapper.updateOrders(orders_Id);
    }
}
