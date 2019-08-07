package com.xzy.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.sql.Date;

/**
 * @author WuJiaWei
 * @date 2019/7/23-23:29
 */
public class Goods_Rel implements Serializable
{
    private int Goods_Rel_Id;
    private int Cart_Id;
    private int Goods_Id;;
    private int Goods_Rel_Am;
    private Date Goods_Rel_Date;
    private float Goods_Rel_Sum;

    public int getGoods_Rel_Id() {
        return Goods_Rel_Id;
    }

    public void setGoods_Rel_Id(int goods_Rel_Id) {
        Goods_Rel_Id = goods_Rel_Id;
    }

    public int getCart_Id() {
        return Cart_Id;
    }

    public void setCart_Id(int cart_Id) {
        Cart_Id = cart_Id;
    }

    public int getGoods_Id() {
        return Goods_Id;
    }

    public void setGoods_Id(int goods_Id) {
        Goods_Id = goods_Id;
    }

    public int getGoods_Rel_Am() {
        return Goods_Rel_Am;
    }

    public void setGoods_Rel_Am(int goods_Rel_Am) {
        Goods_Rel_Am = goods_Rel_Am;
    }

    public Date getGoods_Rel_Date() {
        return Goods_Rel_Date;
    }

    public void setGoods_Rel_Date(Date goods_Rel_Date) {
        Goods_Rel_Date = goods_Rel_Date;
    }

    public float getGoods_Rel_Sum() {
        return Goods_Rel_Sum;
    }

    public void setGoods_Rel_Sum(float goods_Rel_Sum) {
        Goods_Rel_Sum = goods_Rel_Sum;
    }
}
