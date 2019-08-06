package com.xzy.vo;

import com.xzy.pojo.FoucsShop;

import java.util.Date;

/**
 * @author yangxin
 * @date 2019/7/27 - 21:18
 */
public class MyFocusShop {
    private int user_Id;//用户Id
    private String user_Name;//用户名称
    private String user_Password;//用户密码
    private String user_Email;//用户邮箱
    private String user_Tel;//用户电话
    private String user_Birth;//用户生日
    private Date user_Creat;//用户注册日期
    private String user_Pic;//用户头像照片
    private String user_Real;//用户真实名称
    private FoucsShop foucsShop;

    public int getUser_Id() {
        return user_Id;
    }

    public void setUser_Id(int user_Id) {
        this.user_Id = user_Id;
    }

    public String getUser_Name() {
        return user_Name;
    }

    public void setUser_Name(String user_Name) {
        this.user_Name = user_Name;
    }

    public String getUser_Password() {
        return user_Password;
    }

    public void setUser_Password(String user_Password) {
        this.user_Password = user_Password;
    }

    public String getUser_Email() {
        return user_Email;
    }

    public void setUser_Email(String user_Email) {
        this.user_Email = user_Email;
    }

    public String getUser_Tel() {
        return user_Tel;
    }

    public void setUser_Tel(String user_Tel) {
        this.user_Tel = user_Tel;
    }

    public String getUser_Birth() {
        return user_Birth;
    }

    public void setUser_Birth(String user_Birth) {
        this.user_Birth = user_Birth;
    }

    public Date getUser_Creat() {
        return user_Creat;
    }

    public void setUser_Creat(Date user_Creat) {
        this.user_Creat = user_Creat;
    }

    public String getUser_Pic() {
        return user_Pic;
    }

    public void setUser_Pic(String user_Pic) {
        this.user_Pic = user_Pic;
    }

    public String getUser_Real() {
        return user_Real;
    }

    public void setUser_Real(String user_Real) {
        this.user_Real = user_Real;
    }

    public FoucsShop getFoucsShop() {
        return foucsShop;
    }

    public void setFoucsShop(FoucsShop foucsShop) {
        this.foucsShop = foucsShop;
    }
}
