package com.xzy.service.imp;

import com.xzy.dao.WriteMapper;
import com.xzy.pojo.Seeds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.xzy.service.base.WriteService;

import java.util.Date;

@Service
public class WriteServiceImp implements WriteService{
    @Autowired
    private WriteMapper wm;
    @Override
    public int write(Seeds seeds)
    {
        int seeds_Id= wm.write(seeds);
        return seeds_Id;
    }
    @Override
    public void updateLikes(int seeds_Id)
    {
        wm.updateLikes(seeds_Id);
    }
    @Override
    public void updateCollections(int seeds_Id)
    {
        wm.updateCollections(seeds_Id);
    }
    @Override
    public void writeUserId(int user_Id, int seeds_Id)
    {
        wm.writeUserId(user_Id,seeds_Id);
    }
    @Override
    public void writeSeedsRotation(int seeds_Id,String path,int sort)
    {
        wm.writeSeedsRotation(seeds_Id, path, sort);
    }
    @Override
    public void writeCover(String cover, int seeds_Id)
    {
        wm.writeCover(cover,seeds_Id);
    }
    @Override
    public void writeReleasetime(Date date, int seeds_Id)
    {
        wm.writeReleasetime(date,seeds_Id);
    }
}
