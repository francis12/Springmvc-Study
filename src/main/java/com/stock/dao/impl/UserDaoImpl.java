package com.stock.dao.impl;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;

import com.stock.dao.IUserDao;
import com.stock.model.User;

@Resource
public class UserDaoImpl implements IUserDao {
	
	private SqlSessionTemplate sqlSessionTemplate;  
	
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int insert(User record) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int insertSelective(User record) {
		// TODO Auto-generated method stub
		return 0;
	}

	public User selectByPrimaryKey(Integer id) {
		sqlSessionTemplate.selectOne("selectByPrimaryKey", id);
		return null;
	}

	public int updateByPrimaryKeySelective(User record) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int updateByPrimaryKey(User record) {
		// TODO Auto-generated method stub
		return 0;
	}

}
