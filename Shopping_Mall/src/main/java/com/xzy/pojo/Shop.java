package com.xzy.pojo;

import java.io.Serializable;

/**
 * @author yangxin
 * @date 2019/7/26 - 12:31
 * 商家
 */
public class Shop implements Serializable {
    private int shop_Id;//商家Id
    private String shop_Name;//商家名称
    private int coupon;//商家的优惠券面值

    public int getShop_Id() {
        return shop_Id;
    }

    public void setShop_Id(int shop_Id) {
        this.shop_Id = shop_Id;
    }

    public String getShop_Name() {
        return shop_Name;
    }

    public void setShop_Name(String shop_Name) {
        this.shop_Name = shop_Name;
    }

    public int getCoupon() {
        return coupon;
    }

    public void setCoupon(int coupon) {
        this.coupon = coupon;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "shop_Id=" + shop_Id +
                ", shop_Name='" + shop_Name + '\'' +
                ", coupon=" + coupon +
                '}';
    }
}
