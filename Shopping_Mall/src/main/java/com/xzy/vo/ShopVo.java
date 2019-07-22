package com.xzy.vo;

import com.xzy.pojo.Goods;
import com.xzy.pojo.Shop;

import java.util.List;

/**
 * 商家信息vo
 * 包括商家基本信息,粉丝数,商品
 */
public class ShopVo {
    private Shop basic;
    private int popular;
    private List<Goods> goods;

    public ShopVo(Shop basic, int popular, List<Goods> goods) {
        this.basic = basic;
        this.popular = popular;
        this.goods = goods;
    }

    public Shop getBasic() {
        return basic;
    }

    public void setBasic(Shop basic) {
        this.basic = basic;
    }

    public int getPopular() {
        return popular;
    }

    public void setPopular(int popular) {
        this.popular = popular;
    }

    public List<Goods> getGoods() {
        return goods;
    }

    public void setGoods(List<Goods> goods) {
        this.goods = goods;
    }
}
