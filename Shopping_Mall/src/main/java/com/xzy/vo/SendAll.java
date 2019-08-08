package com.xzy.vo;

import java.io.Serializable;

/**
 * @author WuJiaWei
 * @date 2019/7/30-9:58
 */
public class SendAll implements Serializable
{
    private int Goods_Id;
    private String Goods_Picture;
    private int Goods_Rel_Id;
    private String Goods_Name;
    private float Goods_Price;
    private String Shop_Name;
    private  int Goods_Rel_Am;
    private float Goods_Rel_Sum;

    public int getGoods_Id() {
        return Goods_Id;
    }

    public void setGoods_Id(int goods_Id) {
        Goods_Id = goods_Id;
    }

    public String getGoods_Picture() {
        return Goods_Picture;
    }

    public void setGoods_Picture(String goods_Picture) {
        Goods_Picture = goods_Picture;
    }

    public int getGoods_Rel_Id() {
        return Goods_Rel_Id;
    }

    public void setGoods_Rel_Id(int goods_Rel_Id) {
        Goods_Rel_Id = goods_Rel_Id;
    }

    public String getGoods_Name() {
        return Goods_Name;
    }

    public void setGoods_Name(String goods_Name) {
        Goods_Name = goods_Name;
    }

    public float getGoods_Price() {
        return Goods_Price;
    }

    public void setGoods_Price(float goods_Price) {
        Goods_Price = goods_Price;
    }

    public String getShop_Name() {
        return Shop_Name;
    }

    public void setShop_Name(String shop_Name) {
        Shop_Name = shop_Name;
    }

    public int getGoods_Rel_Am() {
        return Goods_Rel_Am;
    }

    public void setGoods_Rel_Am(int goods_Rel_Am) {
        Goods_Rel_Am = goods_Rel_Am;
    }

    public float getGoods_Rel_Sum() {
        return Goods_Rel_Sum;
    }

    public void setGoods_Rel_Sum(float goods_Rel_Sum) {
        Goods_Rel_Sum = goods_Rel_Sum;
    }
}
