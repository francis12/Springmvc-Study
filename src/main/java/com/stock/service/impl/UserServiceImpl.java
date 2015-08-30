package com.stock.service.impl;

import org.springframework.stereotype.Service;

import com.stock.dao.IUserDao;
import com.stock.model.User;
import com.stock.service.IUserService;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements IUserService {
	
	@Resource
	private IUserDao userDao;
	private SqlSessionTemplate sqlSessionTemplate;  
	
	public User getUserById(int userId) {
		return this.userDao.selectByPrimaryKey(userId);
	}

}
