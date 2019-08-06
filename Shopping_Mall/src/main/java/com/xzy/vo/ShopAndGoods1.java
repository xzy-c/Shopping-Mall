package com.xzy.vo;

import java.util.ArrayList;

public class ShopAndGoods1 {
    private String shop_Name;
    private ArrayList<GoodsVo> goodsVo=new ArrayList<GoodsVo>();

    public String getShop_Name() {
        return shop_Name;
    }

    public void setShop_Name(String shop_Name) {
        this.shop_Name = shop_Name;
    }

    public ArrayList<GoodsVo> getGoodsVo() {
        return goodsVo;
    }

    public void setGoodsVo(ArrayList<GoodsVo> goodsVo) {
        this.goodsVo = goodsVo;
    }

    @Override
    public String toString() {
        return "ShopAndGoods1{" +
                "shop_Name='" + shop_Name + '\'' +
                ", goodsVo=" + goodsVo +
                '}';
    }
}
