package com.xzy.vo;

import java.util.ArrayList;

//某个订单的某个商家的多个商品Id
public class GoodsIdList {
    private ArrayList<Integer> ids=new ArrayList();

    public ArrayList<Integer> getIds() {
        return ids;
    }

    public void setIds(ArrayList<Integer> ids) {
        this.ids = ids;
    }

    @Override
    public String toString() {
        return "GoodsIdList{" +
                "ids=" + ids +
                '}';
    }
}
