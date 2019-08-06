package com.xzy.controller;

import com.xzy.pojo.Goods;
import com.xzy.service.base.RotationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author wangxiaoliang
 * @date 2019/7/28 - 9:02
 */
public class RotationController {

    @Autowired
    private RotationService rs;
    @RequestMapping("/lunboget.action")
    public String getImg(Model model)
    {
        //随机找出几个物品图片做首页轮播图
        List<Goods> list = rs.findImg();
        model.addAttribute("Goods",list);
        //model.addAttribute();
        return "lunbosuccess";
    }
}
