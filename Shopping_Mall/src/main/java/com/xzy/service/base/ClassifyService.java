package com.xzy.service.base;

import com.xzy.pojo.Goods;

import java.util.List;

/**
 * @author wangxiaoliang
 * @date 2019/7/30 - 3:46
 */
public interface ClassifyService {

    //public List<Small_Cate> findSmallCate(int Big_Cate_ID);

    public List<Goods> findGoods(int Big_Cate_ID);

}
