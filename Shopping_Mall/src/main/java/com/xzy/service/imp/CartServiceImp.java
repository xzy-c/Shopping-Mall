package com.xzy.service.imp;


import com.xzy.vo.*;
import com.xzy.dao.CartMapper;
import com.xzy.pojo.shop;
import com.xzy.service.base.CartService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author WuJiaWei
 * @date 2019/7/23-12:09
 */
public class CartServiceImp implements CartService
{
    @Autowired
    private CartMapper cm;
    @Override
    public List<CartCostom> findAllCart(CartVo cartVo)
    {
//        cm.findAllCart(cartVo);
        return this.findAllCart(cartVo) ;
    }
    @Override
    public  List<CartCostom> deleteCart(CartVo cartVo)
    {
        cm.deleteCart(cartVo);
        return null;
    }
    @Override
    public  List<CartCostom> insertCart(CatId catId)
    {
        cm.insertCart(catId);
        return null;
    }
//    @Override
//    public  List<Need> Need(Need need)
//    {
//        cm.Need(need);
//        return  null;
//    }
    @Override
    public  List<Check> CheckOrUnCheck(Check check)
    {
        cm.CheckOrUnCheck(check);
        return null;
    }
    @Override
    public List<ChangeNum> ChangeNum(ChangeNum changeNum)
    {

        cm.ChangeNum(changeNum);
        return null;
    }
    @Override
    public List<findcoupon> findcoupon(float a)
    {
        return findcoupon(a);
    }
    @Override
    public List<shop> getPrice(float a)
    {
        return getPrice(a);
    }
    @Override
    public   List<sendAll> sendAll(sendAll sendAll)
    {

        return cm.SendAll(sendAll);
    }


}
