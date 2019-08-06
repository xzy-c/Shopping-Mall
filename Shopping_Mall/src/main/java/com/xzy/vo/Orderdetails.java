package com.xzy.vo;

import com.xzy.pojo.User_Addr;

import java.util.ArrayList;

public class Orderdetails {
    private User_Addr user_Addr;
    private ArrayList<ShopAndGoods1> shopAndGoods=new ArrayList<ShopAndGoods1>();

    public User_Addr getUser_Addr() {
        return user_Addr;
    }

    public void setUser_Addr(User_Addr user_Addr) {
        this.user_Addr = user_Addr;
    }

    public ArrayList<ShopAndGoods1> getShopAndGoods() {
        return shopAndGoods;
    }

    public void setShopAndGoods(ArrayList<ShopAndGoods1> shopAndGoods) {
        this.shopAndGoods = shopAndGoods;
    }

    @Override
    public String toString() {
        return "Orderdetails{" +
                "user_Addr=" + user_Addr +
                ", shopAndGoods=" + shopAndGoods +
                '}';
    }
}
