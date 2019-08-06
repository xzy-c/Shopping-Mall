package com.xzy.service.imp;

import com.xzy.dao.UpMapper;
import com.xzy.pojo.Seeds;
import com.xzy.pojo.User;
import com.xzy.service.base.UpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UpServiceImp implements UpService {
    @Autowired
    private UpMapper um;

    @Override
    public List<String> sortPath(int seeds_Id) {
        List<String>  list=um.sortPath(seeds_Id);
        return list;
    }

    @Override
    public User getUser(int seeds_Id) {
        User user=um.getUser(seeds_Id);
        return user;
    }

    @Override
    public Seeds getAll(int seeds_Id) {
        Seeds seeds=um.getAll(seeds_Id);
        return seeds;
    }
}
