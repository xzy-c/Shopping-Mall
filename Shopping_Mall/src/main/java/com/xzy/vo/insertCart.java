package com.xzy.vo;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

/**
 * @author WuJiaWei
 * @date 2019/7/29-11:10
 */
public class insertCart implements Serializable
{
    private int cart_Id;
    private int goods_Id;
    private int goods_Rel_Am;
    private Date good_Rel_Date;
    private int user_Id;
    private List<CartCostom> cartCostoms;

    public List<CartCostom> getCartCostoms() {
        return cartCostoms;
    }

    public void setCartCostoms(List<CartCostom> cartCostoms) {
        this.cartCostoms = cartCostoms;
    }

    public int getUser_Id() {
        return user_Id;
    }

    public void setUser_Id(int user_Id) {
        this.user_Id = user_Id;
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

    public Date getGood_Rel_Date() {
        return good_Rel_Date;
    }

    public void setGood_Rel_Date(Date good_Rel_Date) {
        this.good_Rel_Date = good_Rel_Date;
    }
}
