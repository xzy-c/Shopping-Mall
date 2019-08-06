package com.xzy.service.base;

import com.xzy.pojo.Goods;

import java.util.List;

/**
 * @author wangxiaoliang
 * 商品轮播图
 * @date 2019/7/27 - 0:35
 */
public interface RotationService {

    //public String imgLink(Goods id);

    public List<Goods> findImg();

}
