package com.xzy.pojo;

public class Shop {
    private int shop_Id;
    private String shop_Name;
    private int coupon;

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
                ", shop_Coupon=" + coupon +
                '}';
    }
}
