package com.xzy.dao;

import com.xzy.pojo.Goods;
import com.xzy.vo.*;
import com.xzy.pojo.User;


import java.util.List;

/**
 * @author WuJiaWei
 * @date 2019/7/23-12:07
 */
public interface CartMapper
{
    //显示所有商品
    List<CartCostom> findAllCart(CartVo CartVo);
    //删除一个商品
    List<CartCostom> deleteCart(CartVo CartVo);
    //新建一个商品
    List<CartCostom> insertCart(CatId CatId);
    //选中和未选中状态
    List<Check> CheckOrUnCheck(Check check);
    //找到所用优惠券面额
    List<FindCoupon> findcoupon(User User_Id);
    //找到对应用户的购物车
    public int findCartID(int User_Id);
    //通过购物车关联表查到商品
    List<Need> findAllgoods(Goods Goods);
    //修改购物车中商品数量
    List<ChangeNum> ChangeNum(ChangeNum ChangeNum);
    //获取商品的价格
    float getPrice(Goods Goods);
    //发送给订单模块
    List<SendAll> SendAll(SendAll SendAll);
    //按你所需
//    List<Need> Need(Need need);
}

