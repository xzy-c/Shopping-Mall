package com.xzy.pojo;

import java.io.Serializable;

/**
 * @author yangxin
 * @date 2019/7/27 - 21:15
 * 用户关注商家关联表
 */
public class FoucsShop implements Serializable {
    private int foucsShopId;
    private int user_Id;//用户Id
    private int shop_Id;//商家Id

    public int getFoucsShopId() {
        return foucsShopId;
    }

    public void setFoucsShopId(int foucsShopId) {
        this.foucsShopId = foucsShopId;
    }

    public int getUser_Id() {
        return user_Id;
    }

    public void setUser_Id(int user_Id) {
        this.user_Id = user_Id;
    }

    public int getShop_Id() {
        return shop_Id;
    }

    public void setShop_Id(int shop_Id) {
        this.shop_Id = shop_Id;
    }

    @Override
    public String toString() {
        return "FoucsShop{" +
                "foucsShopId=" + foucsShopId +
                ", user_Id=" + user_Id +
                ", shop_Id=" + shop_Id +
                '}';
    }
}
