package com.xzy.service.base;

import com.xzy.pojo.*;

import java.util.List;

public interface Seeds_MutualDiscussService {
    //查询并排序所有互评
    public List<Seeds_MutualDiscuss> mutualDiscussSort(int seeds_DiscussId);
    //获取用户名和头像
    public User getUser(int seeds_MutualDiscussId);
    //获取评论时间点赞
    public Seeds_MutualDiscuss getMuch(int seeds_MutualDiscussId);
}
