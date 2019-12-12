package com.duchenyu.cms.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.duchenyu.cms.pojo.Article;
import com.duchenyu.cms.pojo.ArticleTag;
import com.duchenyu.cms.pojo.ArticleVote;

public interface ArticleVoteDao {
	
			//根据ID,查询对象
			Article selectById(@Param("id")Integer id);
			
			
			//根据User查询列表
			List<Article> select(@Param("articleVote")ArticleVote articleVote);
			
			//查询数据条数
			int count(@Param("articleVote")ArticleVote articleVote);
			
			//插入一条记录
			int inset(@Param("articleVote")ArticleVote articleVote);
			
			//根据Id更新记录
			int update(@Param("articleVote")ArticleVote articleVote);
			
			//根据ID删除记录
			int deleteById(@Param("id")Integer id);
			
			//根据ids批量删除记录
			int deleteByIds(@Param("ids")String ids);
}
