package com.xzy.pojo;

public class Shop {
    private Integer shopId;

    private String shopName;

    private Integer coupon;

    public Shop(Integer shopId, String shopName, Integer coupon) {
        this.shopId = shopId;
        this.shopName = shopName;
        this.coupon = coupon;
    }

    public Shop() {
        super();
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName == null ? null : shopName.trim();
    }

    public Integer getCoupon() {
        return coupon;
    }

    public void setCoupon(Integer coupon) {
        this.coupon = coupon;
    }
}