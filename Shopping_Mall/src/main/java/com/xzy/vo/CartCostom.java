package com.xzy.vo;

import com.xzy.pojo.goods;
import com.xzy.pojo.goods_rel;
import com.xzy.pojo.shop;

import java.io.Serializable;
import java.util.List;

/**
 * @author WuJiaWei
 * @date 2019/7/24-14:35
 */
public class CartCostom extends CartVo implements Serializable
{
    //可以添加扩展属性
    public List<goods> Goods;
    public List<goods_rel> Goods_rels;
    private List<shop> shops;
    public String goods_Name;
    public float goods_Price;
    public String goods_Picture;
    public int goods_Rel_Am;
    public int goods_Stock;
    public  int user_Id;

    @Override
    public int getUser_Id() {
        return user_Id;
    }

    @Override
    public void setUser_Id(int user_Id) {
        this.user_Id = user_Id;
    }

    public int getGoods_Stock() {
        return goods_Stock;
    }

    public void setGoods_Stock(int goods_Stock) {
        this.goods_Stock = goods_Stock;
    }

    public List<shop> getShops() {
        return shops;
    }

    public void setShops(List<shop> shops) {
        this.shops = shops;
    }

    public List<goods> getGoods() {
        return Goods;
    }

    public void setGoods(List<goods> goods) {
        Goods = goods;
    }

    public List<goods_rel> getGoods_rels() {
        return Goods_rels;
    }

    public void setGoods_rels(List<goods_rel> goods_rels) {
        this.Goods_rels = goods_rels;
    }

    public int getGoods_Rel_Am() {
        return goods_Rel_Am;
    }

    public void setGoods_Rel_Am(int goods_Rel_Am) {
        this.goods_Rel_Am = goods_Rel_Am;
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


    public String getGoods_Picture() {
        return goods_Picture;
    }

    public void setGoods_Picture(String goods_Picture) {
        this.goods_Picture = goods_Picture;
    }
}
