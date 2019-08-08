package com.xzy.controller;

import com.common.ServerResponse;
import com.xzy.pojo.Goods;
import com.xzy.pojo.GoodsEva;
import com.xzy.pojo.Small_Cate;
import com.xzy.service.base.GoodsEvaService;
import com.xzy.service.base.GoodsService;
import com.xzy.vo.CommentVo;
import com.xzy.vo.GoodVo;
import com.xzy.vo.ReplyVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * 商品详情页面模块
 */
@RestController
@RequestMapping("/goods")
public class GoodsController {

    private GoodsService goodsService;

    private GoodsEvaService goodsEvaService;


    @Autowired
    public void setGoodsService(GoodsService goodsService) {
        this.goodsService = goodsService;
    }

    @Autowired
    public void setGoodsEvaService(GoodsEvaService goodsEvaService) {
        this.goodsEvaService = goodsEvaService;
    }



    // 一级列表
    @RequestMapping("/querygoods.action")

    public String findSmall_Cate(int Big_Cate_ID, Model model) {

        List<Small_Cate> goodsList = goodsService.getSmall_Cate(Big_Cate_ID);
        model.addAttribute("Small_Cate", goodsList);
        return "success";
    }

    @RequestMapping("/getGoods.action")
    public String findGoods(int Small_Cate_ID, Model model) {

        List<Goods> goodsList = goodsService.getGoods(Small_Cate_ID);
        model.addAttribute("Goods", goodsList);
        return "success1";
    }


    /**
     * 增添新商品(用于测试)
     * @param goods
     * @return
     */
    @RequestMapping(value = "/addNewGoods.action",method = RequestMethod.POST)
    public ServerResponse addNewGoods(Goods goods) {
        return goodsService.addNewGoods(goods);
    }


    /**
     * 获取商品具体信息  基本信息+收藏人数+所在商铺+库存+成交量
     * @param goodId
     * @return
     */
    @RequestMapping(value = "/getGoodInfo.action",method = RequestMethod.GET)
    public ServerResponse<GoodVo> getGoodInfo(Integer goodId) {
        if (goodId == null) {
            return ServerResponse.createByErrorMessage("参数错误!");
        }
        return goodsService.getGoodInfo(goodId);
    }

    /**
     * 收藏商品
     * @param userId
     * @param goodId
     * @return
     */
    @RequestMapping(value = "/loveGood.action",method = RequestMethod.POST)
    public ServerResponse loveGoods(Integer userId, Integer goodId) {
        if (userId == null || goodId == null) {
            return ServerResponse.createByErrorMessage("参数错误!");
        }
        return goodsService.loveGoods(userId,goodId);
    }


    /**
     * 判断是否领取了该店铺的优惠券 若已领取,返回失败;否则响应成功
     * @param userId
     * @param shopId
     * @return
     */
    @RequestMapping(value = "/ifGetCoupon.action",method = RequestMethod.GET)
    public ServerResponse ifGetCoupon(Integer userId, Integer shopId) {
        if (userId == null || shopId == null) {
            return ServerResponse.createByErrorMessage("参数错误!");
        }
        return goodsService.ifGetCoupon(userId,shopId);
    }

    /**
     * 添加评论
     * @param goodsEva
     * @return
     */
    @RequestMapping(value = "/addComment.action",method = RequestMethod.POST)
    public ServerResponse addComment(GoodsEva goodsEva) {
        if (goodsEva.getUserId() == null || goodsEva.getGoodsId() == null) {
            return ServerResponse.createByErrorMessage("参数错误!");
        }
        return goodsEvaService.addComment(goodsEva);
    }

    /**
     * 回复评论
     */
    @RequestMapping(value = "/replyComment.action",method = RequestMethod.POST)
    public ServerResponse replyComment(Integer goodsEvaId, Integer userId, String content, @RequestParam(value = "imageFile", required = false)
            MultipartFile image, HttpServletRequest request) {
        if (goodsEvaId == null || userId == null) {
            return ServerResponse.createByErrorMessage("参数错误!");
        }
        String imagePath = null;

        if (image != null) {
            String projectServerPath = request.getScheme() + "://" + request.getServerName() + ":" +
                    request.getServerPort() + request.getContextPath() + "/upload/";
            String path = request.getSession().getServletContext().getRealPath("/WEB-INF/upload/");

            String fileName = image.getOriginalFilename();

            File file = new File(path + fileName);
            if (!file.getParentFile().exists()) {

                file.getParentFile().mkdirs();
            }
            try {
                image.transferTo(new File(path + File.separator + fileName));
            } catch (IOException e) {
                e.printStackTrace();
            }
            imagePath = projectServerPath + fileName;
        }


        return goodsEvaService.replyComment(goodsEvaId,userId,content,imagePath);
    }

    /**
     * 获取评论信息 包括:评论人id,昵称,头像url,评论id,评论内容,回复数量
     * @param goodsId
     * @return
     */
    @RequestMapping(value = "/getComment.action",method = RequestMethod.GET)
    public ServerResponse<List<CommentVo>> getComment(Integer goodsId) {
        if (goodsId == null) {
            return ServerResponse.createByErrorMessage("参数错误!");
        }
        return goodsEvaService.getComment(goodsId);
    }

    /**
     * 获取一个评论下面的回复内容
     */
    @RequestMapping(value = "/getReply.action",method = RequestMethod.GET)
    public ServerResponse<List<ReplyVo>> getReply(Integer goodsEvaId) {
        if (goodsEvaId == null) {
            return ServerResponse.createByErrorMessage("参数错误!");
        }
        return goodsEvaService.getReply(goodsEvaId);
    }


}
