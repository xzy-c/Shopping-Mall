package com.xzy.pojo;

import java.io.Serializable;

/**
 * @author WuJiaWei
 * @date 2019/7/23-23:29
 */
public class Goods implements Serializable
{
    private int Goods_Id;
    private int Small_Cate_ID;
    private String Goods_Name;
    private float Goods_Price;
    private int Goods_ComNumber;
    private String Goods_Picture;
    private String Goods_Descr;
    private int Shop_Id;
    private int Goods_Num;
    private int Goods_Stock;
    private int Goods_Check;

    public int getGoods_Id() {
        return Goods_Id;
    }

    public void setGoods_Id(int goods_Id) {
        Goods_Id = goods_Id;
    }

    public int getSmall_Cate_ID() {
        return Small_Cate_ID;
    }

    public void setSmall_Cate_ID(int small_Cate_ID) {
        Small_Cate_ID = small_Cate_ID;
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

    public int getGoods_ComNumber() {
        return Goods_ComNumber;
    }

    public void setGoods_ComNumber(int goods_ComNumber) {
        Goods_ComNumber = goods_ComNumber;
    }

    public String getGoods_Picture() {
        return Goods_Picture;
    }

    public void setGoods_Picture(String goods_Picture) {
        Goods_Picture = goods_Picture;
    }

    public String getGoods_Descr() {
        return Goods_Descr;
    }

    public void setGoods_Descr(String goods_Descr) {
        Goods_Descr = goods_Descr;
    }

    public int getShop_Id() {
        return Shop_Id;
    }

    public void setShop_Id(int shop_Id) {
        Shop_Id = shop_Id;
    }

    public int getGoods_Num() {
        return Goods_Num;
    }

    public void setGoods_Num(int goods_Num) {
        Goods_Num = goods_Num;
    }

    public int getGoods_Stock() {
        return Goods_Stock;
    }

    public void setGoods_Stock(int goods_Stock) {
        Goods_Stock = goods_Stock;
    }

    public int getGoods_Check() {
        return Goods_Check;
    }

    public void setGoods_Check(int goods_Check) {
        Goods_Check = goods_Check;
    }
}
