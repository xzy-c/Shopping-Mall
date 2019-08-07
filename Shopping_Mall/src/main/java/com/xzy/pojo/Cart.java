package com.xzy.pojo;

import java.io.Serializable;

public class Cart implements Serializable
{
    private int Cart_Id;

    private int User_Id;

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
}