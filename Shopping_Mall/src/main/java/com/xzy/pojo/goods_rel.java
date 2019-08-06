package com.xzy.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.sql.Date;

/**
 * @author WuJiaWei
 * @date 2019/7/23-23:29
 */
public class goods_rel implements Serializable
{
    private int goods_Rel_Id;
    private int cart_Id;
    private int goods_Id;;
    private int goods_Rel_Am;
    private Date goods_Rel_Date;
    private float goods_Rel_Sum;

    public float getGoods_Rel_Sum() {
        return goods_Rel_Sum;
    }

    public void setGoods_Rel_Sum(float goods_Rel_Sum) {
        this.goods_Rel_Sum = goods_Rel_Sum;
    }

    public int getGoods_Rel_Am() {
        return goods_Rel_Am;
    }

    public void setGoods_Rel_Am(int goods_Rel_Am) {
        this.goods_Rel_Am = goods_Rel_Am;
    }

    public Date getGoods_Rel_Date() {
        return goods_Rel_Date;
    }

    public void setGoods_Rel_Date(Date goods_Rel_Date) {
        this.goods_Rel_Date = goods_Rel_Date;
    }

    public int getGoods_Rel_Id() {
        return goods_Rel_Id;
    }

    public void setGoods_Rel_Id(int goods_Rel_Id) {
        this.goods_Rel_Id = goods_Rel_Id;
    }

    public int getCart_Id() {
        return cart_Id;
    }

    public void setCart_Id(int cart_Id) {
        this.cart_Id = cart_Id;
    }

    public int getGoods_Id() {
        return goods_Id;
    }

    public void setGoods_Id(int goods_Id) {
        this.goods_Id = goods_Id;
    }

}
