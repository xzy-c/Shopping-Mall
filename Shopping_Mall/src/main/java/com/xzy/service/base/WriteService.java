package com.xzy.service.base;

import com.xzy.pojo.Seeds;
import org.apache.ibatis.annotations.Param;

import java.util.Date;

public interface WriteService {
    public int write(Seeds seeds);
    public void writeUserId(int user_Id, int seeds_Id);
    public void updateLikes(int seeds_Id);
    public void updateCollections(int seeds_Id);
    public void writeSeedsRotation(int seeds_Id,String path,int sort);
    public void writeCover(String cover,int seeds_Id);
    public void writeReleasetime(Date date,int seeds_Id);
}
