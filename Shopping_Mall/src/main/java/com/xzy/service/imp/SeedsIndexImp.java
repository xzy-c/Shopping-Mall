package com.xzy.service.imp;

import com.xzy.dao.IndexMapper;
import com.xzy.pojo.Seeds;
import com.xzy.pojo.User;
import com.xzy.service.base.SeedsIndex;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeedsIndexImp implements SeedsIndex
{
    @Autowired
    private IndexMapper im;

    @Override
    public String getCover(int seeds_Id)
    {
        String cover=im.getCover(seeds_Id);
        return cover;
    }
    @Override
    public List<Seeds> sortLikes()
    {
       List<Seeds>  list=im.sortLikes();
       return list;
    }
    @Override
    public User getUser(int seeds_Id)
    {
        //Index index=new Index();
        User users=im.getUser(seeds_Id);
        //index.setUser_Name(users.getUname());
        //index.setUser_Pic(users.getUser_Pic());
        return users;
    }
    @Override
    public Seeds getTitle(int seeds_Id)
    {
        Seeds seeds=im.getTitle(seeds_Id);
        return seeds;
    }
}
