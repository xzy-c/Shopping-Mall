package com.xzy.vo;

import com.xzy.pojo.Goods;
import com.xzy.pojo.Goods_Rel;
import com.xzy.pojo.Shop;

import java.io.Serializable;
import java.util.List;

/**
 * @author WuJiaWei
 * @date 2019/7/24-14:35
 */
public class CartCostom extends CartVo implements Serializable
{
    //可以添加扩展属性
    public List<Goods> Goods;
    public List<Goods_Rel> Goods_Rels;
    private List<Shop> Shops;
    public String Goods_Name;
    public float Goods_Price;
    public String Goods_Picture;
    public int Goods_Rel_Am;
    public int Goods_Stock;
    public  int User_Id;

    @Override
    public int getUser_Id() {
        return User_Id;
    }

    @Override
    public void setUser_Id(int user_Id) {
        this.User_Id = User_Id;
    }

    public List<com.xzy.pojo.Goods> getGoods() {
        return Goods;
    }

    public void setGoods(List<com.xzy.pojo.Goods> goods) {
        Goods = goods;
    }

    public List<Goods_Rel> getGoods_Rels() {
        return Goods_Rels;
    }

    public void setGoods_Rels(List<Goods_Rel> goods_Rels) {
        Goods_Rels = goods_Rels;
    }

    public List<Shop> getShops() {
        return Shops;
    }

    public void setShops(List<Shop> shops) {
        Shops = shops;
    }

    public String getGoods_Name() {
        return Goods_Name;
    }

    public void setGoods_Name(String goods_Name) {
        Goods_Name = goods_Name;
    }

    public float getGoods_Price() {
        return Goods_Price;
    }

    public void setGoods_Price(float goods_Price) {
        Goods_Price = goods_Price;
    }

    public String getGoods_Picture() {
        return Goods_Picture;
    }

    public void setGoods_Picture(String goods_Picture) {
        Goods_Picture = goods_Picture;
    }

    public int getGoods_Rel_Am() {
        return Goods_Rel_Am;
    }

    public void setGoods_Rel_Am(int goods_Rel_Am) {
        Goods_Rel_Am = goods_Rel_Am;
    }

    public int getGoods_Stock() {
        return Goods_Stock;
    }

    public void setGoods_Stock(int goods_Stock) {
        Goods_Stock = goods_Stock;
    }
}
