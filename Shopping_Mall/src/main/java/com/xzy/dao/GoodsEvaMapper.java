package com.xzy.dao;

import com.xzy.pojo.GoodsEva;
import com.xzy.vo.ReplyVo;
import com.xzy.vo.UserInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodsEvaMapper {
    int insert(GoodsEva record);

    int insertSelective(GoodsEva record);

    int addReply(@Param("goodsEvaId") Integer goodsEvaId, @Param("userId") Integer userId, @Param("content") String content,
                 @Param("imagePath") String imagePath);

    List<GoodsEva> getCommentList(Integer goodsId);

    UserInfo getUserInfo(Integer userId);

    int getReplyNum(Integer goodsEvaId);

    List<ReplyVo> getReply(Integer goodsEvaId);

}