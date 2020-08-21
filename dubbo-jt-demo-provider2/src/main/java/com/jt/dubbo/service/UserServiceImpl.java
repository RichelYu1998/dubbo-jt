package com.jt.dubbo.service;

import java.util.List;


import com.alibaba.dubbo.config.annotation.Service;
import com.jt.dubbo.mapper.UserMapper;
import com.jt.dubbo.pojo.User;

import javax.annotation.Resource;

@Service(timeout=3000)	//3秒超时
public class UserServiceImpl implements UserService {
	
	@Resource
	private UserMapper userMapper;
	@Override
	public List<User> findAll() {
		System.out.println("我是第二个服务提供者");
		return userMapper.selectList(null);
	}
	
	@Override
	public void saveUser(User user) {
		
		userMapper.insert(user);
	}

}
