package com.duchenyu.cms.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.duchenyu.cms.pojo.User;

public interface UserDao {
		
	
		List<User> select(@Param("user")User user);
		
		int insert(@Param("user")User user);
		
		User selectById(@Param("id")Integer id);
		
		int update(@Param("user")User user);
		
		int deleteById(@Param("user")User user);
		
		int deleteByIds(@Param("ids")String ids);
}
