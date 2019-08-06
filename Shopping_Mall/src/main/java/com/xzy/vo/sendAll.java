package com.xzy.vo;

import java.io.Serializable;

/**
 * @author WuJiaWei
 * @date 2019/7/30-9:58
 */
public class sendAll implements Serializable
{
    private int goods_Id;
    private String goods_Picture;
    private int goods_Rel_Id;
    private String goods_Name;
    private float goods_Price;
    private String shop_Name;
    private  int goods_Rel_Am;
    private float goods_Rel_Sum;

    public int getGoods_Id() {
        return goods_Id;
    }

    public void setGoods_Id(int goods_Id) {
        this.goods_Id = goods_Id;
    }

    public String getGoods_Picture() {
        return goods_Picture;
    }

    public void setGoods_Picture(String goods_Picture) {
        this.goods_Picture = goods_Picture;
    }

    public int getGoods_Rel_Id() {
        return goods_Rel_Id;
    }

    public void setGoods_Rel_Id(int goods_Rel_Id) {
        this.goods_Rel_Id = goods_Rel_Id;
    }

    public String getGoods_Name() {
        return goods_Name;
    }

    public void setGoods_Name(String goods_Name) {
        this.goods_Name = goods_Name;
    }

    public float getGoods_Price() {
        return goods_Price;
    }

    public void setGoods_Price(float goods_Price) {
        this.goods_Price = goods_Price;
    }

    public String getShop_Name() {
        return shop_Name;
    }

    public void setShop_Name(String shop_Name) {
        this.shop_Name = shop_Name;
    }

    public int getGoods_Rel_Am() {
        return goods_Rel_Am;
    }

    public void setGoods_Rel_Am(int goods_Rel_Am) {
        this.goods_Rel_Am = goods_Rel_Am;
    }

    public float getGoods_Rel_Sum() {
        return goods_Rel_Sum;
    }

    public void setGoods_Rel_Sum(float goods_Rel_Sum) {
        this.goods_Rel_Sum = goods_Rel_Sum;
    }
}
