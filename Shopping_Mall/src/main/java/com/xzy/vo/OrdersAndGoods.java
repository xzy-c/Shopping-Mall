package com.xzy.vo;

import java.util.ArrayList;

//某一个完整的订单
public class OrdersAndGoods {
    //封装订单
    private OrdersVo ordersVo;
    //某一个订单中的商家以及商品链
    private ArrayList<ShopAndGoods1> shopAndGoods=new ArrayList<ShopAndGoods1>();

    public OrdersVo getOrdersVo() {
        return ordersVo;
    }

    public void setOrdersVo(OrdersVo ordersVo) {
        this.ordersVo = ordersVo;
    }

    public ArrayList<ShopAndGoods1> getShopAndGoods() {
        return shopAndGoods;
    }

    public void setShopAndGoods(ArrayList<ShopAndGoods1> shopAndGoods) {
        this.shopAndGoods = shopAndGoods;
    }

    @Override
    public String toString() {
        return "OrdersAndGoods{" +
                "ordersVo=" + ordersVo +
                ", shopAndGoods=" + shopAndGoods +
                '}';
    }
}
