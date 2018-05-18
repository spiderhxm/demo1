package com.huxm.demo.demo1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huxm.demo.demo1.dao.auto.UserMapper;
import com.huxm.demo.demo1.entity.auto.User;

@Service("userServiceImpl")
public class UserService {
	@Autowired
	private UserMapper userMapper;
	
	public void add(User user) {
		userMapper.insert(user);
		
	}

}
