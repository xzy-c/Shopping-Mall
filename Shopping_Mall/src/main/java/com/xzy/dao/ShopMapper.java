package com.xzy.dao;

import com.xzy.pojo.Shop;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ShopMapper {
    int insert(Shop record);

    int insertSelective(Shop record);

    int addShop(String shopName);

    Shop getShop(Integer shopId);

    int getShopPopular(Integer shopId);

    List<Integer> getShopGoodsNum(Integer shopId);

    int loveShop(@Param("userId") Integer userId, @Param("shopId") Integer shopId);
}