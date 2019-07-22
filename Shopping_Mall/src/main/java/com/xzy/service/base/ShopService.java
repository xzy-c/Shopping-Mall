package com.xzy.service.base;

import com.common.ServerResponse;
import com.xzy.vo.ShopVo;

public interface ShopService {
    ServerResponse addShop(String shopName);

    ServerResponse<ShopVo> getShopInfo(Integer shopId);

    ServerResponse loveShop(Integer userId, Integer shopId);
}
