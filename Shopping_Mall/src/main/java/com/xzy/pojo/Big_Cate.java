package com.xzy.pojo;

import java.io.Serializable;

/**
 * @author wangxiaoliang
 * @date 2019/7/24 - {TIME}
 */
public class Big_Cate implements Serializable{
    private int Big_Cate_ID;
    private String Big_Cate_Name;

    public int getBig_Cate_ID() {
        return Big_Cate_ID;
    }

    public void setBig_Cate_ID(int big_Cate_ID) {
        Big_Cate_ID = big_Cate_ID;
    }

    public String getBig_Cate_Name() {
        return Big_Cate_Name;
    }

    public void setBig_Cate_Name(String big_Cate_Name) {
        Big_Cate_Name = big_Cate_Name;
    }
}
