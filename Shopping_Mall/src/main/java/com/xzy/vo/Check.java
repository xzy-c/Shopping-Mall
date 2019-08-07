package com.xzy.vo;

import java.io.Serializable;

/**
 * @author WuJiaWei
 * @date 2019/7/29-14:17
 */
public class Check implements Serializable
{
    private int Cart_Id;
    private int User_Id;
    private int Goods_Id;
    private boolean Goods_Check;

    public int getCart_Id() {
        return Cart_Id;
    }

    public void setCart_Id(int cart_Id) {
        Cart_Id = cart_Id;
    }

    public int getUser_Id() {
        return User_Id;
    }

    public void setUser_Id(int user_Id) {
        User_Id = user_Id;
    }

    public int getGoods_Id() {
        return Goods_Id;
    }

    public void setGoods_Id(int goods_Id) {
        Goods_Id = goods_Id;
    }

    public boolean isGoods_Check() {
        return Goods_Check;
    }

    public void setGoods_Check(boolean goods_Check) {
        Goods_Check = goods_Check;
    }
}
