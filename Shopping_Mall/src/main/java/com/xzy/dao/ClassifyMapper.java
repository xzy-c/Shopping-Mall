package com.xzy.dao;

import com.xzy.pojo.Goods;

import java.util.List;

/**
 * @author wangxiaoliang
 * @date 2019/7/31 - 15:46
 */
public interface ClassifyMapper {
    //public List<Small_Cate> findSmallCate(int Big_Cate_ID);

    public List<Goods> findGoods(int Big_Cate_ID);

}
