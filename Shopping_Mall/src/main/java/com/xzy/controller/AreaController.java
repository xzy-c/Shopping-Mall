package com.xzy.controller;

import com.alibaba.fastjson.JSON;
import com.xzy.pojo.Area;
import com.xzy.pojo.User;
import com.xzy.pojo.User_Addr;
import com.xzy.service.base.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @author yangxin
 * @date 2019/7/29 - 22:38
 * 我的页面---添加地址省市县联动模块
 */

@Controller
@RequestMapping(value = "/area")
public class AreaController {

    @Autowired
    private AreaService areaService;

    //省份Ajax
    @RequestMapping("/provinceQuery")
    @ResponseBody
    public void findProvince(int parentid,Model model, HttpServletResponse response)throws Exception{
        response.setContentType("text/xml;Charset=UTF-8");
        List<Area> list =areaService.findAllArea(parentid);
        String result= JSON.toJSONString(list);
        response.getWriter().println(result);
    }

    //市Ajax
    @RequestMapping("/CityQuery")
    @ResponseBody
    public void findCity(int parentid,Model model, HttpServletResponse response)throws Exception{
        response.setContentType("text/xml;Charset=UTF-8");
        List<Area> list =areaService.findAllArea(parentid);
        String result= JSON.toJSONString(list);
        response.getWriter().println(result);
    }

    //区/县Ajax
    @RequestMapping("/countyQuery")
    @ResponseBody
    public void findCounty(int parentid,Model model, HttpServletResponse response)throws Exception{
        response.setContentType("text/xml;Charset=UTF-8");
        List<Area> list =areaService.findAllArea(parentid);
        String result= JSON.toJSONString(list);
        response.getWriter().println(result);
    }

    /*
          User_Addr_Defaddr为用户点击跳转到添加收货地址后是否点击设置为默认地址的标识
          1为设置为默认地址
          0为未设置默认地址
   */
    //用户添加新的地址
    @RequestMapping("/addAddr")
    public String addUserAddr(User_Addr user_addr, String phidden, String chidden, String dhidden, HttpServletRequest request)throws Exception{
        //从Session中获取用户Id
        User user = (User)request.getSession().getAttribute("user");
        int user_Id=user.getUser_Id();
        //获取前端的地址标识
        int user_Addr_Defaddr = Integer.parseInt(user_addr.getUser_Addr_Defaddr());
        //将所在省信息附给对象
        user_addr.setUser_Addr_Pro(phidden);
        //将所在市信息附给对象
        user_addr.setUser_Addr_City(chidden);
        //将所在区/县信息附给对象
        user_addr.setUser_Addr_County(dhidden);
        user_addr.setUser_Id(user_Id);
        //若默认值为1,更新字段
        if(user_Addr_Defaddr==1){
           areaService.updateDefAddr(user_Id);
        }
        //先判断,若默认值为1,先更新用户所有地址的数据库的默认值字段为0,在插入新的地址
        //若默认值为0,不用更新直接插入
        areaService.addDefAddr(user_addr);
        //跳转到查询所有地址的url,再次查询返回
        return "redirect:/mypage/getAllAddr";
    }
}
