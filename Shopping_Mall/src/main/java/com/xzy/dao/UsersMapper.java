package com.xzy.dao;

import com.xzy.pojo.Users;
import org.springframework.stereotype.Repository;

public interface UsersMapper {
	void addUser(Users user);
}
