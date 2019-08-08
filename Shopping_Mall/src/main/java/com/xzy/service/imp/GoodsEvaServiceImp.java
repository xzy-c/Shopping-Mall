package com.xzy.service.imp;

import com.common.ServerResponse;
import com.xzy.dao.GoodsEvaMapper;
import com.xzy.pojo.GoodsEva;
import com.xzy.service.base.GoodsEvaService;
import com.xzy.vo.CommentVo;
import com.xzy.vo.ReplyVo;
import com.xzy.vo.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.xml.stream.events.Comment;
import java.util.ArrayList;
import java.util.List;

@Service
public class GoodsEvaServiceImp implements GoodsEvaService {

    private GoodsEvaMapper goodsEvaMapper;

    @Autowired
    public void setGoodsEvaMapper(GoodsEvaMapper goodsEvaMapper) {
        this.goodsEvaMapper = goodsEvaMapper;
    }


    @Override
    public ServerResponse addComment(GoodsEva goodsEva) {
        int resultCount = goodsEvaMapper.insert(goodsEva);
        if (resultCount > 0) {
            return ServerResponse.createBySuccessMessage("添加评论成功!");
        }
        return ServerResponse.createByErrorMessage("添加评论失败!");
    }

    @Override
    public ServerResponse replyComment(Integer goodsEvaId, Integer userId, String content, String imagePath) {
        int resultCount = goodsEvaMapper.addReply(goodsEvaId,userId,content,imagePath);
        if (resultCount > 0) {
            return ServerResponse.createBySuccessMessage("回复成功!");
        }
        return ServerResponse.createByErrorMessage("回复失败!");
    }

    @Override
    public ServerResponse<List<CommentVo>> getComment(Integer goodsId) {
        List<GoodsEva> commentList = goodsEvaMapper.getCommentList(goodsId);
        List<CommentVo> commentVoList = new ArrayList<>();
        for (GoodsEva comment : commentList) {
            UserInfo userInfo = goodsEvaMapper.getUserInfo(comment.getUserId());
            System.out.println(userInfo);
            int replyNum = goodsEvaMapper.getReplyNum(comment.getGoodsEvaId());
            System.out.println(replyNum);
            CommentVo commentVo = new CommentVo(comment.getGoodsEvaId(),userInfo,comment.getGoodsEvaMas(),replyNum);
            commentVoList.add(commentVo);
        }
        return ServerResponse.createBySuccess(commentVoList);
    }

    @Override
    public ServerResponse<List<ReplyVo>> getReply(Integer goodsEvaId) {
        List<ReplyVo> replyVo = goodsEvaMapper.getReply(goodsEvaId);
        return ServerResponse.createBySuccess(replyVo);
    }


}
