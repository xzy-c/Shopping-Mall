package com.xzy.vo;

import java.io.Serializable;

/**
 * @author WuJiaWei
 * @date 2019/7/28-16:48
 */
public class findAllgoods extends CartCostom implements Serializable
{
    public boolean goods_check;
    public float goods_Price;
    public int goods_Id;

    public boolean isGoods_check() {
        return goods_check;
    }

    public void setGoods_check(boolean goods_check) {
        this.goods_check = goods_check;
    }

    public float getGoods_Price() {
        return goods_Price;
    }

    public void setGoods_Price(float goods_Price) {
        this.goods_Price = goods_Price;
    }

    public int getGoods_Id() {
        return goods_Id;
    }

    public void setGoods_Id(int goods_Id) {
        this.goods_Id = goods_Id;
    }
}
