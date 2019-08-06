package com.xzy.pojo;

import java.io.Serializable;

public class Cart implements Serializable
{
    private int cart_Id;

    private int user_Id;

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
}