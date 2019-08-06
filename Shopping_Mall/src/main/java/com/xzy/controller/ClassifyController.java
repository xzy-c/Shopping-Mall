package com.xzy.controller;

import com.xzy.pojo.Goods;
import com.xzy.service.base.ClassifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author wangxiaoliang
 * @date 2019/7/30 - 3:36
 * 传big_Cate_ID : 2中餐, 4美酒，8茗茶
 */
@RequestMapping("/aaa")
public class ClassifyController {
    @Autowired
    private ClassifyService cs;
/*
    //一级分类寻找二级分类
    @RequestMapping("/xxxxxxx.action")
    @ResponseBody
    public String findSmall_Cate(int Big_Cate_ID,Model model){

        List<Small_Cate> small_Cate = cs.findSmallCate(Big_Cate_ID);
        model.addAttribute("Small_Cate",small_Cate);
        return "success";
    }*/


    //通过small_cate_id查询相应的物品
    @RequestMapping("/xxxxx.action")
    @ResponseBody
    public String findGoods(int Big_Cate_ID,Model model){

            List<Goods> goodsList = cs.findGoods(Big_Cate_ID);
            model.addAttribute("Goods",goodsList);
            return "success";
    }

}
