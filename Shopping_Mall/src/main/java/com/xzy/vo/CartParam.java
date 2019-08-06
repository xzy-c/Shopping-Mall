package com.xzy.vo;

import com.xzy.pojo.User;

import java.util.Arrays;

public class CartParam {
    private int []goods_Rel_Id;
    //合计价格
    private float money;

    //封装购物车传过来的参数
    //购物车需要传   所购买的商品ID，合计价格，从session里面拿来的user

    //商品ID


    public int[] getGoods_Rel_Id() {
        return goods_Rel_Id;
    }

    public void setGoods_Rel_Id(int[] goods_Rel_Id) {
        this.goods_Rel_Id = goods_Rel_Id;
    }

    public float getMoney() {
        return money;
    }

    public void setMoney(float money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "CartParam{" +
                "goods_Rel_Id=" + Arrays.toString(goods_Rel_Id) +
                ", money=" + money +
                '}';
    }
}
