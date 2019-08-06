package com.xzy.vo;

import java.util.ArrayList;

public class OrdersAll {
    private ArrayList<OrdersAndGoods> ordersAndGoods=new ArrayList<OrdersAndGoods>();

    public ArrayList<OrdersAndGoods> getOrdersAndGoods() {
        return ordersAndGoods;
    }

    public void setOrdersAndGoods(ArrayList<OrdersAndGoods> ordersAndGoods) {
        this.ordersAndGoods = ordersAndGoods;
    }

    @Override
    public String toString() {
        return "OrdersAll{" +
                "ordersAndGoods=" + ordersAndGoods +
                '}';
    }
}
