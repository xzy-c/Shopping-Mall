package com.xzy.service.base;

import com.xzy.vo.MyCoupon;
import com.xzy.vo.MyFocusGoods;
import com.xzy.vo.MyFocusShop;
import com.xzy.vo.OrdersAll;
import com.xzy.pojo.*;
import java.util.List;
import java.util.Map;

/**
 * @author yangxin
 * @date 2019/7/26 - 23:24
 */
public interface MyPageService {
    //查询用户信息
    public User getUserInfo(User user) throws Exception;

    //查询用户收藏的红包
    public List<MyCoupon> getUserCoupon(User user)throws Exception;
    public List<Shop> getShopCoupons(List<Integer> shopIds)throws Exception;

    //查询用户关注的商家
    public List<MyFocusShop> getUserFocusShop(User user)throws Exception;
    public List<Shop> getUserFoucsShops(List<Integer> shopIds)throws Exception;

    //查询用户收藏的商品
    public List<MyFocusGoods> getUserFocusGood(User user)throws Exception;
    public List<Goods> getUserFocusGoods(List<Integer> productIds)throws Exception;

    //查询用户地址
    public List<User_Addr> getUserAddrs(User user)throws Exception;

    //删除用户收藏的商品
    public void delLoveGood(Map map)throws Exception;

    //删除用户关注的商家
    public void delLoveShop(Map map)throws Exception;

    //删除用户的收货地址
    public void delUserAddr(Map map) throws Exception;

    //展示用户信息
    public User showUpUser(User user) throws Exception;

    //修改用户信息
    public void setUpUser(Map map)throws Exception;

    //查询收藏商品数目
    public Integer getGoodsCount(User user)throws Exception;

    //查询关注商家数目
    public Integer getShopCount(User user)throws Exception;

    //查询用户拥有红包数目
    public Integer getCouponCount(User user)throws Exception;

    //查询用户拥有的地址的数目
    public Integer getAddrCount(User user)throws Exception;

    //查询用户全部订单
    //state为前台传的状态码:2为待评论的订单,3为待付款的订单，若未传则查询出全部的订单
    public OrdersAll getAllShopAndGoods(int user_id)throws  Exception;
}
