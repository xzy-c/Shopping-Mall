package com.xzy.dao;

import com.xzy.pojo.Seeds;
import org.apache.ibatis.annotations.Param;

import java.util.Date;

public interface WriteMapper {
    //写软文
    public int write(Seeds seeds);
    //获取用户Id
    public void writeUserId(@Param("user_Id") int user_Id,@Param("seeds_Id") int seeds_Id);
    //点赞
    public void updateLikes(int seeds_Id);
    //收藏
    public void updateCollections(int seeds_Id);
    //插入轮播图
    public void writeSeedsRotation(@Param("seeds_Id") int seeds_Id,@Param("path") String path,@Param("sort") int sort);
    //写封面
    public void writeCover(@Param("cover") String cover,@Param("seeds_Id") int seeds_Id);
    //写时间
    public void writeReleasetime(@Param("date") Date date,@Param("seeds_Id") int seeds_Id);
}
