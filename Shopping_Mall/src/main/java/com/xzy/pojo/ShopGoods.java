package com.xzy.pojo;

public class ShopGoods {
    private Integer shopgoodsId;

    private Integer shopId;

    private Integer goodsId;

    private Integer stock;

    private Integer volume;

    public ShopGoods(Integer shopgoodsId, Integer shopId, Integer goodsId, Integer stock, Integer volume) {
        this.shopgoodsId = shopgoodsId;
        this.shopId = shopId;
        this.goodsId = goodsId;
        this.stock = stock;
        this.volume = volume;
    }

    public ShopGoods() {
        super();
    }

    public Integer getShopgoodsId() {
        return shopgoodsId;
    }

    public void setShopgoodsId(Integer shopgoodsId) {
        this.shopgoodsId = shopgoodsId;
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

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }
}