package com.xzy.vo;

import com.xzy.pojo.goods_rel;

import java.io.Serializable;

/**
 * @author WuJiaWei
 * @date 2019/7/29-16:37
 */
public class ChangeNum extends goods_rel implements Serializable
{
    private int goods_Rel_Am;
    private int goods_Id;
    private int cart_Id;

    public int getGoods_Rel_Am() {
        return goods_Rel_Am;
    }

    public void setGoods_Rel_Am(int goods_Rel_Am) {
        this.goods_Rel_Am = goods_Rel_Am;
    }

    public int getGoods_Id() {
        return goods_Id;
    }

    public void setGoods_Id(int goods_Id) {
        this.goods_Id = goods_Id;
    }

    public int getCart_Id() {
        return cart_Id;
    }

    public void setCart_Id(int cart_Id) {
        this.cart_Id = cart_Id;
    }
}
