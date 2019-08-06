package com.xzy.service.base;

import com.xzy.pojo.*;
import com.xzy.vo.CartParam;
import com.xzy.vo.Orderdetails;
import com.xzy.vo.OrdersAll;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public interface OrdersService {

    //查询库存
    public Goods findGoodsById(int goods_Id);

    //单点增加订单
    public Orders addOrders(int goods_Id,int user_Id,int ordersItem_Sum);

    //批量生成订单
    public Orders addCartOrders(int user_Id,int []goods_Rel_Id);

    //查询订单
    public OrdersAll getAllShopAndGoods(int user_id,int state);

    //删除订单表
    public void delOrders(int id);

    //订单详情页
    public Orderdetails getOrdersDetails(int orders_Id,int user_Id);

    //修改支付状态
    public void updateOrders(int orders_Id);

}
