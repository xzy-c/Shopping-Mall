package com.xzy.dao;

import com.xzy.pojo.User;

public interface UserMapper {


    //注册
    public void register(User user);

	//登录验证
    public User loginCheck (User user);

    //退出登录
    public void loginOut(User user);

    //修改密码
    public void updateuser_Password(String user_Tel);

}

