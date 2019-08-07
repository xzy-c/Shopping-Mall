package com.xzy.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * @author WuJiaWei
 * @date 2019/7/24-10:02
 */
public class User implements Serializable
{
    private int User_Id;
    private String User_Name;
    private String User_Password;
    private String User_Email;
    private String User_Tel;
    private Date User_Birth;
    private Date User_Creat;
    private String User_Pic;
    private String User_Real;

    public int getUser_Id() {
        return User_Id;
    }

    public void setUser_Id(int user_Id) {
        User_Id = user_Id;
    }

    public String getUser_Name() {
        return User_Name;
    }

    public void setUser_Name(String user_Name) {
        User_Name = user_Name;
    }

    public String getUser_Password() {
        return User_Password;
    }

    public void setUser_Password(String user_Password) {
        User_Password = user_Password;
    }

    public String getUser_Email() {
        return User_Email;
    }

    public void setUser_Email(String user_Email) {
        User_Email = user_Email;
    }

    public String getUser_Tel() {
        return User_Tel;
    }

    public void setUser_Tel(String user_Tel) {
        User_Tel = user_Tel;
    }

    public Date getUser_Birth() {
        return User_Birth;
    }

    public void setUser_Birth(Date user_Birth) {
        User_Birth = user_Birth;
    }

    public Date getUser_Creat() {
        return User_Creat;
    }

    public void setUser_Creat(Date user_Creat) {
        User_Creat = user_Creat;
    }

    public String getUser_Pic() {
        return User_Pic;
    }

    public void setUser_Pic(String user_Pic) {
        User_Pic = user_Pic;
    }

    public String getUser_Real() {
        return User_Real;
    }

    public void setUser_Real(String user_Real) {
        User_Real = user_Real;
    }
}
