package com.xzy.service.base;

import com.xzy.vo.*;
import com.xzy.pojo.shop;

import java.util.List;

/**
 * @author WuJiaWei
 * @date 2019/7/23-12:07
 */
public interface CartService
{
    public List<CartCostom> findAllCart(CartVo cartVo) throws Exception;
    public List<CartCostom> deleteCart(CartVo cartVo) throws  Exception;
    public List<CartCostom> insertCart(CatId catId) throws Exception;
    //public List<Need> Need(Need need) throws Exception;
    public List<Check> CheckOrUnCheck(Check check) throws Exception;
    public List<ChangeNum> ChangeNum(ChangeNum changeNum) throws Exception;
    public List<findcoupon> findcoupon(float a) throws Exception;
    public List<shop> getPrice(float a)throws Exception;
    public List<sendAll> sendAll(sendAll sendAll) throws Exception;

}
