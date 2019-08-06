package com.xzy.pojo;

import java.io.Serializable;

/**
 * @author yangxin
 * @date 2019/8/5 - 21:21
 * 订单项
 */
public class OrdersItem implements Serializable {
    private int ordersItem_Id;//订单项Id
    private int orders_Id;//订单Id
    private int goods_Id;//商品Id
    private int ordersItem_Sum;//商品购买数量
    private float ordersItem_Sub;//小计

    @Override
    public String toString() {
        return "OrdersItem{" +
                "ordersItem_Id=" + ordersItem_Id +
                ", orders_Id=" + orders_Id +
                ", goods_Id=" + goods_Id +
                ", ordersItem_Sum=" + ordersItem_Sum +
                ", ordersItem_Sub=" + ordersItem_Sub +
                '}';
    }

    public int getOrdersItem_Id() {
        return ordersItem_Id;
    }

    public void setOrdersItem_Id(int ordersItem_Id) {
        this.ordersItem_Id = ordersItem_Id;
    }

    public int getOrders_Id() {
        return orders_Id;
    }

    public void setOrders_Id(int orders_Id) {
        this.orders_Id = orders_Id;
    }

    public int getGoods_Id() {
        return goods_Id;
    }

    public void setGoods_Id(int goods_Id) {
        this.goods_Id = goods_Id;
    }

    public int getOrdersItem_Sum() {
        return ordersItem_Sum;
    }

    public void setOrdersItem_Sum(int ordersItem_Sum) {
        this.ordersItem_Sum = ordersItem_Sum;
    }

    public float getOrdersItem_Sub() {
        return ordersItem_Sub;
    }

    public void setOrdersItem_Sub(float ordersItem_Sub) {
        this.ordersItem_Sub = ordersItem_Sub;
    }
}
