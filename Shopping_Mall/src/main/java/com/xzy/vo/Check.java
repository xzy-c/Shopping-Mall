package com.xzy.vo;

import java.io.Serializable;

/**
 * @author WuJiaWei
 * @date 2019/7/29-14:17
 */
public class Check implements Serializable
{
    private int cart_Id;
    private int user_Id;
    private int goods_Id;
    private boolean goods_Check;

    public boolean isGoods_Check() {
        return goods_Check;
    }

    public void setGoods_Check(boolean goods_Check) {
        this.goods_Check = goods_Check;
    }

    public int getCart_Id() {
        return cart_Id;
    }

    public void setCart_Id(int cart_Id) {
        this.cart_Id = cart_Id;
    }

    public int getUser_Id() {
        return user_Id;
    }

    public void setUser_Id(int user_Id) {
        this.user_Id = user_Id;
    }

    public int getGoods_Id() {
        return goods_Id;
    }

    public void setGoods_Id(int goods_Id) {
        this.goods_Id = goods_Id;
    }
}
