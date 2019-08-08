package com.xzy.dao;

import com.xzy.pojo.Goods;
import com.xzy.pojo.Small_Cate;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodsMapper {
    int insert(Goods record);

    int insertSelective(Goods record);

    Goods getGoods(Integer goodId);

    int getLoveGoodsNum(Integer goodId);

    int loveGoods(@Param("userId") Integer userId, @Param("goodId") Integer goodId);

    int ifGetCoupon(@Param("userId") Integer userId, @Param("shopId") Integer shopId);

    List<Goods> getGoodsByShopId(Integer shopId);

    public List<Small_Cate> searchSmall_Cate(int Big_Cate_ID);

    public List<Goods> searchGoods(int Small_Cate_Id);

}