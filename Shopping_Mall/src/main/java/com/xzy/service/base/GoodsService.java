package com.xzy.service.base;

import com.common.ServerResponse;
import com.xzy.pojo.Goods;
import com.xzy.pojo.Small_Cate;
import com.xzy.vo.GoodVo;

import java.util.List;

public interface GoodsService {
    ServerResponse<GoodVo> getGoodInfo(Integer goodId);

    ServerResponse loveGoods(Integer userId, Integer goodId);

    ServerResponse addNewGoods(Goods goods);

    ServerResponse ifGetCoupon(Integer userId, Integer shopId);

    //从一级列表获取二级列表
    public  List<Small_Cate> getSmall_Cate(int Big_Cate_ID);
    //从二级列表获取商品
    public List<Goods> getGoods(int Small_Cate_Id);
}
