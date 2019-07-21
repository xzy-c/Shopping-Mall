package com.an.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.an.bean.User;
import com.an.bean.UserExample;
import com.an.dao.UserMapper;
@Service
@Transactional
public class UserServiceImpl implements IuserService{

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public void save(User user) {
		userMapper.insertSelective(user);
		
	}

	@Override
	public void select(Integer uid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<User> findAll() {
		UserExample example=new UserExample();
//		example.or().andUnameEqualTo("zs");
		return userMapper.selectByExample(example);
	}

	@Override
	public User findOne(Integer uid) {
		// TODO Auto-generated method stub
		return null;
	}

}
