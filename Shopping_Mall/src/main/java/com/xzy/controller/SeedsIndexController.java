package com.xzy.controller;

import com.xzy.pojo.Seeds;
import com.xzy.vo.Index;
import com.xzy.service.base.SeedsIndex;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;


@Controller
public class SeedsIndexController {
    @Autowired
    private SeedsIndex si;

    @RequestMapping("/like.action")
    @ResponseBody
    public String seedsIndex(Model model)
    {
        List<Index> indexList = new ArrayList();

        List<Seeds> list = si.sortLikes();
        for(Seeds c:list) {
            Index index = new Index();
            index.setCover(si.getCover(c.getSeeds_Id()));
            index.setLikes(si.getTitle(c.getSeeds_Id()).getLikes());
            index.setTitle(si.getTitle(c.getSeeds_Id()).getTitle());
            index.setUser_Name(si.getUser(c.getSeeds_Id()).getUser_Name());
            index.setUser_Pic(si.getUser(c.getSeeds_Id()).getUser_Pic());
            indexList.add(index);
        }
        model.addAttribute("index",indexList);
        return "success";
    }
}
