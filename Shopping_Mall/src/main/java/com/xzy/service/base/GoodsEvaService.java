package com.xzy.service.base;

import com.common.ServerResponse;
import com.xzy.pojo.GoodsEva;
import com.xzy.vo.CommentVo;
import com.xzy.vo.ReplyVo;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface GoodsEvaService {
    ServerResponse addComment(GoodsEva goodsEva);

    ServerResponse replyComment(Integer goodsEvaId, Integer userId, String content, String imagePath);

    ServerResponse<List<CommentVo>> getComment(Integer goodsId);

    ServerResponse<List<ReplyVo>> getReply(Integer goodsEvaId);
}
