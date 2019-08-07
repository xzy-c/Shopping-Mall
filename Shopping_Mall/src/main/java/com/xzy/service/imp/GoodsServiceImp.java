package com.xzy.service.imp;

import com.xzy.dao.GoodsMapper;
import com.xzy.pojo.Goods;
import com.xzy.pojo.Small_Cate;
import com.xzy.service.base.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsServiceImp implements GoodsService {

    @Autowired
    private GoodsMapper goodsMapper;
    //从一级列表获取二级列表
    @Override
    public  List<Small_Cate> getSmall_Cate(int Big_Cate_ID) {
        return goodsMapper.searchSmall_Cate(Big_Cate_ID);
    }
    //从二级列表获取商品
    @Override
    public  List<Goods> getGoods(int Small_Cate_Id){
        return goodsMapper.searchGoods(Small_Cate_Id);
    }

//    @Override
//    public List<Goods> getGoodsList() {
//        return goodsMapper.selectByExample(null);
//    }
//
//
//    @Override
//    public Goods getGoodsByPrimaryKey(Integer goodsId) {
//        Goods goods = goodsMapper.selectByPrimaryKey(goodsId);
//        return goods;
//    }
//    @Override
//    public Goods getGoodsById(Integer goodsId) {
//        Goods goods = goodsMapper.selectById(goodsId);
//        return goods;
//    }
}
