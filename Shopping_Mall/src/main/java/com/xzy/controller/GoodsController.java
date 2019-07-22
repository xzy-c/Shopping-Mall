package com.xzy.controller;

import com.common.ServerResponse;
import com.xzy.pojo.Goods;
import com.xzy.service.base.GoodsService;
import com.xzy.vo.GoodVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 商品模块
 */
@RestController
@RequestMapping("/goods")
public class GoodsController {

    private GoodsService goodsService;

    @Autowired
    public void setGoodsService(GoodsService goodsService) {
        this.goodsService = goodsService;
    }

    /**
     * 增添新商品
     * @param shopId
     * @param goods
     * @param stock
     * @return
     */
    public ServerResponse addNewGoods(Integer shopId, Goods goods, int stock) {
        if (shopId == null) {
            return ServerResponse.createByErrorMessage("参数错误!");
        }
        return goodsService.addNewGoods(shopId,goods,stock);
    }


    /**
     * 获取商品具体信息  基本信息+收藏人数+所在商铺+库存+成交量
     * @param goodId
     * @return
     */
    @RequestMapping(value = "/getGoodInfo.action",method = RequestMethod.GET)
    public ServerResponse<GoodVo> getGoodInfo(Integer goodId) {
        if (goodId == null) {
            return ServerResponse.createByErrorMessage("参数错误!");
        }
        return goodsService.getGoodInfo(goodId);
    }

    /**
     * 收藏商品
     * @param userId
     * @param goodId
     * @return
     */
    @RequestMapping(value = "/loveGood.action",method = RequestMethod.POST)
    public ServerResponse loveGoods(Integer userId, Integer goodId) {
        if (userId == null || goodId == null) {
            return ServerResponse.createByErrorMessage("参数错误!");
        }
        return goodsService.loveGoods(userId,goodId);
    }




}
