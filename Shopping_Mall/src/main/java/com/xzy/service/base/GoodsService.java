package com.xzy.service.base;


import com.xzy.pojo.Goods;
import com.xzy.pojo.Small_Cate;

import java.util.List;

public interface GoodsService {
    /**
     * 通过主键获取商品
     * @param
     * @return
     */

    //从一级列表获取二级列表
    public  List<Small_Cate> getSmall_Cate(int Big_Cate_ID);
    //从二级列表获取商品
    public  List<Goods> getGoods(int Small_Cate_Id);

//    public Goods getGoodsByPrimaryKey(Integer goodsId);
//
//    public Goods getGoodsById(Integer goodsId);

}
