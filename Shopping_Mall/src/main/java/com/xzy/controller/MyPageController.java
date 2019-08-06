package com.xzy.controller;

import com.alibaba.fastjson.JSON;
import com.xzy.utils.FileUpLodeUtil;
import com.xzy.vo.*;
import com.xzy.pojo.Goods;
import com.xzy.pojo.Shop;
import com.xzy.pojo.User;
import com.xzy.pojo.User_Addr;
import com.xzy.service.base.MyPageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.util.*;

/**
 * @author yangxin
 * @date 2019/7/26 - 22:44
 * 我的页面模块
 */

@Controller
@RequestMapping("/mypage")
public class MyPageController {

    @Autowired
    private MyPageService myPageService;

    //展示我的首页(头像+姓名+我的订单)
    @RequestMapping(value = {"/getUser"},method = RequestMethod.GET)
    //@ResponseBody ,produces = "application/json;charset=UTF-8",method = RequestMethod.POST
    public ModelAndView  getUser(HttpServletRequest request){
        User user=(User)request.getSession().getAttribute("user");
        //int state,
        ModelAndView mv=new ModelAndView();
        if(user==null)
        {
            mv.setViewName("msg");
        }
        //User user=new User();
        //user.setUser_Id(1);
        int goodsCount = 0,shopCount=0,couponCount=0,addrCount=0;
        //int state=0;
        try {
            goodsCount=myPageService.getGoodsCount(user);
            shopCount=myPageService.getShopCount(user);
            couponCount=myPageService.getCouponCount(user);
            addrCount=myPageService.getAddrCount(user);
            //查询用户的所有订单
            OrdersAll ordersAll = myPageService.getAllShopAndGoods(user.getUser_Id());
            //获取用户所有订单
            ArrayList<OrdersAndGoods> ordersAndGoods = ordersAll.getOrdersAndGoods();
            //获取用户单个订单
            for (OrdersAndGoods ordersAndGoods1:ordersAndGoods){
                System.out.println("订单Id"+ordersAndGoods1.getOrdersVo().getOrders_Id()
                        +"订单总价"+ordersAndGoods1.getOrdersVo().getOrders_Mone());
                //单个订单单个商家的商品
                ArrayList<ShopAndGoods1> shopAndGoods = ordersAndGoods1.getShopAndGoods();
                for (ShopAndGoods1 shopAndGoods1:shopAndGoods
                     ) {
                    System.out.println("商家名称"+shopAndGoods1.getShop_Name());
                    ArrayList<GoodsVo> goodsVo = shopAndGoods1.getGoodsVo();
                    for (GoodsVo goodsVo1:goodsVo
                         ) {
                        System.out.println("商品名称"+goodsVo1.getGoods_Name());
                        System.out.println("商品图片"+goodsVo1.getGoods_Picture());
                        System.out.println("商品价格"+goodsVo1.getGoods_Price());
                        System.out.println("商品Id"+goodsVo1.getGoods_Id());
                        System.out.println("商品购买的数量"+goodsVo1.getGoods_Num());
                    }
                }
                System.out.println("---------------------------");
            }
            mv.addObject("OrdersAll",ordersAll);
        } catch (Exception e) {
            e.printStackTrace();
        }
        mv.addObject("userInfo", user);
        mv.addObject("gCount", goodsCount);
        mv.addObject("sCount", shopCount);
        mv.addObject("cCount", couponCount);
        mv.addObject("aCount", addrCount);
        return mv;
    }


    //获取用户收藏的商品
    @RequestMapping("/getGoods")
    public String getLoveGoods(HttpServletRequest request,Model model){
        List<Goods> myGoods= null;
        try {
            User user = (User)request.getSession().getAttribute("user");
            List<MyFocusGoods> list=myPageService.getUserFocusGood(user);
            List<Integer> goodsIds=new ArrayList<>();
            for (MyFocusGoods myFocusGoods :list
            ) {
                int shop_id = myFocusGoods.getGoods().getGoods_Id();
                goodsIds.add(shop_id);
            }
            myGoods = myPageService.getUserFocusGoods(goodsIds);
        } catch (Exception e) {
            e.printStackTrace();
        }
        model.addAttribute("list", myGoods);
        return "msg";
    }

    //删除用户收藏的商品,当删除后再转到用户收藏的商品的url再次进行查询在返回前端页面
    @RequestMapping("/delGoods")
    public String delLoveGood(int goods_Id,HttpServletRequest request){
        try {
            User user = (User)request.getSession().getAttribute("user");
            int user_Id=user.getUser_Id();
            Map map=new HashMap();
            map.put("user_Id",user_Id);
            map.put("goods_Id",goods_Id );
            myPageService.delLoveGood(map);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "msg";
    }

    //获取用户关注的商家
    @RequestMapping("getShops")
    public String getLoveShop(HttpServletRequest request,Model model){
        List<MyFocusShop> list = null;
        List<Shop> myShops = null;
        try {
            User user = (User) request.getSession().getAttribute("user");
            list = myPageService.getUserFocusShop(user);
            List<Integer> shopIds = new ArrayList<>();
            for (MyFocusShop myFocusShop : list
            ) {
                int shop_id = myFocusShop.getFoucsShop().getShop_Id();
                shopIds.add(shop_id);
            }
            myShops = myPageService.getUserFoucsShops(shopIds);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        model.addAttribute("list", myShops);
        return "msg";
    }

    //删除用户关注的商家
    @RequestMapping("/delShops")
    public String delLoveShop(int shop_Id,HttpServletRequest request){
        try {
            User user = (User)request.getSession().getAttribute("user");
            int user_Id=user.getUser_Id();
            Map map=new HashMap();
            map.put("user_Id",user_Id );
            map.put("shop_Id",shop_Id);
            myPageService.delLoveShop(map);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "msg";
    }


    //获取用户红包
    @RequestMapping("/getCoupon")
    public String getCoupon(HttpServletRequest request,Model model){
        User user = (User)request.getSession().getAttribute("user");
        List<MyCoupon> list = null;
        List<Shop> shopCoupons = null;
        try {
            list = myPageService.getUserCoupon(user);
            List<Integer> shopIds = new ArrayList<>();
            for (MyCoupon myCoupon : list
            ) {
                int shop_id = myCoupon.getCoupon().getShop_Id();
                shopIds.add(shop_id);
            }
            shopCoupons = myPageService.getShopCoupons(shopIds);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        model.addAttribute("list", shopCoupons);
        return "msg";
    }

    //获取用户的收货地址(全部)
    @RequestMapping("/getAllAddr")
    @ResponseBody
    public String getUserAddr(HttpServletRequest request,Model model){
        List<User_Addr> userAddrs = null;
        try {
            //User user = (User)request.getSession().getAttribute("user");
            User user=new User();
            user.setUser_Id(1);
            userAddrs = myPageService.getUserAddrs(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (User_Addr user_addr:userAddrs
             ) {
            System.out.println("用户名:+"+user_addr.getUser_Addr_Name()+
                                "用户电话"+user_addr.getUser_Addr_Num());
        }
        String result= JSON.toJSONString(userAddrs);
        System.out.println(result);
        model.addAttribute("addrs", result);
        return "MyPage";
    }

    //删除用户的某个收货地址
    @RequestMapping("/delAddr")
    public void delUserAddr(User_Addr user_addr)throws Exception{
        Map map=new HashMap();
        map.put("user_Addr_Id",user_addr.getUser_Addr_Id());
        myPageService.delUserAddr(map);
    }



    //点击设置展示用户信息
    @RequestMapping("/showUser")
    public String showUpUser(HttpServletRequest request){
        User user = (User)request.getSession().getAttribute("user");
        try {
            User us = myPageService.showUpUser(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "msg";
    }

    //点击保存修改用户设置
    @RequestMapping("/setUser")
    public ModelAndView setUpUser(String user_Name, @RequestParam(value = "user_Pic",required = false) CommonsMultipartFile user_Pic,
                                  String user_Email, String user_Tel, HttpServletRequest request, HttpServletResponse response)throws Exception {
        User user = (User)request.getSession().getAttribute("user");
        int user_Id=user.getUser_Id();
        //int user_Id=2;
        //1.获取图片完整的名称
        String fileStr = user_Pic.getOriginalFilename();
        System.out.println("文件名称"+fileStr);
        //3.获取项目下图片文件完整路径
        String path = request.getSession().getServletContext().getRealPath("files/")+fileStr;
        System.out.println("项目路径"+path);
        //4.将图片保存到项目下
        user_Pic.transferTo(new File(path));
        String url = FileUpLodeUtil.fileUpload(path);
        System.out.println(url);
        Map map=new HashMap();
        map.put("user_Name", user_Name);
        map.put("user_Pic", url);
        map.put("user_Email", user_Email);
        map.put("user_Tel", user_Tel);
        map.put("user_Id", user_Id);
        //5.将图片名保存到数据库
        myPageService.setUpUser(map);
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("user_Pic", url);
        modelAndView.setViewName("msg");
        return modelAndView;
    }
}
