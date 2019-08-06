package com.xzy.service.imp;

import com.xzy.dao.Seeds_MutualDiscussMapper;
import com.xzy.pojo.Seeds_MutualDiscuss;
import com.xzy.pojo.User;
import com.xzy.service.base.Seeds_MutualDiscussService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Seeds_MutualDiscussImp implements Seeds_MutualDiscussService {
    @Autowired
    private Seeds_MutualDiscussMapper sm;
    @Override
    public List<Seeds_MutualDiscuss> mutualDiscussSort(int seeds_DiscussId)
    {
        List<Seeds_MutualDiscuss> list=sm.mutualDiscussSort(seeds_DiscussId);
        return list;
    }
    @Override
    public User getUser(int seeds_MutualDiscussId)
    {
        User users=sm.getUser(seeds_MutualDiscussId);
        return users;
    }
    @Override
    public Seeds_MutualDiscuss getMuch(int seeds_MutualDiscussId)
    {
        Seeds_MutualDiscuss mutualDiscuss=sm.getMuch(seeds_MutualDiscussId);
        return mutualDiscuss;
    }
}
