package com.duchenyu.cms.service;

import com.duchenyu.cms.pojo.User;

public interface UserService {
		
	
	 //注册新增用户
	boolean register(User user);
	
	//根据登录用户，查询用户
	User getByUsername(String username);
	
	//锁用户
	boolean unLocked(Integer userId);
	
	//给用户添加几分
	int addScore(Integer userId,int score);
}
