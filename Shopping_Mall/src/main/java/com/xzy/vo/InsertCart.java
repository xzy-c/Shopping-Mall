package com.xzy.vo;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

/**
 * @author WuJiaWei
 * @date 2019/7/29-11:10
 */
public class InsertCart implements Serializable
{
    private int Cart_Id;
    private int Goods_Id;
    private int Goods_Rel_Am;
    private Date Good_Rel_Date;
    private int User_Id;
    private List<CartCostom> CartCostoms;

    public int getCart_Id() {
        return Cart_Id;
    }

    public void setCart_Id(int cart_Id) {
        Cart_Id = cart_Id;
    }

    public int getGoods_Id() {
        return Goods_Id;
    }

    public void setGoods_Id(int goods_Id) {
        Goods_Id = goods_Id;
    }

    public int getGoods_Rel_Am() {
        return Goods_Rel_Am;
    }

    public void setGoods_Rel_Am(int goods_Rel_Am) {
        Goods_Rel_Am = goods_Rel_Am;
    }

    public Date getGood_Rel_Date() {
        return Good_Rel_Date;
    }

    public void setGood_Rel_Date(Date good_Rel_Date) {
        Good_Rel_Date = good_Rel_Date;
    }

    public int getUser_Id() {
        return User_Id;
    }

    public void setUser_Id(int user_Id) {
        User_Id = user_Id;
    }

    public List<CartCostom> getCartCostoms() {
        return CartCostoms;
    }

    public void setCartCostoms(List<CartCostom> cartCostoms) {
        CartCostoms = cartCostoms;
    }
}
