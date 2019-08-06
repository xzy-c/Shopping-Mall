package com.xzy.dao;

import com.xzy.pojo.Goods;

import java.util.List;

/**
 * @author wangxiaoliang
 * @date 2019/7/30 - 23:42
 */
public interface SearchMapper {

    public List<Goods> search(String str);




}
