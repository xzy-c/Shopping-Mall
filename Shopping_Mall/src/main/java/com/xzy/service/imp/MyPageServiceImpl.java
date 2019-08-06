package com.xzy.service.imp;

import com.xzy.vo.*;
import com.xzy.dao.MyPageMapper;
import com.xzy.pojo.*;
import com.xzy.service.base.MyPageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author yangxin
 * @date 2019/7/26 - 23:24
 */
@Service
public class MyPageServiceImpl implements MyPageService {

    @Autowired
    private MyPageMapper myPageMapper;

    @Override
    public User getUserInfo(User user) throws Exception {
        User us = myPageMapper.getUserInfo(user);
        return us;
    }

    @Override
    public List<MyCoupon> getUserCoupon(User user)throws Exception {
        List<MyCoupon> list=myPageMapper.getUserCoupon(user);
        return list;
    }

    @Override
    public List<Shop> getShopCoupons(List<Integer> shopIds) throws Exception {
        return myPageMapper.getShopCoupons(shopIds);
    }

    @Override
    public List<MyFocusShop> getUserFocusShop(User user) throws Exception {
        return myPageMapper.getUserFocusShop(user);
    }

    @Override
    public List<Shop> getUserFoucsShops(List<Integer> shopIds) throws Exception {
        return myPageMapper.getUserFoucsShops(shopIds);
    }

    @Override
    public List<MyFocusGoods> getUserFocusGood(User user) throws Exception {
        return myPageMapper.getUserFocusGood(user);
    }

    @Override
    public List<Goods> getUserFocusGoods(List<Integer> productIds) throws Exception {
        return myPageMapper.getUserFocusGoods(productIds);
    }

    @Override
    public List<User_Addr> getUserAddrs(User user) throws Exception {
        return myPageMapper.getUserAddrs(user);
    }


    @Override
    @Transactional
    public void delLoveGood(Map map) throws Exception{
        myPageMapper.delLoveGood(map);
        System.out.println("++++++++删除成功");
    }

    @Override
    @Transactional
    public void delLoveShop(Map map) throws Exception {
        myPageMapper.delLoveShop(map);
        System.out.println("删除成功++++++");
    }

    @Override
    @Transactional
    public void delUserAddr(Map map) throws Exception {
        myPageMapper.delUserAddr(map);
        System.out.println("删除成功+++++");
    }

    @Override
    @Transactional
    public void setUpUser(Map map) throws Exception {
        myPageMapper.setUpUser(map);
        System.out.println("修改信息成功");
    }

    @Override
    public User showUpUser(User user) throws Exception {
        return myPageMapper.showUpUser(user);
    }

    @Override
    public Integer getGoodsCount(User user) throws Exception {
        return myPageMapper.getGoodsCount(user);
    }

    @Override
    public Integer getShopCount(User user) throws Exception {
        return myPageMapper.getShopCount(user);
    }

    @Override
    public Integer getCouponCount(User user) throws Exception {
        return myPageMapper.getCouponCount(user);
    }

    @Override
    public Integer getAddrCount(User user) throws Exception {
        return myPageMapper.getAddrCount(user);
    }

    //查询订单，按照店铺分类，返回给前端
    @Override
    public OrdersAll getAllShopAndGoods(int user_Id) throws Exception{
        //返回的所有订单  并且根据店铺分类
        OrdersAll ordersAll=new OrdersAll();
        //订单信息和按商家分类好的所有订单集合
        ArrayList<OrdersAndGoods> ordersAndGoods=new ArrayList<OrdersAndGoods>();
        //首先通过userid查询到所有订单集合(只查询这两个字段orders_Id,orders_Mone)
        List<OrdersVo> orders=myPageMapper.getAllOrders(user_Id);
        System.out.println(orders.toString());
        //遍历订单集合
        for(OrdersVo item:orders)
        {
            //最终返回对用户一个完整订单的封装
            OrdersAndGoods Orders=new OrdersAndGoods();
            //得到该订单下的所有订单项
            List<OrdersItem> ordersItem=myPageMapper.getAllOrdersItem(item.getOrders_Id());
            //获取此订单下所有商品的Id集合
            GoodsIdList goodsIds=new GoodsIdList();
            //得到订单项中的所有商品集合
            for(OrdersItem item1:ordersItem)
            {
                goodsIds.getIds().add(item1.getGoods_Id());
            }
            //得到商品集合中的所有店家，根据店家分类，得到店家Id集合(通过group by)
            List<Integer> shop_Id=new ArrayList<Integer>();
            shop_Id=myPageMapper.getShopList(goodsIds);
            //单个商家的所有商品
            ArrayList<ShopAndGoods1> shops=new ArrayList<ShopAndGoods1>();
            //一个订单的多个商家处理完
            for(Integer i:shop_Id)
            {
                ShopAndGoods1 shopAndGoods=new ShopAndGoods1();
                shopAndGoods.setShop_Name(myPageMapper.selectShopName(i));
                for(OrdersItem item2:ordersItem)
                {
                    //应该是从订单项的
                    if(myPageMapper.getShopByGoodsId(item2.getGoods_Id()).getShop_Id()==i)
                    {
                        GoodsVo goodsVo = myPageMapper.selectGoodVo(item2.getGoods_Id());
                        goodsVo.setGoods_Num(item2.getOrdersItem_Sum());
                        //就是一个订单的某一商家的商品，开始封装
                        shopAndGoods.getGoodsVo().add(goodsVo);
                    }
                }
                //封装订单的各个商家及其商品
                shops.add(shopAndGoods);
            }
            //封装完一个订单中某个商家及其所有商品
            Orders.setOrdersVo(item);
            Orders.setShopAndGoods(shops);
            //封装某一个完整的订单
            ordersAndGoods.add(Orders);
        }
        ordersAll.setOrdersAndGoods(ordersAndGoods);
        return ordersAll;
    }
}
