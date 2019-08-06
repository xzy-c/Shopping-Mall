package com.xzy.vo;

import java.util.Date;
import java.util.List;

public class Discuss {
    private String user_Pic;
    private String user_Name;
    private String comment;
    private Date time;
    private int likes;
    private List<MutualDiscuss> listM;

    public List<MutualDiscuss> getListM() {
        return listM;
    }

    public void setListM(List<MutualDiscuss> listM) {
        this.listM = listM;
    }

    public String getUser_Name() {
        return user_Name;
    }

    public void setUser_Name(String user_Name) {
        this.user_Name = user_Name;
    }

    public String getUser_Pic() {
        return user_Pic;
    }

    public void setUser_Pic(String user_Pic) {
        this.user_Pic = user_Pic;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }
}
