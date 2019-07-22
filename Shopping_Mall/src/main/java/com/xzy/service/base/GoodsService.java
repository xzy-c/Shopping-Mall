package com.xzy.service.base;

import com.common.ServerResponse;
import com.xzy.pojo.Goods;
import com.xzy.vo.GoodVo;

public interface GoodsService {
    ServerResponse<GoodVo> getGoodInfo(Integer goodId);

    ServerResponse loveGoods(Integer userId, Integer goodId);

    ServerResponse addNewGoods(Integer shopId, Goods goods, int stock);
}
