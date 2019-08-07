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
    public List<CartCostom> CartCostoms;

    public  List<Integer> GoodsIDs;

    public Cart Cart;

    public CartCostom CartCostom;

    public List<com.xzy.vo.CartCostom> getCartCostoms() {
        return CartCostoms;
    }

    public void setCartCostoms(List<com.xzy.vo.CartCostom> cartCostoms) {
        CartCostoms = cartCostoms;
    }

    public List<Integer> getGoodsIDs() {
        return GoodsIDs;
    }

    public void setGoodsIDs(List<Integer> goodsIDs) {
        GoodsIDs = goodsIDs;
    }

    public com.xzy.pojo.Cart getCart() {
        return Cart;
    }

    public void setCart(com.xzy.pojo.Cart cart) {
        Cart = cart;
    }

    public com.xzy.vo.CartCostom getCartCostom() {
        return CartCostom;
    }

    public void setCartCostom(com.xzy.vo.CartCostom cartCostom) {
        CartCostom = cartCostom;
    }
}
