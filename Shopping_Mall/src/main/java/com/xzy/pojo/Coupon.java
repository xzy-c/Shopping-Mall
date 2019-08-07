package com.xzy.pojo;

/**
 * @author WuJiaWei
 * @date 2019/7/28-13:49
 */
public class Coupon
{
    private int Coupon_Id;
    private int User_Id;
    private int Shop_Id;

    public int GetCoupon_Id() {
        return Coupon_Id;
    }

    public int getCoupon_Id() {
        return Coupon_Id;
    }

    public void setCoupon_Id(int coupon_Id) {
        Coupon_Id = coupon_Id;
    }

    public int getUser_Id() {
        return User_Id;
    }

    public void setUser_Id(int user_Id) {
        User_Id = user_Id;
    }

    public int getShop_Id() {
        return Shop_Id;
    }

    public void setShop_Id(int shop_Id) {
        Shop_Id = shop_Id;
    }
}
