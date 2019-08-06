package com.xzy.vo;

import java.util.Date;
import java.util.List;

public class Up {
    private List<String> path;
    private String title;
    private String description;
    private String user_Name;
    private String user_Pic;
    private Date time;
    private int likes;

    public List<String> getPath() {
        return path;
    }

    public void setPath(List<String> path) {
        this.path = path;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
