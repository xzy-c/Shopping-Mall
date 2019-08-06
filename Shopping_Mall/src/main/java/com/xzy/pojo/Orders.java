package com.xzy.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * @author yangxin
 * @date 2019/8/5 - 21:25
 * 订单
 */
public class Orders implements Serializable {
    private int orders_Id;//订单id
    private int user_Id;//用户id
    private int user_Addr_Id;//用户地址id
    private int orders_Apply;//用户支付状态
    private float orders_Mone;//总金额
    private Date orders_Date;//订单提交时间
    private int orders_Dis;//评论状态
    private int orders_Subs;//代付状态

    public int getOrders_Id() {
        return orders_Id;
    }

    public void setOrders_Id(int orders_Id) {
        this.orders_Id = orders_Id;
    }

    public int getUser_Id() {
        return user_Id;
    }

    public void setUser_Id(int user_Id) {
        this.user_Id = user_Id;
    }

    public int getUser_Addr_Id() {
        return user_Addr_Id;
    }

    public void setUser_Addr_Id(int user_Addr_Id) {
        this.user_Addr_Id = user_Addr_Id;
    }

    public int getOrders_Apply() {
        return orders_Apply;
    }

    public void setOrders_Apply(int orders_Apply) {
        this.orders_Apply = orders_Apply;
    }

    public float getOrders_Mone() {
        return orders_Mone;
    }

    public void setOrders_Mone(float orders_Mone) {
        this.orders_Mone = orders_Mone;
    }

    public Date getOrders_Date() {
        return orders_Date;
    }

    public void setOrders_Date(Date orders_Date) {
        this.orders_Date = orders_Date;
    }

    public int getOrders_Dis() {
        return orders_Dis;
    }

    public void setOrders_Dis(int orders_Dis) {
        this.orders_Dis = orders_Dis;
    }

    public int getOrders_Subs() {
        return orders_Subs;
    }

    public void setOrders_Subs(int orders_Subs) {
        this.orders_Subs = orders_Subs;
    }


    @Override
    public String toString() {
        return "Orders{" +
                "orders_Id=" + orders_Id +
                ", user_Id=" + user_Id +
                ", user_Addr_Id=" + user_Addr_Id +
                ", orders_Apply=" + orders_Apply +
                ", orders_Mone=" + orders_Mone +
                ", orders_Date=" + orders_Date +
                ", orders_Dis=" + orders_Dis +
                ", orders_Subs=" + orders_Subs +
                '}';
    }
}