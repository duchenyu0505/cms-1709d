package com.duchenyu.cms.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.duchenyu.cms.pojo.Me;

public interface MeDao {
	
		List<Me> list(@Param("me")Me me);
		
		int update(@Param("me") Me me);
		
		int insert(@Param("me") Me me);
		
		Me selectById(@Param("id") Integer id);
		
		int deleteById(@Param("id") Integer id);
		
		int deleteByIds(@Param("ids") String ids);
}
