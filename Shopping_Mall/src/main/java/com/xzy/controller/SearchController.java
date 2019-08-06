package com.xzy.controller;

import com.xzy.pojo.Goods;
import com.xzy.service.base.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author wangxiaoliang
 * @date 2019/7/31 - 2:08
 */

@RequestMapping("/search.action")
@ResponseBody
public class SearchController {
    @Autowired
    private SearchService ss;

    public String search(String str,Model model){

        List<Goods> list = ss.search(str);
        model.addAttribute("Goods",list);
        return "search";
    }

}

