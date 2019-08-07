package com.xzy.vo;

import com.xzy.pojo.Goods;


import java.io.Serializable;

/**
 * @author WuJiaWei
 * @date 2019/7/28-17:33
 */
public class Need extends Goods implements Serializable
{
    public String Goods_Name;
    public float Goods_Price;
    public String Goods_Picture;

    @Override
    public String getGoods_Name() {
        return Goods_Name;
    }

    @Override
    public void setGoods_Name(String goods_Name) {
        Goods_Name = goods_Name;
    }

    @Override
    public float getGoods_Price() {
        return Goods_Price;
    }

    @Override
    public void setGoods_Price(float goods_Price) {
        Goods_Price = goods_Price;
    }

    @Override
    public String getGoods_Picture() {
        return Goods_Picture;
    }

    @Override
    public void setGoods_Picture(String goods_Picture) {
        Goods_Picture = goods_Picture;
    }
}
