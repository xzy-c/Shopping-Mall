package com.xzy.vo;

public class OrdersVo {
    private int orders_Id;
    private float orders_Mone;

    public int getOrders_Id() {
        return orders_Id;
    }

    public void setOrders_Id(int orders_Id) {
        this.orders_Id = orders_Id;
    }

    public float getOrders_Mone() {
        return orders_Mone;
    }

    public void setOrders_Mone(float orders_Mone) {
        this.orders_Mone = orders_Mone;
    }

    @Override
    public String toString() {
        return "OrdersVo{" +
                "orders_Id=" + orders_Id +
                ", orders_Mone=" + orders_Mone +
                '}';
    }
}
