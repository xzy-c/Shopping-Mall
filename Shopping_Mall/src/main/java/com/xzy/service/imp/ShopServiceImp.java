package com.xzy.service.imp;

import com.common.ServerResponse;
import com.xzy.vo.ShopVo;
import com.xzy.dao.GoodsMapper;
import com.xzy.dao.ShopMapper;
import com.xzy.pojo.Goods;
import com.xzy.pojo.Shop;
import com.xzy.service.base.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ShopServiceImp implements ShopService {

    private ShopMapper shopMapper;

    private GoodsMapper goodsMapper;

    @Autowired
    public void setShopMapper(ShopMapper shopMapper) {
        this.shopMapper = shopMapper;
    }

    @Autowired
    public void setGoodsMapper(GoodsMapper goodsMapper) {
        this.goodsMapper = goodsMapper;
    }

    @Override
    public ServerResponse addShop(String shopName) {
        int resultCount = shopMapper.addShop(shopName);
        if (resultCount > 0) {
            return ServerResponse.createBySuccess("新增商家成功!");
        }
        return ServerResponse.createByErrorMessage("新增商家失败");
    }

    @Override
    public ServerResponse<ShopVo> getShopInfo(Integer shopId) {
        Shop shop = shopMapper.getShop(shopId);
        int popular = shopMapper.getShopPopular(shopId);
        List<Goods> shopGoods = new ArrayList<>();
        List<Integer> shopGoodsNum = shopMapper.getShopGoodsNum(shopId);
        for (Integer goodId : shopGoodsNum) {
            shopGoods.add(goodsMapper.getGoods(goodId));
        }
        ShopVo shopVo = new ShopVo(shop,popular,shopGoods);
        return ServerResponse.createBySuccess(shopVo);
    }

    @Override
    public ServerResponse loveShop(Integer userId, Integer shopId) {
        int resultCount = shopMapper.loveShop(userId,shopId);
        if (resultCount > 0) {
            return ServerResponse.createBySuccess("收藏商铺成功!");
        }
        return ServerResponse.createByErrorMessage("收藏商铺失败!");
    }
}
