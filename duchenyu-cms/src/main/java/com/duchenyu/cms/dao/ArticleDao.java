package com.duchenyu.cms.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.duchenyu.cms.pojo.Article;

public interface ArticleDao {
	
	//根据ID,查询对象
		Article selectById(@Param("id")Integer id);
		
		
		//根据User查询列表
		List<Article> select(@Param("article")Article article);
		
		//查询数据条数
		int count(@Param("article")Article article);
		
		//插入一条记录
		int inset(@Param("article")Article article);
		
		//根据Id更新记录
		int update(@Param("article")Article article);
		
		//根据ID删除记录
		int deleteById(@Param("id")Integer id);
		
		//根据ids批量删除记录
		int deleteByIds(@Param("ids")String ids);
}
