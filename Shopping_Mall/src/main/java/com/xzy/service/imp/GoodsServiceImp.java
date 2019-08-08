package com.xzy.service.imp;

import com.common.ServerResponse;
import com.xzy.dao.GoodsMapper;
import com.xzy.dao.ShopMapper;
import com.xzy.pojo.Goods;
import com.xzy.pojo.Shop;
import com.xzy.pojo.Small_Cate;
import com.xzy.service.base.GoodsService;
import com.xzy.vo.GoodVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GoodsServiceImp implements GoodsService {

    private GoodsMapper goodsMapper;

    private ShopMapper shopMapper;

    @Autowired
    public void setGoodsMapper(GoodsMapper goodsMapper) {
        this.goodsMapper = goodsMapper;
    }

    @Autowired
    public void setShopMapper(ShopMapper shopMapper) {
        this.shopMapper = shopMapper;
    }

    @Override
    public ServerResponse<GoodVo> getGoodInfo(Integer goodId) {
        Goods good = goodsMapper.getGoods(goodId);
        if (good == null) {
            return ServerResponse.createByErrorMessage("商品不存在!");
        }
        int popular = goodsMapper.getLoveGoodsNum(goodId);
        Shop shop = shopMapper.getShop(good.getShop_Id());
        GoodVo goodVo = new GoodVo(good,popular,shop);
        return ServerResponse.createBySuccess(goodVo);
    }

    @Override
    public ServerResponse loveGoods(Integer userId, Integer goodId) {
        int resultCount = goodsMapper.loveGoods(userId,goodId);
        if (resultCount > 0) {
            return ServerResponse.createBySuccessMessage("收藏商品成功");
        }
        return ServerResponse.createByErrorMessage("收藏商品失败");
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public ServerResponse addNewGoods(Goods goods) {
        int resultCount = goodsMapper.insert(goods);
        if (resultCount > 0) {
            return ServerResponse.createBySuccessMessage("新增商品成功!");
        }
        return ServerResponse.createByErrorMessage("新增商品失败!");
    }

    @Override
    public ServerResponse ifGetCoupon(Integer userId, Integer shopId) {
        int resultCount = goodsMapper.ifGetCoupon(userId,shopId);
        if (resultCount > 0) {
            return ServerResponse.createByErrorMessage("已领取优惠券!");
        }
        return ServerResponse.createBySuccessMessage("未领取优惠券!");
    }

    //从一级列表获取二级列表
    @Override
    public  List<Small_Cate> getSmall_Cate(int Big_Cate_ID) {
        return goodsMapper.searchSmall_Cate(Big_Cate_ID);
    }
    //从二级列表获取商品
    @Override
    public List<Goods> getGoods(int Small_Cate_Id){
        return goodsMapper.searchGoods(Small_Cate_Id);
    }
}
