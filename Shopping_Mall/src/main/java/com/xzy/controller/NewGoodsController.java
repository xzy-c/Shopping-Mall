package com.xzy.controller;

import com.xzy.pojo.Goods;
import com.xzy.service.base.NewGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author wangxiaoliang
 * @date 2019/7/28 - 22:17
 */
public class NewGoodsController {

    @Autowired
    private NewGoodsService ngs;

    @RequestMapping("/xxxxxxxxxxxx.action")
    @ResponseBody
    public String getNew(Model model) {

        List<Goods> list = ngs.findNew();
        model.addAttribute("Goods",list);
        return "success";
    }
}
