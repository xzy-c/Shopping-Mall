package com.an.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.an.bean.User;
import com.an.service.IuserService;
@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
private IuserService userService;
	
	
	@RequestMapping("/save")
	public String save(User user){
		userService.save(user);
 
		return "result"; 
	}
	
	@RequestMapping("/findAll")
	public String findAll(){
		List<User> lists=userService.findAll();
 
		return "result"; 
	}

}
