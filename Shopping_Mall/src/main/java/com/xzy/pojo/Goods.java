package com.xzy.pojo;


import java.io.Serializable;

/**
 * @author yangxin
 * @date 2019/7/26 - 12:09
 * 商品
 */
public class Goods implements Serializable {
    private int goods_Id;//商品Id
    private int Small_Cate_ID;//二级分类
    private String goods_Name;//商品名称
    private float goods_Price;//商品单价
    private int goods_ComNumber;//商品评论数
    private String goods_Picture;//商品图片
    private String goods_Descr;//商品描述
    private int goods_Stock;//商品库存量
    private int goods_Num;//商品成交量
    private int shop_Id;//商家Id

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
        Small_Cate_ID = small_Cate_ID;
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

    public int getShp_Id() {
        return shop_Id;
    }

    public void setShp_Id(int shp_Id) {
        this.shop_Id = shp_Id;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "goods_Id=" + goods_Id +
                ", Small_Cate_ID=" + Small_Cate_ID +
                ", goods_Name='" + goods_Name + '\'' +
                ", goods_Price=" + goods_Price +
                ", goods_ComNumber=" + goods_ComNumber +
                ", goods_Picture='" + goods_Picture + '\'' +
                ", goods_Descr='" + goods_Descr + '\'' +
                ", goods_Stock=" + goods_Stock +
                ", goods_Num=" + goods_Num +
                ", shop_Id=" + shop_Id +
                '}';
    }
}
