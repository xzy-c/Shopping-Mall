package com.xzy.pojo;

import java.io.Serializable;

/**
 * @author yangxin
 * @date 2019/7/26 - 12:32
 * 优惠券
 */
public class Coupon implements Serializable {
    private int coupon_Id;//优惠券Id
    private int user_Id;//优惠券所属用户
    private int shop_Id;//优惠券所属店家

    public int getCoupon_Id() {
        return coupon_Id;
    }

    public void setCoupon_Id(int coupon_Id) {
        this.coupon_Id = coupon_Id;
    }

    public int getUser_Id() {
        return user_Id;
    }

    public void setUser_Id(int user_Id) {
        this.user_Id = user_Id;
    }

    public int getShop_Id() {
        return shop_Id;
    }

    public void setShop_Id(int shop_Id) {
        this.shop_Id = shop_Id;
    }

    @Override
    public String toString() {
        return "Coupon{" +
                "coupon_Id=" + coupon_Id +
                ", user_Id=" + user_Id +
                ", shop_Id=" + shop_Id +
                '}';
    }
}
