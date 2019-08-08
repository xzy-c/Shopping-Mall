package com.xzy.pojo;

public class Goods {

    private int goods_Id;

    private int Small_Cate_ID;

    private String goods_Name;

    private float goods_Price;

    private int goods_ComNumber;

    private String goods_Picture;

    private String goods_Descr;

    private int goods_Stock;

    private int goods_Num;

    private int shop_Id;

    public Goods() {
    }

    public Goods(int goods_Id, int small_Cate_ID, String goods_Name, float goods_Price, int goods_ComNumber, String goods_Picture, String goods_Descr, int goods_Stock, int goods_Num, int shop_Id) {
        this.goods_Id = goods_Id;
        this.Small_Cate_ID = small_Cate_ID;
        this.goods_Name = goods_Name;
        this.goods_Price = goods_Price;
        this.goods_ComNumber = goods_ComNumber;
        this.goods_Picture = goods_Picture;
        this.goods_Descr = goods_Descr;
        this.goods_Stock = goods_Stock;
        this.goods_Num = goods_Num;
        this.shop_Id = shop_Id;
    }

    public int getGoods_Id() {
        return goods_Id;
    }

    public void setGoods_Id(int goods_Id) {
        this.goods_Id = goods_Id;
    }

    public int getSmall_Cate_ID() {
        return Small_Cate_ID;
    }

    public void setSmall_Cate_ID(int small_Cate_ID) {
        this.Small_Cate_ID = small_Cate_ID;
    }

    public String getGoods_Name() {
        return goods_Name;
    }

    public void setGoods_Name(String goods_Name) {
        this.goods_Name = goods_Name;
    }

    public float getGoods_Price() {
        return goods_Price;
    }

    public void setGoods_Price(float goods_Price) {
        this.goods_Price = goods_Price;
    }

    public int getGoods_ComNumber() {
        return goods_ComNumber;
    }

    public void setGoods_ComNumber(int goods_ComNumber) {
        this.goods_ComNumber = goods_ComNumber;
    }

    public String getGoods_Picture() {
        return goods_Picture;
    }

    public void setGoods_Picture(String goods_Picture) {
        this.goods_Picture = goods_Picture;
    }

    public String getGoods_Descr() {
        return goods_Descr;
    }

    public void setGoods_Descr(String goods_Descr) {
        this.goods_Descr = goods_Descr;
    }

    public int getGoods_Stock() {
        return goods_Stock;
    }

    public void setGoods_Stock(int goods_Stock) {
        this.goods_Stock = goods_Stock;
    }

    public int getGoods_Num() {
        return goods_Num;
    }

    public void setGoods_Num(int goods_Num) {
        this.goods_Num = goods_Num;
    }

    public int getShop_Id() {
        return shop_Id;
    }

    public void setShop_Id(int shop_Id) {
        this.shop_Id = shop_Id;
    }
}
