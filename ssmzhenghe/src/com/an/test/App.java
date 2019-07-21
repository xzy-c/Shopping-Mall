package com.an.test;

import java.util.Date;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.an.bean.User;
import com.an.dao.UserMapper;

public class App {
	public static void main(String[] args) {
		//´´½¨springiocÈÝÆ÷
		ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		SqlSessionFactory factroy=(SqlSessionFactory) app.getBean("sqlSessionFactory");
		SqlSession sqlsession=factroy.openSession();
		UserMapper userMapper=sqlsession.getMapper(UserMapper.class);
		User u=new User();
		u.setUid(5);
		u.setUname("zs");
		u.setBirthday(new Date());
		u.setMoney(666d);
		userMapper.insertSelective(u);
		System.out.println("over");
		
	}
}