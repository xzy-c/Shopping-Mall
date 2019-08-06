package com.xzy.service.imp;
import com.xzy.dao.WriteDiscussMapper;
import com.xzy.pojo.Seeds_Discuss;
import com.xzy.pojo.Seeds_MutualDiscuss;
import com.xzy.service.base.WriteDiscussService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class WriteDiscussServiceImp implements WriteDiscussService{
    @Autowired
    private WriteDiscussMapper wd;
    @Override
    public int writeDiscuss(Seeds_Discuss seeds_Discuss)
    {
       int seeds_DiscussId= wd.writeDiscuss(seeds_Discuss);
       return seeds_DiscussId;
    }
    @Override
    public void updateLikes(int seeds_DiscussId)
    {
        wd.updateLikes(seeds_DiscussId);
    }
    @Override
    public void writeTime(Date date, int seeds_DiscussId)
    {
        wd.writeTime(date,seeds_DiscussId);
    }
    @Override
    public void writeUserId(int user_Id, int seeds_DiscussId)
    {
        wd.writeUserId(user_Id,seeds_DiscussId);
    }
    @Override
    public void writeSeedsId(int seeds_Id, int seeds_DiscussId){wd.writeSeedsId(seeds_Id,seeds_DiscussId);}
    @Override
    public int writeMutualDiscuss(Seeds_MutualDiscuss seeds_MutualDiscuss)
    {
        int seeds_MutualDiscussId= wd.writeMutualDiscuss(seeds_MutualDiscuss);
        return seeds_MutualDiscussId;
    }
    @Override
    public void updateMLikes(int seeds_MutualDiscussId)
    {
        wd.updateMLikes(seeds_MutualDiscussId);
    }
    @Override
    public void writeMTime(Date date, int seeds_MutualDiscussId)
    {
        wd.writeMTime(date, seeds_MutualDiscussId);
    }
    @Override
    public void writeMUserId(int user_Id, int seeds_MutualDiscussId)
    {
        wd.writeMUserId(user_Id,seeds_MutualDiscussId);
    }
    @Override
    public void writeDiscussId(int discuss_Id, int seeds_MutualDiscussId)
    {
        wd.writeDiscussId(discuss_Id,seeds_MutualDiscussId);
    }
}
