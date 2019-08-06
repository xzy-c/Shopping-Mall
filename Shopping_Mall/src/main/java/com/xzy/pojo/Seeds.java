package com.xzy.pojo;

import java.util.Date;

public class Seeds {
    private int seeds_Id;
    private int user_Id;
    private int likes;
    private String cover;
    private int collections;
    private String title;
    private String description;
    private Date releasetime;

    public int getSeeds_Id() {
        return seeds_Id;
    }

    public void setSeeds_id(int seeds_id) {
        this.seeds_Id = seeds_Id;
    }

    public int getUser_Id() {
        return user_Id;
    }

    public void setUser_Id(int user_Id) {
        this.user_Id = user_Id;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public int getCollections() {
        return collections;
    }

    public void setCollections(int collections) {
        this.collections = collections;
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

    public Date getReleasetime() {
        return releasetime;
    }

    public void setReleasetime(Date releasetime) {
        this.releasetime = releasetime;
    }
}
