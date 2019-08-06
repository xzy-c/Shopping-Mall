package com.xzy.pojo;

/**
 * @author WuJiaWei
 * @date 2019/7/28-13:49
 */
public class coupon
{
    private int coupon_Id;
    private int user_Id;
    private int shop_Id;

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
}
