package com.xzy.dao;

import com.xzy.vo.*;
import com.xzy.pojo.goods;
import com.xzy.pojo.user;


import java.util.List;

/**
 * @author WuJiaWei
 * @date 2019/7/23-12:07
 */
public interface CartMapper
{
    //显示所有商品
    List<CartCostom> findAllCart(CartVo cartVo);
    //删除一个商品
    List<CartCostom> deleteCart(CartVo cartVo);
    //新建一个商品
    List<CartCostom> insertCart(CatId catId);
    //选中和未选中状态
    List<Check> CheckOrUnCheck(Check check);
    //找到所用优惠券面额
    List<findcoupon> findcoupon(user user_Id);
    //找到对应用户的购物车
    public int findCartID(int user_Id);
    //通过购物车关联表查到商品
    List<Need> findAllgoods(goods goods);
    //修改购物车中商品数量
    List<ChangeNum> ChangeNum(ChangeNum changeNum);
    //获取商品的价格
    float getPrice(goods goods);
    //发送给订单模块
    List<sendAll> SendAll(sendAll sendAll);
    //按你所需
//    List<Need> Need(Need need);
}

