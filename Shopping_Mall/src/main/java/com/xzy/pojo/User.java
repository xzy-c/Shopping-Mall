package com.xzy.pojo;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    private int user_Id;
    private String user_Name;
    private String user_Password;
    private String user_Email;
    private String user_Tel;
    private Date user_Birth;
    private Date user_Creat;
    private String user_Pic;
    private String user_Real;

    public String getUser_Password() {
        return user_Password;
    }

    public void setUser_Password(String user_Password) {
        this.user_Password = user_Password;
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

    public String getUser_Tel() {
        return user_Tel;
    }

    public void setUser_Tel(String user_Tel) {
        this.user_Tel = user_Tel;
    }

    public String getUser_Email() {
        return user_Email;
    }

    public void setUser_Email(String user_Email) {
        this.user_Email = user_Email;
    }
}
