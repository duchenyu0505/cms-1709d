package com.duchenyu.cms.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.duchenyu.cms.pojo.Article;
import com.duchenyu.cms.pojo.Category;
import com.duchenyu.cms.pojo.Channel;

public interface ChannelDao {

		//根据ID,查询对象
		Article selectById(@Param("id")Integer id);
		
		
		//根据User查询列表
		List<Article> select(@Param("channel")Channel channel);
		
		//查询数据条数
		int count(@Param("channel")Channel channel);
		
		//插入一条记录
		int inset(@Param("channel")Channel channel);
		
		//根据Id更新记录
		int update(@Param("channel")Channel channel);
		
		//根据ID删除记录
		int deleteById(@Param("id")Integer id);
		
		//根据ids批量删除记录
		int deleteByIds(@Param("ids")String ids);
}
