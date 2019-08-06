package com.xzy.pojo;

import java.io.Serializable;

/**
 * @author WuJiaWei
 * @date 2019/7/23-23:30
 */
public class shop implements Serializable
{
    private int shop_Id;
    private String shop_Name;
    private int shop_coupon_Price;

    public int getShop_coupon_Price() {
        return shop_coupon_Price;
    }

    public void setShop_coupon_Price(int shop_coupon_Price) {
        this.shop_coupon_Price = shop_coupon_Price;
    }

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

}
