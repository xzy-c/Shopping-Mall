package com.xzy.service.base;

import com.xzy.pojo.Seeds;
import com.xzy.pojo.User;

import java.util.List;

public interface UpService {
    //获取轮播图并排序
    public List<String> sortPath(int seeds_Id);
    //获取用户名和头像
    public User getUser(int seeds_Id);
    //获取文章标题和点赞数和描述和时间
    public Seeds getAll(int seeds_Id);
}
