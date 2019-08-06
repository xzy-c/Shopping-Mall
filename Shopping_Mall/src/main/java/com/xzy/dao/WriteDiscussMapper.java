package com.xzy.dao;

import com.xzy.pojo.Seeds_Discuss;
import com.xzy.pojo.Seeds_MutualDiscuss;
import org.apache.ibatis.annotations.Param;

import java.util.Date;

public interface WriteDiscussMapper {
    //写评论
    public int writeDiscuss(Seeds_Discuss seeds_Discuss);
    //点赞
    public void updateLikes(int seeds_DiscussId);
    //写的时间
    public void writeTime(@Param("date") Date date, @Param("seeds_DiscussId") int seeds_DiscussId);
    //获取用户Id
    public void writeUserId(@Param("user_Id") int user_Id, @Param("seeds_DiscussId") int seeds_DiscussId);
    //写入种草Id
    public void writeSeedsId(@Param("seeds_Id") int seeds_Id, @Param("seeds_DiscussId") int seeds_DiscussId);
    //写互评部分
    public int writeMutualDiscuss(Seeds_MutualDiscuss seeds_MutualDiscuss);
    //点赞
    public void updateMLikes(int seeds_MutualDiscussId);
    //写时间
    public void writeMTime(@Param("date") Date date, @Param("seeds_MutualDiscussId") int seeds_MutualDiscussId);
    //写用户Id
    public void writeMUserId(@Param("user_Id") int user_Id,@Param("seeds_MutualDiscussId") int seeds_MutualDiscussId);
    //写入评论Id
    public void writeDiscussId(@Param("discuss_Id") int discuss_Id,@Param("seeds_MutualDiscussId") int seeds_MutualDiscussId);
}
