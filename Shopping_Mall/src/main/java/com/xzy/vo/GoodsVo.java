package com.xzy.vo;

//单个订单中单个商家的某个商品的信息
public class GoodsVo {
    private int goods_Id;//商品Id
    private String goods_Name;//商品名称
    private String goods_Picture;//商品图片
    private String goods_Price;//商品价格
    private int goods_Num;//商品数量

    public int getGoods_Num() {
        return goods_Num;
    }

    public void setGoods_Num(int goods_Num) {
        this.goods_Num = goods_Num;
    }

    public int getGoods_Id() {
        return goods_Id;
    }

    public void setGoods_Id(int goods_Id) {
        this.goods_Id = goods_Id;
    }

    public String getGoods_Name() {
        return goods_Name;
    }

    public void setGoods_Name(String goods_Name) {
        this.goods_Name = goods_Name;
    }

    public String getGoods_Picture() {
        return goods_Picture;
    }

    public void setGoods_Picture(String goods_Picture) {
        this.goods_Picture = goods_Picture;
    }

    public String getGoods_Price() {
        return goods_Price;
    }

    public void setGoods_Price(String goods_Price) {
        this.goods_Price = goods_Price;
    }

    @Override
    public String toString() {
        return "GoodsVo{" +
                "goods_Id=" + goods_Id +
                ", goods_Name='" + goods_Name + '\'' +
                ", goods_Picture='" + goods_Picture + '\'' +
                ", goods_Price='" + goods_Price + '\'' +
                '}';
    }
}
