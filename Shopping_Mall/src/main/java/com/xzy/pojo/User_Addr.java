package com.xzy.pojo;

import java.io.Serializable;

/**
 * @author yangxin
 * @date 2019/7/26 - 12:39
 * 用户的收货地址
 */
public class User_Addr implements Serializable {
    private int user_Addr_Id;//用户收货地址Id
    private int user_Id;//用户Id
    private String user_Addr_Name;//收货人姓名
    private String user_Addr_Num;//收货人电话
    private String user_Address;//用户详细地址
    private String user_Addr_Pcode;//用户邮编
    private String user_Addr_Defaddr;//用户默认地址
    private String user_Addr_Pro;//用户地址所在省
    private String user_Addr_City;//用户所在市
    private String user_Addr_County;//用户所在区/县

    public int getUser_Addr_Id() {
        return user_Addr_Id;
    }

    public void setUser_Addr_Id(int user_Addr_Id) {
        this.user_Addr_Id = user_Addr_Id;
    }

    public int getUser_Id() {
        return user_Id;
    }

    public void setUser_Id(int user_Id) {
        this.user_Id = user_Id;
    }

    public String getUser_Addr_Name() {
        return user_Addr_Name;
    }

    public void setUser_Addr_Name(String user_Addr_Name) {
        this.user_Addr_Name = user_Addr_Name;
    }

    public String getUser_Addr_Num() {
        return user_Addr_Num;
    }

    public void setUser_Addr_Num(String user_Addr_Num) {
        this.user_Addr_Num = user_Addr_Num;
    }

    public String getUser_Address() {
        return user_Address;
    }

    public void setUser_Address(String user_Address) {
        this.user_Address = user_Address;
    }

    public String getUser_Addr_Pcode() {
        return user_Addr_Pcode;
    }

    public void setUser_Addr_Pcode(String user_Addr_Pcode) {
        this.user_Addr_Pcode = user_Addr_Pcode;
    }

    public String getUser_Addr_Defaddr() {
        return user_Addr_Defaddr;
    }

    public void setUser_Addr_Defaddr(String user_Addr_Defaddr) {
        this.user_Addr_Defaddr = user_Addr_Defaddr;
    }

    public String getUser_Addr_Pro(String phidden) {
        return user_Addr_Pro;
    }

    public void setUser_Addr_Pro(String user_Addr_Pro) {
        this.user_Addr_Pro = user_Addr_Pro;
    }

    public String getUser_Addr_City() {
        return user_Addr_City;
    }

    public void setUser_Addr_City(String user_Addr_City) {
        this.user_Addr_City = user_Addr_City;
    }

    public String getUser_Addr_County() {
        return user_Addr_County;
    }

    public void setUser_Addr_County(String user_Addr_County) {
        this.user_Addr_County = user_Addr_County;
    }

    @Override
    public String toString() {
        return "User_Addr{" +
                "user_Addr_Id=" + user_Addr_Id +
                ", user_Id=" + user_Id +
                ", user_Addr_Name='" + user_Addr_Name + '\'' +
                ", user_Addr_Num='" + user_Addr_Num + '\'' +
                ", user_Address='" + user_Address + '\'' +
                ", user_Addr_Pcode='" + user_Addr_Pcode + '\'' +
                ", user_Addr_Defaddr='" + user_Addr_Defaddr + '\'' +
                ", user_Addr_Pro='" + user_Addr_Pro + '\'' +
                ", user_Addr_City='" + user_Addr_City + '\'' +
                ", user_Addr_County='" + user_Addr_County + '\'' +
                '}';
    }
}
