package com.xzy.controller;

import com.xzy.pojo.Seeds;
import com.xzy.pojo.Seeds_Discuss;
import com.xzy.pojo.Seeds_MutualDiscuss;
import com.xzy.pojo.User;
import com.xzy.service.base.SeedsIndex;
import com.xzy.service.base.WriteDiscussService;
import com.xzy.service.base.WriteService;
import com.xzy.utils.FileUpLodeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class WriteController {
    @Autowired
    private SeedsIndex si;
    @Autowired
    private WriteService ws;
    @Autowired
    private WriteDiscussService wd;
    @RequestMapping("/updateLikes")
    //前端传id值
    public void like1(int seeds_Id)
    {
        ws.updateLikes(seeds_Id);
    }
    @RequestMapping("/updateDiscussLikes")
    public void like2(int seeds_DiscussId)
    {
        wd.updateLikes(seeds_DiscussId);
    }
    @RequestMapping("/updateMutualDiscussLikes")
    public void like3(int seeds_MutualDiscussId)
    {
        wd.updateMLikes(seeds_MutualDiscussId);
    }
    @RequestMapping("/write")
    public void write(Seeds seeds, HttpServletRequest request, HttpServletResponse response)throws Exception
    {
        List<MultipartFile> files=((MultipartHttpServletRequest) request).getFiles("paths");
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        int sort=1;
        for (MultipartFile seeds_Rotation:files) {

            //获取图片名称
            String fileStr = seeds_Rotation.getOriginalFilename();
            //获取项目下图片路径
            String path = session.getServletContext().getRealPath("files/") + fileStr;
            //将图片保存到项目下
            seeds_Rotation.transferTo(new File(path));
            String url = FileUpLodeUtil.fileUpload(path);
            ws.writeSeedsRotation(seeds.getSeeds_Id(),url,sort);
            sort++;
        }
        //有问题获取图片


        String cover=si.getCover(seeds.getSeeds_Id());
        ws.write(seeds);
        ws.writeUserId(user.getUser_Id(),seeds.getSeeds_Id());
        ws.writeCover(cover,seeds.getSeeds_Id());
        ws.writeReleasetime(new Date(),seeds.getSeeds_Id());
    }
    @RequestMapping("/writeDiscuss")
    public void writeDisucss(Seeds_Discuss seeds_Discuss,HttpServletRequest request, HttpServletResponse response)
    {
        HttpSession session=request.getSession();
        User user=(User) session.getAttribute("user");
        int seeds_Id=(int) session.getAttribute("seeds_Id");
        wd.writeDiscuss(seeds_Discuss);
        wd.writeUserId(user.getUser_Id(),seeds_Discuss.getSeeds_DiscussId());
        wd.writeTime(new Date(),seeds_Discuss.getSeeds_DiscussId());
        wd.writeSeedsId(seeds_Id,seeds_Discuss.getSeeds_DiscussId());
    }
    @RequestMapping("/writeMutualDiscuss")
    public void writeMutualDiscuss(Seeds_MutualDiscuss seeds_MutualDiscuss,HttpServletRequest request, HttpServletResponse response)
    {
        HttpSession seesion=request.getSession();
        User user=(User) seesion.getAttribute("user");
        int seeds_DiscussId=(int) seesion.getAttribute("seeds_DiscussId");
        wd.writeMutualDiscuss(seeds_MutualDiscuss);
        wd.writeMUserId(user.getUser_Id(),seeds_MutualDiscuss.getSeeds_MutualDiscuss());
        wd.writeMTime(new Date(),seeds_MutualDiscuss.getSeeds_MutualDiscuss());
        wd.writeDiscussId(seeds_DiscussId,seeds_MutualDiscuss.getSeeds_MutualDiscuss());
    }


}
