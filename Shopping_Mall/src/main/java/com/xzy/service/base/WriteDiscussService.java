package com.xzy.service.base;

import com.xzy.pojo.Seeds_Discuss;
import com.xzy.pojo.Seeds_MutualDiscuss;

import java.util.Date;

public interface WriteDiscussService {
    //写评论
    public int writeDiscuss(Seeds_Discuss seeds_Discuss);
    //点赞
    public void updateLikes(int seeds_DiscussId);
    //写的时间
    public void writeTime(Date date, int seeds_DiscussId);
    //获取用户Id
    public void writeUserId(int user_Id, int seeds_DiscussId);
    //写入种草Id
    public void writeSeedsId(int seeds_Id,int seeds_DiscussId);
    //写互评部分
    public int writeMutualDiscuss(Seeds_MutualDiscuss seeds_MutualDiscuss);
    //点赞
    public void updateMLikes(int seeds_MutualDiscussId);
    //写时间
    public void writeMTime(Date date, int seeds_MutualDiscussId);
    //写用户Id
    public void writeMUserId(int user_Id, int seeds_MutualDiscussId);
    //写入评论Id
    public void writeDiscussId(int discuss_Id, int seeds_MutualDiscussId);
}
