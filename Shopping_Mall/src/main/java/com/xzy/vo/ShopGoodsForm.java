package com.xzy.vo;

public class ShopGoodsForm {
    private Integer shopId;
    private Integer goodsId;
    private int stock;
    private int volume;

    public ShopGoodsForm(Integer shopId, Integer goodsId, int stock, int volume) {
        this.shopId = shopId;
        this.goodsId = goodsId;
        this.stock = stock;
        this.volume = volume;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
