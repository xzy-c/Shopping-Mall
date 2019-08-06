package com.xzy.pojo;

public class Goods_Rel {
    private int goods_Rel_Id;
    private int cart_Id;
    private int goods_Id;
    private int goods_Rel_Am;

    public int getGoods_Rel_Id() {
        return goods_Rel_Id;
    }

    public void setGoods_Rel_Id(int goods_Rel_Id) {
        this.goods_Rel_Id = goods_Rel_Id;
    }

    public int getCart_Id() {
        return cart_Id;
    }

    public void setCart_Id(int cart_Id) {
        this.cart_Id = cart_Id;
    }

    public int getGoods_Id() {
        return goods_Id;
    }

    public void setGoods_Id(int goods_Id) {
        this.goods_Id = goods_Id;
    }

    public int getGoods_Rel_Am() {
        return goods_Rel_Am;
    }

    public void setGoods_Rel_Am(int goods_Rel_Am) {
        this.goods_Rel_Am = goods_Rel_Am;
    }

    @Override
    public String toString() {
        return "Goods_Rel{" +
                "goods_Rel_Id=" + goods_Rel_Id +
                ", cart_Id=" + cart_Id +
                ", goods_Id=" + goods_Id +
                ", goods_Rel_Am=" + goods_Rel_Am +
                '}';
    }
}
