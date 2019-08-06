package com.xzy.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * @author wangxiaoliang
 * @date 2019/7/28 - 3:25
 */
public class User implements Serializable {
    private int user_Id;
    private String user_Name;
    private String user_Password;
    private String user_Email;
    private String user_Tel;
    private Date user_Birth;
    private Date user_Creat; //注册时间
    private String user_Pic;   //头像图片地址
    private String user_Real;  //真实姓名

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

    public Date getUser_Birth() {
        return user_Birth;
    }

    public void setUser_Birth(Date user_Birth) {
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

}
