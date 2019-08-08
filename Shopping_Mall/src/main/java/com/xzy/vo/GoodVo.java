package com.xzy.vo;

import com.xzy.pojo.Goods;
import com.xzy.pojo.Shop;

public class GoodVo {
    private Goods good;
    private int popular;
    private Shop shop;


    public GoodVo(Goods good, int popular, Shop shop) {
        this.good = good;
        this.popular = popular;
        this.shop = shop;
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

}
