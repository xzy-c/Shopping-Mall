package com.xzy.vo;

public class ReplyVo {
    private Integer userId;
    private String username;
    private String avatar;
    private String reply;
    private String imagePath;

    public ReplyVo(Integer userId, String username, String avatar, String reply, String imagePath) {
        this.userId = userId;
        this.username = username;
        this.avatar = avatar;
        this.reply = reply;
        this.imagePath = imagePath;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getReply() {
        return reply;
    }

    public void setReply(String reply) {
        this.reply = reply;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }
}
