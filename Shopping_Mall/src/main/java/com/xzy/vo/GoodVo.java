package com.xzy.vo;

import com.xzy.pojo.Goods;
import com.xzy.pojo.Shop;

public class GoodVo {
    private Goods good;
    private int popular;
    private Shop shop;
    private int stock;
    private int volume;

    public GoodVo(Goods good, int popular, Shop shop, int stock, int volume) {
        this.good = good;
        this.popular = popular;
        this.shop = shop;
        this.stock = stock;
        this.volume = volume;
    }

    public Goods getGood() {
        return good;
    }

    public void setGood(Goods good) {
        this.good = good;
    }

    public int getPopular() {
        return popular;
    }

    public void setPopular(int popular) {
        this.popular = popular;
    }

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
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
