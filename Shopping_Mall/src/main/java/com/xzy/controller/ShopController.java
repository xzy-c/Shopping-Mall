package com.xzy.controller;

import com.common.ServerResponse;
import com.xzy.vo.ShopVo;
import com.xzy.service.base.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 商家模块
 */
@RestController
@RequestMapping("/shop")
public class ShopController {

    private ShopService shopService;

    @Autowired
    public void setShopService(ShopService shopService) {
        this.shopService = shopService;
    }

    /**
     * 新增商铺
     * @param shopName
     * @return
     */
    @RequestMapping(value = "/add.action",method = RequestMethod.POST)
    public ServerResponse addShop(String shopName) {
        return shopService.addShop(shopName);
    }

    /**
     * 获取商铺具体信息 基本信息+关注人数+商品列表
     * @param shopId
     * @return
     */
    @RequestMapping(value = "getShopInfo.action",method = RequestMethod.GET)
    public ServerResponse<ShopVo> getShopInfo(Integer shopId){
        return shopService.getShopInfo(shopId);
    }

    /**
     * 用户收藏商铺
     * @param userId
     * @param shopId
     * @return
     */
    @RequestMapping(value = "/loveShop.action",method = RequestMethod.POST)
    public ServerResponse loveShop(Integer userId, Integer shopId) {
        return shopService.loveShop(userId,shopId);
    }



}
