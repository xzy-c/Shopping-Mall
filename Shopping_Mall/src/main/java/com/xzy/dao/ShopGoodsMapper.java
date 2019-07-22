package com.xzy.dao;

import com.xzy.pojo.ShopGoods;

public interface ShopGoodsMapper {
    int insert(ShopGoods record);

    int insertSelective(ShopGoods record);
}