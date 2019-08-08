package com.xzy.vo;

import java.io.Serializable;

/**
 * @author WuJiaWei
 * @date 2019/7/29-17:28
 */
public class FindCoupon implements Serializable
{
    private float Shop_Coupon_Price;
    private int Shop_Id;
    private int User_Id;
    private float Goods_Id;

    public float getShop_Coupon_Price() {
        return Shop_Coupon_Price;
    }

    public void setShop_Coupon_Price(float shop_Coupon_Price) {
        Shop_Coupon_Price = shop_Coupon_Price;
    }

    public int getShop_Id() {
        return Shop_Id;
    }

    public void setShop_Id(int shop_Id) {
        Shop_Id = shop_Id;
    }

    public int getUser_Id() {
        return User_Id;
    }

    public void setUser_Id(int user_Id) {
        User_Id = user_Id;
    }

    public float getGoods_Id() {
        return Goods_Id;
    }

    public void setGoods_Id(float goods_Id) {
        Goods_Id = goods_Id;
    }
}
