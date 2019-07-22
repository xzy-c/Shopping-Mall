package com.xzy.dao;

import com.xzy.pojo.Goods;
import com.xzy.vo.ShopGoodsForm;
import org.apache.ibatis.annotations.Param;

public interface GoodsMapper {
    int insert(Goods record);

    int insertSelective(Goods record);

    Goods getGoods(Integer goodId);

    int getLoveGoodsNum(Integer goodId);

    ShopGoodsForm getShopGoodsForm(Integer goodId);

    int loveGoods(@Param("userId") Integer userId, @Param("goodId") Integer goodId);

    int setShopGoods(@Param("shopId") Integer shopId, @Param("goodsId") Integer goodsId, @Param("stock") int stock);
}