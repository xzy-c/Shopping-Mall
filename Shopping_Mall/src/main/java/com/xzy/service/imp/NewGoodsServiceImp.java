package com.xzy.service.imp;

import com.xzy.dao.NewGoodsMapper;
import com.xzy.pojo.Goods;
import com.xzy.service.base.NewGoodsService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author longzongniubi
 * @date 2019/7/30 - 0:30
 */


public class NewGoodsServiceImp implements NewGoodsService {
    @Autowired
    private NewGoodsMapper ngm;

    @Override
    public List<Goods> findNew() {

        return ngm.newGoods();

    }
}
