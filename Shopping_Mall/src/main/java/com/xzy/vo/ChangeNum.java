package com.xzy.vo;

import com.xzy.pojo.Goods_Rel;


import java.io.Serializable;

/**
 * @author WuJiaWei
 * @date 2019/7/29-16:37
 */
public class ChangeNum extends Goods_Rel implements Serializable
{
    private int Goods_Rel_Am;
    private int Goods_Id;
    private int Cart_Id;

    @Override
    public int getGoods_Rel_Am() {
        return Goods_Rel_Am;
    }

    @Override
    public void setGoods_Rel_Am(int goods_Rel_Am) {
        Goods_Rel_Am = goods_Rel_Am;
    }

    @Override
    public int getGoods_Id() {
        return Goods_Id;
    }

    @Override
    public void setGoods_Id(int goods_Id) {
        Goods_Id = goods_Id;
    }

    @Override
    public int getCart_Id() {
        return Cart_Id;
    }

    @Override
    public void setCart_Id(int cart_Id) {
        Cart_Id = cart_Id;
    }
}
