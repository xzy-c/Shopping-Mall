package com.xzy.service.base;

import com.xzy.vo.*;
import com.xzy.pojo.Shop;

import java.util.List;

/**
 * @author WuJiaWei
 * @date 2019/7/23-12:07
 */
public interface CartService
{
    public List<CartCostom> findAllCart(CartVo CartVo) throws Exception;
    public List<CartCostom> deleteCart(CartVo CartVo) throws  Exception;
    public List<CartCostom> insertCart(CatId CatId) throws Exception;
    //public List<Need> Need(Need need) throws Exception;
    public List<Check> CheckOrUnCheck(Check Check) throws Exception;
    public List<ChangeNum> ChangeNum(ChangeNum ChangeNum) throws Exception;
    public List<FindCoupon> findcoupon(float a) throws Exception;
    public List<Shop> getPrice(float a)throws Exception;
    public List<SendAll> sendAll(SendAll SendAll) throws Exception;

}
