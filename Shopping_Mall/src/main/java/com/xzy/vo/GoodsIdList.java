package com.xzy.vo;

import java.util.ArrayList;

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
