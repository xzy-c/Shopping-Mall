package com.xzy.pojo;

import java.util.Date;

public class Seeds_MutualDiscuss {
    private int seeds_MutualDiscussId;
    private int seeds_DiscussId;
    private int user_Id;
    private String comment;
    private int likes;
    private Date time;

    public int getSeeds_MutualDiscuss() {
        return seeds_MutualDiscussId;
    }

    public void setSeeds_MutualDiscuss(int seeds_MutualDiscussId) {
        this.seeds_MutualDiscussId = seeds_MutualDiscussId;
    }

    public int getSeeds_DiscussId() {
        return seeds_DiscussId;
    }

    public void setSeeds_DiscussId(int seeds_DiscussId) {
        this.seeds_DiscussId = seeds_DiscussId;
    }

    public int getUser_Id() {
        return user_Id;
    }

    public void setUser_Id(int user_Id) {
        this.user_Id = user_Id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
