package com.xzy.vo;

import java.io.Serializable;

/**
 * @author WuJiaWei
 * @date 2019/7/27-16:01
 */
public class CatId extends CartCostom implements Serializable
{
    private int Cart_Id;

    public int getCart_Id() {
        return Cart_Id;
    }

    public void setCart_Id(int cart_Id) {
        Cart_Id = cart_Id;
    }
}
