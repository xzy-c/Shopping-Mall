package com.xzy.vo;

import java.io.Serializable;

/**
 * @author WuJiaWei
 * @date 2019/7/28-16:48
 */
public class RindAllgoods extends CartCostom implements Serializable
{
    public boolean Goods_Check;
    public float Goods_Price;
    public int Goods_Id;

    public boolean isGoods_Check() {
        return Goods_Check;
    }

    public void setGoods_Check(boolean goods_Check) {
        Goods_Check = goods_Check;
    }

    @Override
    public float getGoods_Price() {
        return Goods_Price;
    }

    @Override
    public void setGoods_Price(float goods_Price) {
        Goods_Price = goods_Price;
    }

    public int getGoods_Id() {
        return Goods_Id;
    }

    public void setGoods_Id(int goods_Id) {
        Goods_Id = goods_Id;
    }
}
