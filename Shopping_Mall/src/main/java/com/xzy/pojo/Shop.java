package com.xzy.pojo;

import java.io.Serializable;

/**
 * @author WuJiaWei
 * @date 2019/7/23-23:30
 */
public class Shop implements Serializable
{
    private int Shop_Id;
    private String Shop_Name;
    private int Shop_Coupon_Price;

    public int getShop_Id() {
        return Shop_Id;
    }

    public void setShop_Id(int shop_Id) {
        Shop_Id = shop_Id;
    }

    public String getShop_Name() {
        return Shop_Name;
    }

    public void setShop_Name(String shop_Name) {
        Shop_Name = shop_Name;
    }

    public int getShop_Coupon_Price() {
        return Shop_Coupon_Price;
    }

    public void setShop_Coupon_Price(int shop_Coupon_Price) {
        Shop_Coupon_Price = shop_Coupon_Price;
    }
}
