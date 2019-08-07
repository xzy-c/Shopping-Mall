package com.xzy.controller;

import com.xzy.pojo.Goods;
import com.xzy.pojo.Goods_Rel;
import com.xzy.vo.*;
import com.xzy.pojo.Shop;
import com.xzy.pojo.User;
import com.xzy.service.base.CartService;
import com.xzy.service.imp.CartServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author WuJiaWei
 * @date 2019/7/23-12:09
 */
@Controller
public class CartController
{
    //查找所有的商品，并分类显示
    @Autowired
    private  CartService Cart;
    private ServletRequest request;

    @RequestMapping()
    public String  findAllCarts(CartVo cartVo, Model model,HttpServletRequest request) throws Exception
    {
        HttpSession session=request.getSession();
         User usr=(User)session.getAttribute("session");

        if (usr==null) {
            return "success";
        }else
        {
            Cart.findAllCart(cartVo);
            model.addAttribute("cartVo",cartVo);
            return null;
        }
    }
    //删除购物车中商品
    @RequestMapping()
    public String deleteCart(CartVo cartVo,Model model,HttpServletRequest request) throws Exception
    {
        HttpSession session=request.getSession();
        User usr=(User)session.getAttribute("session");
        if(usr==null)
        {
            return "success";
        }else {
            Cart.deleteCart(cartVo);
            model.addAttribute("cartVo",cartVo);
            return "success";
        }
    }
    //加入购物车将商品
    @RequestMapping()
    public String insertCart(Model model, CatId catId,HttpServletRequest request,ChangeNum changeNum,int count)throws  Exception
    {
        HttpSession session=request.getSession();
        User usr=(User)session.getAttribute("session");
        if(usr==null)
        {
            return "success";
        }else
        {   if((int)catId.getCart_Id()==0)
            {
                changeNum.setGoods_Rel_Am(count);
            }else
                {
                    Cart.insertCart(catId);
                    model.addAttribute("cartVo",catId);

            }
            return "还是购物车";
        }
    }
    //小计价格
    @RequestMapping()
    public String accont(/*Model model,*/ CartCostom cartCostom, HttpServletRequest request, Goods_Rel goods_rel)
    {
        Goods_Rel goods_rel1=new Goods_Rel();
        HttpSession session=request.getSession();
        User usr=(User)session.getAttribute("session");
        HttpSession session1=request.getSession();
        session1.setAttribute("Sum",session1);
        if(usr==null)
        {
            return "登录注册页面";
        }else {
            if(cartCostom.getGoods_Stock()==0)
            {
                //无库存状态，但已经加入购物车
                return "无法购买";
            }else
                {
                //有库存，已经加入购物车，可提交小计
                    //使用小计的工具类
                    float goods_Rel_Sum ;
                    goods_Rel_Sum=0.0f;
                    goods_Rel_Sum=getSum();
                    goods_rel.setGoods_Rel_Sum(goods_Rel_Sum);
                    return  null;
            }
        }
    }
    //勾选状态
//    @RequestMapping()
//    public int CheckOrUnCheck(int b) //throws Exception
//    {
//
//        //b=check.isGoods_Check();
//        b=1;
//        return b;
//    }
    //获取勾选状态
    @RequestMapping()
    public int CheckOrUnCheck(int b) //throws Exception
    {
        //name需要和前端确认
        String[] args=request.getParameterValues("put");
        return b;
    }
    //修改商品数量
    @RequestMapping()
    public List<ChangeNum> ChangeNum(ChangeNum changeNum, int count) //throws Exception
    {
        changeNum.setGoods_Rel_Am(count);
        return ChangeNum(changeNum, count);
    }

    //查询是否有优惠券
    @RequestMapping()
    public float findcoupon(FindCoupon findcoupon, float price) throws Exception
    {
        //HttpSession session=request.getSession();
        Cart.findcoupon(price);
        findcoupon.setUser_Id(findcoupon.getUser_Id());
        price=findcoupon.getShop_Coupon_Price();
        return price;
    }
    //传输信息包
    @RequestMapping()
    public  List<SendAll> sendAlls(List<SendAll> SendAlls)
    {
        if(new Goods().getGoods_Stock()>0)
        {
            List<SendAll> sendAlls1= SendAlls.subList(0, SendAlls.size());
            return sendAlls1;
        }else
        {
            //库存不足
            return null;
        }

    }
    //工具类
    public float getSum()
    {
        float sum = 0;
        float price=0;
        //接收前端chekbox中的信息
        String[] args=request.getParameterValues("put");
        List<FindCoupon> goodsList=new CartServiceImp().findcoupon(sum);
        List<Shop> shopList=new CartServiceImp().getPrice(price);
        for(int i=0;i<goodsList.size();i++)
        {
            if(goodsList.get(i).getShop_Coupon_Price()!= 0)
            {
                sum=sum-shopList.get(i).getShop_coupon_Price()+goodsList.get(i).getGoods_Id();

            }else {
                sum=sum+goodsList.get(i).getGoods_Id();
            }
        }
        return sum;
    }



}
