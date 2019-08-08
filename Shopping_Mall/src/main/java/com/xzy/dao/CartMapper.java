package com.xzy.dao;

import org.apache.ibatis.annotations.Param;

public interface CartMapper {

    Integer getCartId(Integer userId);

    int addToCart(@Param("cartId") Integer cartId, @Param("goodsId") Integer goodsId, @Param("num") int num);
}