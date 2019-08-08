package com.xzy.pojo;

public class GoodsEva {
    private Integer goodsEvaId;

    private Integer userId;

    private Integer goodsId;

    private String goodsEvaMas;

    public GoodsEva(Integer goodsEvaId, Integer userId, Integer goodsId, String goodsEvaMas) {
        this.goodsEvaId = goodsEvaId;
        this.userId = userId;
        this.goodsId = goodsId;
        this.goodsEvaMas = goodsEvaMas;
    }

    public GoodsEva() {
        super();
    }

    public Integer getGoodsEvaId() {
        return goodsEvaId;
    }

    public void setGoodsEvaId(Integer goodsEvaId) {
        this.goodsEvaId = goodsEvaId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsEvaMas() {
        return goodsEvaMas;
    }

    public void setGoodsEvaMas(String goodsEvaMas) {
        this.goodsEvaMas = goodsEvaMas == null ? null : goodsEvaMas.trim();
    }

    @Override
    public String toString() {
        return "GoodsEva{" +
                "goodsEvaId=" + goodsEvaId +
                ", userId=" + userId +
                ", goodsId=" + goodsId +
                ", goodsEvaMas='" + goodsEvaMas + '\'' +
                '}';
    }
}