package com.duchenyu.cms.service.impl;

import org.springframework.stereotype.Service;

import com.duchenyu.cms.pojo.User;
import com.duchenyu.cms.service.UserService;
@Service
public class UserServiceImpl implements UserService{

	@Override
	public boolean register(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public User getByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean unLocked(Integer userId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int addScore(Integer userId, int score) {
		// TODO Auto-generated method stub
		return 0;
	}

}
