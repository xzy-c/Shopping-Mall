package com.an.bean;

import java.util.Date;

public class User {
    private Integer uid;

    private String uname;

    private Date birthday;

    private Double money;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname == null ? null : uname.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", birthday="
				+ birthday + ", money=" + money + "]";
	}
}