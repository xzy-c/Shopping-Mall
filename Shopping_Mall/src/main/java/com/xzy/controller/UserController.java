package com.xzy.controller;

import com.aliyuncs.dysmsapi.model.v20170525.SendSmsResponse;
import com.aliyuncs.exceptions.ClientException;
import com.xzy.pojo.User;
import com.xzy.service.base.UserService;
import com.xzy.untils.Md5Encrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

@Controller

public class UserController {
    @Autowired
    private UserService us;
    @Autowired
    private HttpServletRequest request;



    //转向注册页面
    @RequestMapping("/toregister.aciton")
    public String toregister(){
        return "register";
    }


    //注册
    @RequestMapping("/register.action")
    @ResponseBody
    public String register(@RequestParam String user_Name,@RequestParam String user_Email,
                           @RequestParam String user_Password,@RequestParam String user_Tel)
    {
        User user=new User();

        //对登录密码进行加密
        user_Password= Md5Encrypt.md5(user_Password);

        user.setUser_Name(user_Name);
        user.setUser_Password(user_Password);


        if(us.loginCheck(user) != null){

            return "the user have registered";    //标记用户已经注册
        }
        else{

            user.setUser_Email(user_Email);
            user.setUser_Tel(user_Tel);
            us.register(user);
            return "register sucess";  //标记已经注册成功
        }
    }


    //转向登录页面
    @RequestMapping("/tologin.action")

    public String tologin(){
        return "login";
    }


    //登录验证
    @RequestMapping("/login.action")
    @ResponseBody
    public String  login( @RequestParam String user_Name,@RequestParam String user_Password,Model model){
        User user = new User();
        String p=Md5Encrypt.md5(user_Password);

        user.setUser_Name(user_Name);
        user.setUser_Password(p);

        if(us.loginCheck(user) != null){

            model.addAttribute("user_Name",user_Name);

            HttpSession session = request.getSession();
            session.setAttribute("User", user);
            return "login success";
        }
        else{
            model.addAttribute("error","账号或密码错误");
            return "login again";
        }

    }
    //转向个人资料页面
    @RequestMapping("/toeditUser.action")
    public String toeditUser(){
        return "editUser";
    }



    //退出登录
    @RequestMapping("/tologOut.action")

    public String tologOut(User user){
        //使用Enumeration得到所有session中的信息
        Enumeration em = request.getSession().getAttributeNames();
        //循环遍历，执行removeAttribute()的Session删除操作
        while(em.hasMoreElements()){
            request.getSession().removeAttribute(em.nextElement().toString());
        }

        return "login";
    }


    //接收短信验证码
    @RequestMapping("/accept.action")
    @ResponseBody
    public String acceptSendMessage(@RequestParam String phone) {
        SendSmsResponse sendSmsResponse =null;
        try {
            sendSmsResponse = us.sendMessage(phone);
        } catch (Exception e) {
            e.printStackTrace();
        }
//        System.out.println(sendSmsResponse.getCode());
        request.getSession().setAttribute(phone,sendSmsResponse.getCode());
        return "accept sucess";
    }


    @RequestMapping("/acceptcode.action")
    @ResponseBody
    public String acceptCode(@RequestParam String message,@RequestParam String phone){

        String code=(String) request.getSession().getAttribute(phone);

//        System.out.println(message);
////        System.out.println(code);
        if(message.equals(code)){
            return "message is true ,to update password";
        }
        else {
            return "message is wrong,please accept again";
        }
    }

    //修改密码
    @RequestMapping("/forgetuser_Password.action")
    @ResponseBody
    public String updateuser_Password(@RequestParam String user_Tel,@RequestParam String user_Password)throws ClientException, InterruptedException {
        us.updateuser_Password(user_Tel);
        return "updateuser_Password success";
    }


}





