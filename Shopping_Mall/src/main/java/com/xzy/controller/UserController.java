package com.xzy.controller;

import com.xzy.pojo.Goods;
import com.xzy.service.base.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    @Autowired
    private UserService us;
    @RequestMapping("/useradd.action")
    public String addUsers(Goods user, Model model){
        us.addUser(user);
        model.addAttribute("user",user);
        return "success";
    }
}
