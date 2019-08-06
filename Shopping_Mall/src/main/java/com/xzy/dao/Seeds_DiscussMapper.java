package com.xzy.dao;

import com.xzy.pojo.Seeds_Discuss;
import com.xzy.pojo.User;

import java.util.List;

public interface Seeds_DiscussMapper {
    //获取用户名和头像
    public User getUser(int seeds_DiscussId);
    //获取评论时间点赞数评论
    public Seeds_Discuss getMore(int seeds_DiscussId);
    //根据喜欢排序
    public List<Seeds_Discuss> sortLikes(int seeds_Id);
}
