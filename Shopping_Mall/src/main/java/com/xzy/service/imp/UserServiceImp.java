package com.xzy.service.imp;

import com.xzy.dao.UsersMapper;
import com.xzy.pojo.Goods;
import com.xzy.service.base.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements UserService{

    @Autowired
    private UsersMapper um;
    @Override
    public void addUser(Goods u) {
       um.addUser(u);
    }

}
