package com.duchenyu.cms.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.duchenyu.cms.pojo.Comment;
import com.duchenyu.cms.pojo.Tousu;

public interface TousuDao {
		
	/**
	 * @Title: selectById   
	 * @Description: 根据Id，查询对象   
	 * @param: @param id
	 * @param: @return      
	 * @return: Tousu      
	 * @throws
	 */
	Comment selectById(@Param("id") Integer id);
	/**
	 * @Title: select   
	 * @Description: 根据Tousu查询列表  
	 * @param: @param Tousu
	 * @param: @return      
	 * @return: List<Tousu>      
	 * @throws
	 */
	List<Comment> select(@Param("Tousu") Tousu tousu);
	/**
	 * @Title: count   
	 * @Description: 查询数据条数   
	 * @param: @param Tousu
	 * @param: @return      
	 * @return: int      
	 * @throws
	 */
	int count(@Param("Tousu") Tousu tousu);
	/**
	 * @Title: insert   
	 * @Description: 插入一条记录   
	 * @param: @param Tousu
	 * @param: @return      
	 * @return: int      
	 * @throws
	 */
	int insert(@Param("tousu") Tousu tousu);
	/**
	 * @Title: update   
	 * @Description: 根据Id更新记录 
	 * @param: @param Tousu
	 * @param: @return      
	 * @return: int      
	 * @throws
	 */
	int update(@Param("Tousu") Tousu tousu);
	/**
	 * @Title: deleteById   
	 * @Description: 根据Id删除记录   
	 * @param: @param id
	 * @param: @return      
	 * @return: int      
	 * @throws
	 */
	int deleteById(@Param("id") Integer id);
	/**
	 * @Title: deleteByIds   
	 * @Description: 根据Ids批量删除记录   
	 * @param: @param ids "1,2,3"
	 * @param: @return      
	 * @return: int      
	 * @throws
	 */
	int deleteByIds(@Param("ids") String ids);
}
