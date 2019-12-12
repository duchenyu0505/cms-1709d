package com.duchenyu.cms.service;

import com.duchenyu.cms.pojo.User;
import com.github.pagehelper.PageInfo;

public interface UserService {
		
	
	 //注册新增用户
	boolean register(User user);
	
	//根据登录用户，查询用户
	User getByUsername(String username);
	
	boolean locked(Integer userId);
	
	//锁用户
	boolean unLocked(Integer userId);
	
	//给用户添加几分
	int addScore(Integer userId,int score);
	
	//用户列表查询
	PageInfo<User> getPageInfo(User user,int pageNum,int pageSize);
}
