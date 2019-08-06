package com.xzy.service.imp;

import com.xzy.dao.Seeds_DiscussMapper;
import com.xzy.pojo.Seeds_Discuss;
import com.xzy.pojo.User;
import com.xzy.service.base.Seeds_DiscussService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class Seeds_DiscussImp implements Seeds_DiscussService {
    /**
     *
     */
    @Autowired
    private Seeds_DiscussMapper sd;
    @Override
    public User getUser(int seeds_DiscussId)
    {
        User users=sd.getUser(seeds_DiscussId);
        return users;
    }
    @Override
    public List<Seeds_Discuss> sortLikes(int seeds_Id)
    {
        List<Seeds_Discuss> list=sd.sortLikes(seeds_Id);
        return list;
    }
    @Override
    public Seeds_Discuss getMore(int seeds_DiscussId)
    {
        Seeds_Discuss seeds_Discuss=sd.getMore(seeds_DiscussId);
        return seeds_Discuss;
    }
}
