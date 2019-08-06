package com.xzy.vo;

import java.io.Serializable;

/**
 * @author WuJiaWei
 * @date 2019/7/29-17:28
 */
public class findcoupon implements Serializable
{
    private float shop_coupon_Price;
    private int shop_Id;
    private int user_Id;
    private float goods_Id;

    public float getGoods_Id() {
        return goods_Id;
    }

    public void setGoods_Id(float goods_Id) {
        this.goods_Id = goods_Id;
    }

    public float getShop_coupon_Price() {
        return shop_coupon_Price;
    }

    public void setShop_coupon_Price(float shop_coupon_Price) {
        this.shop_coupon_Price = shop_coupon_Price;
    }

    public int getShop_Id() {
        return shop_Id;
    }

    public void setShop_Id(int shop_Id) {
        this.shop_Id = shop_Id;
    }

    public int getUser_Id() {
        return user_Id;
    }

    public void setUser_Id(int user_Id) {
        this.user_Id = user_Id;
    }
}
