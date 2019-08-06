package com.xzy.vo;

import com.xzy.pojo.goods;

import java.io.Serializable;

/**
 * @author WuJiaWei
 * @date 2019/7/28-17:33
 */
public class Need extends goods implements Serializable
{
    public String goods_Name;
    public float goods_Price;
    public String goods_Picture;

    public float getGoods_Price() {
        return goods_Price;
    }

    public void setGoods_Price(float goods_Price) {
        this.goods_Price = goods_Price;
    }

    public String getGoods_Picture() {
        return goods_Picture;
    }

    public void setGoods_Picture(String goods_Picture) {
        this.goods_Picture = goods_Picture;
    }

    public String getGoods_Name() {
        return goods_Name;
    }

    public void setGoods_Name(String goods_Name) {
        this.goods_Name = goods_Name;
    }
}
