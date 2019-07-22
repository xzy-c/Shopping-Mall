package com.xzy.pojo;

public class Goods {
    private Integer goodsId;

    private Integer smallCateId;

    private String goodsname;

    private Float unitprice;

    private Integer commentsnumber;

    private String picture;

    private String descr;

    public Goods(Integer goodsId, Integer smallCateId, String goodsname, Float unitprice, Integer commentsnumber, String picture, String descr) {
        this.goodsId = goodsId;
        this.smallCateId = smallCateId;
        this.goodsname = goodsname;
        this.unitprice = unitprice;
        this.commentsnumber = commentsnumber;
        this.picture = picture;
        this.descr = descr;
    }

    public Goods() {
        super();
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getSmallCateId() {
        return smallCateId;
    }

    public void setSmallCateId(Integer smallCateId) {
        this.smallCateId = smallCateId;
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname == null ? null : goodsname.trim();
    }

    public Float getUnitprice() {
        return unitprice;
    }

    public void setUnitprice(Float unitprice) {
        this.unitprice = unitprice;
    }

    public Integer getCommentsnumber() {
        return commentsnumber;
    }

    public void setCommentsnumber(Integer commentsnumber) {
        this.commentsnumber = commentsnumber;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture == null ? null : picture.trim();
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr == null ? null : descr.trim();
    }
}