package com.xzy.pojo;

import java.io.Serializable;

/**
 * @author wangxiaoliang
 * @date 2019/7/24 - {TIME}
 */
public class Small_Cate implements Serializable {
    private int Small_Cate_ID;
    private int Big_Cate_ID;
    private String Small_Cate_Name;

    public int getSmall_Cate_ID() {
        return Small_Cate_ID;
    }

    public void setSmall_Cate_ID(int small_Cate_ID) {
        Small_Cate_ID = small_Cate_ID;
    }

    public int getBig_Cate_ID() {
        return Big_Cate_ID;
    }

    public void setBig_Cate_ID(int big_Cate_ID) {
        Big_Cate_ID = big_Cate_ID;
    }

    public String getSmall_Cate_Name() {
        return Small_Cate_Name;
    }

    public void setSmall_Cate_Name(String small_Cate_Name) {
        Small_Cate_Name = small_Cate_Name;
    }
}
