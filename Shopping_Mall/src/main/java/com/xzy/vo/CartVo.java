package com.xzy.vo;

import com.xzy.pojo.Cart;

import java.io.Serializable;
import java.util.List;

/**
 * @author WuJiaWei
 * @date 2019/7/24-15:12
 */
public class CartVo extends Cart implements Serializable
{
    public List<CartCostom> cartCostoms;

    public  List<Integer> goodsIDs;

    public Cart cart;

    public CartCostom cartCostom;

    public List<Integer> getGoodsIDs() {
        return goodsIDs;
    }

    public void setGoodsIDs(List<Integer> goodsIDs) {
        this.goodsIDs = goodsIDs;
    }

    public List<CartCostom> getCartCostoms() {
        return cartCostoms;
    }

    public void setCartCostoms(List<CartCostom> cartCostoms) {
        this.cartCostoms = cartCostoms;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public CartCostom getCartCostom() {
        return cartCostom;
    }

    public void setCartCostom(CartCostom cartCostom) {
        this.cartCostom = cartCostom;
    }
}
