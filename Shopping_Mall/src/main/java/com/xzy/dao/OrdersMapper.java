package com.xzy.dao;

import com.xzy.pojo.*;
import com.xzy.vo.GoodsIdList;
import com.xzy.vo.GoodsVo;
import com.xzy.vo.OrdersVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface OrdersMapper {
    //查询用户地址
    public User_Addr findByAddress(int user_Id);
    //增加订单
    public int addOrders(Orders orders);
    //查询商品
    public Goods findGoodsById(int id);
    //增加订单项
    public void addOrdersItem(OrdersItem ordersItem);
    //删除订单表中中对应的订单项
    public void delOrdersItem(int orders_Id);
    //删除订单
    public void delOrders(int id);
    //查询商品价格
    public float getGoodsPrice(int goods_Id);
    //查询所有订单
    public List<OrdersVo> getAllOrders(
            @Param("user_Id") int user_Id,
            @Param("state") int state
    );
    //查询所有订单项
    public List<OrdersItem> getAllOrdersItem(int id);
    //通过商品查询店家信息
    public Shop getShopByGoodsId(int goods_Id);
    //通过商品id查询商品pojo
    public Goods getGoodsByGoodsId(int goods_Id);
    //拼接sql，通过所有商品id查询分类店家，返回店家的集合
    public List<Integer> getShopList(GoodsIdList goodsIds);
    //通过店家id得到店家属性
    public Shop getShopById(int shop_Id);
    //生成订单以后数据库库存减一
    public void delOne(int goods_Id);
    //查询优惠券
    public Coupon selectCoupon(
            @Param("user_Id") Integer user_Id,
            @Param("shop_Id") Integer shop_Id
    );

    //通过购物车ID得到购物车对象
    public Goods_Rel getGoodsRel(int goods_Rel_Id);
    //删除优惠券
    public void deleteCoupon(int coupon_Id);
    //删除购物车
    public void delCart(int goods_Rel_Id);
    //完成订单以后商品成交量增加
    public void increaseGoods(
            @Param("goods_Id") Integer goods_Id,
            @Param("goods_Num") Integer goods_Num);
    //修改订单总价
    public void updatePrice(
            @Param("orders_Mone") Float orders_Mone,
            @Param("orders_Id") Integer orders_Id);

    //查询商家名
    public String selectShopName(int shop_Id);
    //封装前台订单详情的商品
    public GoodsVo selectGoodVo(int goods_Id);
    //修改支付状态
    public void updateOrders(int orders_Id);
}
