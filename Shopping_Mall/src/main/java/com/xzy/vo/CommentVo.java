package com.xzy.vo;

public class CommentVo {
    private Integer goodsEvaId;
    private UserInfo userInfo;
    private String comment;
    private int replyNum;

    public CommentVo(Integer goodsEvaId, UserInfo userInfo, String comment, int replyNum) {
        this.goodsEvaId = goodsEvaId;
        this.userInfo = userInfo;
        this.comment = comment;
        this.replyNum = replyNum;
    }

    public Integer getGoodsEvaId() {
        return goodsEvaId;
    }

    public void setGoodsEvaId(Integer goodsEvaId) {
        this.goodsEvaId = goodsEvaId;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getReplyNum() {
        return replyNum;
    }

    public void setReplyNum(int replyNum) {
        this.replyNum = replyNum;
    }
}
