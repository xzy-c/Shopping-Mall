package com.xzy.controller;

import com.xzy.pojo.Goods;
import com.xzy.pojo.Small_Cate;
import com.xzy.service.base.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/Goods")
public class GoodsController {
    @Autowired
    private GoodsService goodsService;

    // 一级列表
    @RequestMapping("/querygoods.action")

    public String findSmall_Cate(int Big_Cate_ID, Model model) {

        List<Small_Cate> goodsList = goodsService.getSmall_Cate(Big_Cate_ID);
        model.addAttribute("Small_Cate", goodsList);
        return "success";
    }

    @RequestMapping("/getGoods.action")
    public String findGoods(int Small_Cate_ID, Model model) {

        List<Goods> goodsList = goodsService.getGoods(Small_Cate_ID);
        model.addAttribute("Goods", goodsList);
        return "success1";
    }
}

