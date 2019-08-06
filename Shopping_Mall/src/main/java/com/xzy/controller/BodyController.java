package com.xzy.controller;

import com.xzy.pojo.*;
import com.xzy.service.base.Seeds_DiscussService;
import com.xzy.service.base.Seeds_MutualDiscussService;
import com.xzy.service.base.UpService;
import com.xzy.vo.Body;
import com.xzy.vo.Discuss;
import com.xzy.vo.MutualDiscuss;
import com.xzy.vo.Up;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BodyController {
    @Autowired
    private UpService us;
    @Autowired
    private Seeds_DiscussService sd;
    @Autowired
    private Seeds_MutualDiscussService sm;
    @RequestMapping("/up.action")
    @ResponseBody
    public String body (int seeds_Id, Model model)
    {
        Up up=new Up();
        Body body=new Body();
        up.setPath(us.sortPath(seeds_Id));
        up.setTitle(us.getAll(seeds_Id).getTitle());
        up.setDescription(us.getAll(seeds_Id).getDescription());
        up.setUser_Name(us.getUser(seeds_Id).getUser_Name());
        up.setUser_Pic(us.getUser(seeds_Id).getUser_Pic());
        up.setTime(us.getAll(seeds_Id).getReleasetime());
        up.setLikes(us.getAll(seeds_Id).getLikes());
        //存储评论(包括互评)
        List<Discuss> discuss_List=new ArrayList();

        //查询评论并点赞排序
        List<Seeds_Discuss> list = sd.sortLikes(seeds_Id);
        for (Seeds_Discuss c:list) {
            //评论对象
            Discuss discuss=new Discuss();
            discuss.setUser_Pic(sd.getUser(c.getSeeds_DiscussId()).getUser_Pic());
            discuss.setUser_Name(sd.getUser(c.getSeeds_DiscussId()).getUser_Name());
            discuss.setComment(sd.getMore(c.getSeeds_DiscussId()).getComment());
            discuss.setTime(sd.getMore(c.getSeeds_DiscussId()).getTime());
            discuss.setLikes(sd.getMore(c.getSeeds_DiscussId()).getLikes());
            //查询互评根据时间排序
            List<Seeds_MutualDiscuss> list1=sm.mutualDiscussSort(c.getSeeds_DiscussId());
            //存储互评
            List<MutualDiscuss> mutualDiscuss_List=new ArrayList();
            for (Seeds_MutualDiscuss d:list1)
            {
                //互评对象
                MutualDiscuss mutualDiscuss=new MutualDiscuss();
                mutualDiscuss.setUser_Pic(sm.getUser(d.getSeeds_MutualDiscuss()).getUser_Pic());
                mutualDiscuss.setUser_Name(sm.getUser(d.getSeeds_MutualDiscuss()).getUser_Name());
                mutualDiscuss.setComment(sm.getMuch(d.getSeeds_MutualDiscuss()).getComment());
                mutualDiscuss.setTime(sm.getMuch(d.getSeeds_MutualDiscuss()).getTime());
                mutualDiscuss.setLikes(sm.getMuch(d.getSeeds_MutualDiscuss()).getLikes());
                mutualDiscuss_List.add(mutualDiscuss);
            }
            discuss.setListM(mutualDiscuss_List);
            discuss_List.add(discuss);
        }
        body.setUp(up);
        body.setList_Discuss(discuss_List);
        model.addAttribute("body",body);
    return "#";
    }
}
