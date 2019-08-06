package com.xzy.controller;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.internal.util.AlipaySignature;
import com.alipay.api.request.AlipayTradePagePayRequest;
import com.xzy.pojo.*;
import com.xzy.service.imp.OrdersServiceImp;
import com.xzy.utils.AlipayConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@Controller
@RequestMapping(path="/order")
public class OrdersController {
    @Autowired
    OrdersServiceImp ordersService;

    //单点购买  增加模块
    @RequestMapping(path="/add")
    public ModelAndView addOrders(int goods_Id,int ordersItem_Sum,HttpServletRequest request){
        ModelAndView mv=new ModelAndView();
        User user=new User();
        user=(User)request.getSession().getAttribute("user");
        //订单总价
        Orders orders=new Orders();
        if(ordersItem_Sum==0)
            ordersItem_Sum=1;
        if(user==null)
        {
            //没有登录  返回登录
            mv.setViewName("fail");
        }
        else
        {
            Goods goods=new Goods();
            goods=ordersService.findGoodsById(goods_Id);
            System.out.println(goods);
            if(goods.getGoods_Stock()>0)//有库存
            {
                orders=ordersService.addOrders(goods_Id,user.getUser_Id(),ordersItem_Sum);
                mv.addObject("money",orders.getOrders_Mone());
                mv.addObject("orders_Id",orders.getOrders_Id());
                mv.setViewName("topay");
            }
            else//没有库存
            {
                //提示没有库存
            }
        }
        return mv;
    }

    //从购物车中拿到购买商品
    @RequestMapping(path = "/addmore")
    public ModelAndView addCartOrders(int []goods_Rel_Id,HttpServletRequest request)
    {
        ModelAndView mv=new ModelAndView();
        User user=new User();
        user=(User)request.getSession().getAttribute("user");
        //订单总价
        Orders orders=new Orders();
        if(user==null)
        {
            //返回登录页面
            mv.setViewName("fail");
        }
        else
        {
            int user_Id=user.getUser_Id();
            mv.setViewName("topay");
            orders=ordersService.addCartOrders(user_Id,goods_Rel_Id);
            mv.addObject("money",orders.getOrders_Mone());
            mv.addObject("orders_Id",orders.getOrders_Id());
        }
        return mv;
    }

    //删除订单  应该先删除的是该订单对应的订单项
    @RequestMapping(path = "/del")
    public String delOrders(int id){
        if(id>0)
        {
            ordersService.delOrders(id);
        }
        return "success";
    }

    //查询全部订单
    @RequestMapping(path="/getAll")
    public ModelAndView getAllShopAndGoods(int state,HttpServletRequest request){
        User user=(User)request.getSession().getAttribute("user");
        ModelAndView mv=new ModelAndView();
        if(user==null)
        {
            mv.setViewName("fail");
        }

        else
        {
            mv.addObject("OrdersAll",ordersService.getAllShopAndGoods(user.getUser_Id(),state));
            mv.setViewName("success");
        }
        return mv;
    }

    //订单详情页
    @RequestMapping(path = "/details")
    public ModelAndView getOrdersDetails(int orders_Id,HttpServletRequest request){
        User user=(User)request.getSession().getAttribute("user");
        ModelAndView mv=new ModelAndView();
        if(user==null)
        {
            //返回登录界面
            mv.setViewName("fail");
        }
        else{
            mv.addObject(ordersService.getOrdersDetails(orders_Id,user.getUser_Id()));
            mv.setViewName("success");
        }
        return mv;
    }

    //接口调用付款
    @RequestMapping(value = "/goAlipay",produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String goAlipay( HttpServletRequest request, HttpServletResponse response)throws Exception
    {
        //初始化支付宝配置文件
        AlipayClient alipayClient=new DefaultAlipayClient(AlipayConfig.gatewayUrl,AlipayConfig.app_id,AlipayConfig.merchant_private_key,"json",AlipayConfig.charset,AlipayConfig.alipay_public_key,AlipayConfig.sign_type);

        //设置必要的请求参数
        AlipayTradePagePayRequest alipayRequest=new AlipayTradePagePayRequest();
        alipayRequest.setReturnUrl(AlipayConfig.return_url);
        alipayRequest.setNotifyUrl(AlipayConfig.notify_url);

        //设置一些关于订单的请求参数
        //商户订单号，商户网站订单系统中唯一订单号，必填
        String out_trade_no = new String(request.getParameter("WIDout_trade_no").getBytes("ISO-8859-1"),"UTF-8");
        //付款金额，必填
        String total_amount = new String(request.getParameter("WIDtotal_amount").getBytes("ISO-8859-1"),"UTF-8");
        //订单名称，必填
        String subject = new String(request.getParameter("WIDsubject").getBytes("ISO-8859-1"),"UTF-8");
        String timeout_express = "1c";

        //设置最晚支付订单的时间
        alipayRequest.setBizContent("{\"out_trade_no\":\""+ out_trade_no +"\","
                + "\"total_amount\":\""+ total_amount +"\","
                + "\"subject\":\""+ subject +"\","
                + "\"product_code\":\"FAST_INSTANT_TRADE_PAY\"}");

        //请求
        String result = alipayClient.pageExecute(alipayRequest).getBody();
        return result;
    }

    //支护宝的两个回调
    @RequestMapping(path = "/alipayNotifyNotice")
    @ResponseBody
    public String alipayNotifyNotice(HttpServletRequest request) throws AlipayApiException, UnsupportedEncodingException {
        Map<String,String> params = new HashMap<String,String>();
        Map<String,String[]> requestParams = request.getParameterMap();
        for (Iterator<String> iter = requestParams.keySet().iterator(); iter.hasNext();) {
            String name = (String) iter.next();
            String[] values = (String[]) requestParams.get(name);
            String valueStr = "";
            for (int i = 0; i < values.length; i++) {
                valueStr = (i == values.length - 1) ? valueStr + values[i]
                        : valueStr + values[i] + ",";
            }
            //乱码解决，这段代码在出现乱码时使用
            valueStr = new String(valueStr.getBytes("ISO-8859-1"), "utf-8");
            params.put(name, valueStr);
        }

        boolean signVerified = AlipaySignature.rsaCheckV1(params, AlipayConfig.alipay_public_key, AlipayConfig.charset, AlipayConfig.sign_type); //调用SDK验证签名
        if(signVerified) {//验证成功
            //商户订单号
            String out_trade_no = new String(request.getParameter("out_trade_no").getBytes("ISO-8859-1"),"UTF-8");

            //支付宝交易号
            String trade_no = new String(request.getParameter("trade_no").getBytes("ISO-8859-1"),"UTF-8");

            //交易状态
            String trade_status = new String(request.getParameter("trade_status").getBytes("ISO-8859-1"),"UTF-8");

            if(trade_status.equals("TRADE_FINISHED")){
                //判断该笔订单是否在商户网站中已经做过处理
                //如果没有做过处理，根据订单号（out_trade_no）在商户网站的订单系统中查到该笔订单的详细，并执行商户的业务程序
                //如果有做过处理，不执行商户的业务程序

                //注意：
                //退款日期超过可退款期限后（如三个月可退款），支付宝系统发送该交易状态通知
            }else if (trade_status.equals("TRADE_SUCCESS")){
                //判断该笔订单是否在商户网站中已经做过处理
                //如果没有做过处理，根据订单号（out_trade_no）在商户网站的订单系统中查到该笔订单的详细，并执行商户的业务程序
                //如果有做过处理，不执行商户的业务程序

                //注意：
                //付款完成后，支付宝系统发送该交易状态通知
            }

        }else {//验证失败

            //调试用，写文本函数记录程序运行情况是否正常
            //String sWord = AlipaySignature.getSignCheckContentV1(params);
            //AlipayConfig.logResult(sWord);
        }
        return "success";
    }

    @RequestMapping(path = "/alipayReturnNotice")
    public ModelAndView alipayReturnNotice(HttpServletRequest request) throws Exception {
        Map<String,String> params = new HashMap<String,String>();
        Map<String,String[]> requestParams = request.getParameterMap();
        for (Iterator<String> iter = requestParams.keySet().iterator(); iter.hasNext();) {
            String name = (String) iter.next();
            String[] values = (String[]) requestParams.get(name);
            String valueStr = "";
            for (int i = 0; i < values.length; i++) {
                valueStr = (i == values.length - 1) ? valueStr + values[i]
                        : valueStr + values[i] + ",";
            }
            //乱码解决，这段代码在出现乱码时使用
            valueStr = new String(valueStr.getBytes("ISO-8859-1"), "utf-8");
            params.put(name, valueStr);
        }

        boolean signVerified = AlipaySignature.rsaCheckV1(params, AlipayConfig.alipay_public_key, AlipayConfig.charset, AlipayConfig.sign_type); //调用SDK验证签名

        ModelAndView mv=new ModelAndView("paysuccess");
        //——请在这里编写您的程序（以下代码仅作参考）——
        if(signVerified) {
            //商户订单号
            String out_trade_no = new String(request.getParameter("out_trade_no").getBytes("ISO-8859-1"),"UTF-8");

            //支付宝交易号
            String trade_no = new String(request.getParameter("trade_no").getBytes("ISO-8859-1"),"UTF-8");

            //付款金额
            String total_amount = new String(request.getParameter("total_amount").getBytes("ISO-8859-1"),"UTF-8");

            System.out.println("trade_no:"+trade_no+"<br/>out_trade_no:"+out_trade_no+"<br/>total_amount:"+total_amount);

            //修改订单状态
            ordersService.updateOrders(Integer.parseInt(out_trade_no));

        }else {
            System.out.println("验签失败");

        }
        return mv;
    }

    //未支付订单的支付
    @RequestMapping("/nopay")
    public ModelAndView toAlipay(int orders_Id,float money){
        ModelAndView mv=new ModelAndView();
        mv.addObject("orders_Id",orders_Id);
        mv.addObject("money",money);
        mv.setViewName("topay");
        return mv;
    }
    @RequestMapping("/test")
    public void test(int vehicle[],int price){
        System.out.println(vehicle.length);
        for (int i=0;i<vehicle.length;i++)
        {
            System.out.println(vehicle[i]);
        }
        System.out.println(price);
    }

}
