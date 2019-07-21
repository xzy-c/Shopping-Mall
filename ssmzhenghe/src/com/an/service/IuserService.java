package com.an.service;

import java.util.List;

import com.an.bean.User;

public interface IuserService {
	public void save(User user);
	public void select(Integer uid);
	public void update(User user);
	public List<User>findAll();
	public User findOne(Integer uid);
	

}
