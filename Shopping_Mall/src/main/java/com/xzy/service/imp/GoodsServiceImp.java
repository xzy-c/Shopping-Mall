package com.xzy.service.imp;

import com.common.ServerResponse;
import com.xzy.dao.GoodsMapper;
import com.xzy.dao.ShopMapper;
import com.xzy.pojo.Goods;
import com.xzy.pojo.Shop;
import com.xzy.service.base.GoodsService;
import com.xzy.vo.GoodVo;
import com.xzy.vo.ShopGoodsForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
        int popular = goodsMapper.getLoveGoodsNum(goodId);
        ShopGoodsForm shopGoodsForm = goodsMapper.getShopGoodsForm(goodId);
        Shop shop = shopMapper.getShop(shopGoodsForm.getShopId());

        GoodVo goodVo = new GoodVo(good,popular,shop,shopGoodsForm.getStock(),shopGoodsForm.getVolume());
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
    public ServerResponse addNewGoods(Integer shopId, Goods goods, int stock) {
        int resultCount = goodsMapper.insert(goods);
        if (resultCount > 0) {
            resultCount = goodsMapper.setShopGoods(shopId,goods.getGoodsId(),stock);
            if (resultCount > 0) {
                return ServerResponse.createBySuccess("新增商品成功!");
            }
        }
        return ServerResponse.createByErrorMessage("新增商品失败!");
    }
}
