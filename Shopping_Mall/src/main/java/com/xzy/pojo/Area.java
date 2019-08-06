package com.xzy.pojo;

import java.io.Serializable;

/**
 * @author yangxin
 * @date 2019/7/30 - 9:49
 * 地域
 */
public class Area implements Serializable {
    private int id;//每个地域的Id(唯一)
    private String name;//地域的名字
    private String style;//中国是'1',其他是'0'
    private int parentid;//地域的父地域
    private int keyid;//所有地域均为1

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public int getParentid() {
        return parentid;
    }

    public void setParentid(int parentid) {
        this.parentid = parentid;
    }

    public int getKeyid() {
        return keyid;
    }

    public void setKeyid(int keyid) {
        this.keyid = keyid;
    }

    @Override
    public String toString() {
        return "Area{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", style='" + style + '\'' +
                ", parentid=" + parentid +
                ", keyid=" + keyid +
                '}';
    }
}
