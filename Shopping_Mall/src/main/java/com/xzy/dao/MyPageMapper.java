package com.xzy.dao;

import com.xzy.vo.*;
import com.xzy.pojo.*;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @author yangxin
 * @date 2019/7/26 - 23:26
 */

@Repository
public interface MyPageMapper {
    public User getUserInfo(User user)throws Exception;

    public List<MyCoupon> getUserCoupon(User  user)throws Exception;

    public List<Shop> getShopCoupons(List<Integer> shopIds);

    public List<MyFocusShop> getUserFocusShop(User user)throws Exception;

    public List<Shop> getUserFoucsShops(List<Integer> shopIds)throws Exception;

    public List<MyFocusGoods> getUserFocusGood(User user)throws Exception;

    public List<Goods> getUserFocusGoods(List<Integer> productIds);

    public List<User_Addr> getUserAddrs(User user)throws Exception;

    public void delLoveGood(Map map)throws Exception;

    public void delLoveShop(Map map)throws Exception;

    public void delUserAddr(Map map) throws Exception;

    public void setUpUser(Map map)throws Exception;

    public User showUpUser(User user) throws Exception;

    public Integer getGoodsCount(User user)throws Exception;

    public Integer getShopCount(User user)throws Exception;

    public Integer getCouponCount(User user)throws Exception;

    public Integer getAddrCount(User user)throws Exception;

    public  List<OrdersVo> getAllOrders(@Param("user_Id") int user_Id)throws Exception;

    public List<OrdersItem> getAllOrdersItem(Integer orders_Id)throws Exception;

    public List<Integer> getShopList(GoodsIdList goodsIdList)throws Exception;

    public String selectShopName(Integer shop_Id)throws Exception;

    public  Shop getShopByGoodsId(Integer goods_Id)throws Exception;

    public GoodsVo selectGoodVo(Integer goods_Id)throws Exception;
}

