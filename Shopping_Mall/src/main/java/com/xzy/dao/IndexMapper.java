package com.xzy.dao;

import com.xzy.pojo.Seeds;
import com.xzy.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IndexMapper {
    //查询所有种草文
    public List<Seeds> sortLikes();
    //获取封面
    public String getCover(int seeds_Id);
    //获取用户名和头像
    public User getUser(int seeds_Id);
    //获取文章标题和点赞数
    public Seeds getTitle(int seeds_Id);
}
