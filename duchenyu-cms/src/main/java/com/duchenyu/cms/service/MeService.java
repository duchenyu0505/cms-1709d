package com.duchenyu.cms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.duchenyu.cms.dao.MeDao;
import com.duchenyu.cms.pojo.Link;
import com.duchenyu.cms.pojo.Me;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class MeService {

	@Autowired
	private MeDao meDao;
	
	public PageInfo<Me> getPageInfo(Me me,int pageNum,int pageSize){
		PageHelper.startPage(pageNum, pageSize);
		
		List<Me> userList=meDao.list(me);
		
		return new PageInfo<>(userList);
		
	}
	
	public boolean delByIds(String ids) {
		return meDao.deleteByIds(ids)>0;
	}
	
	public boolean save(Me me) {
		if(me.getId()==null) {
			return meDao.insert(me)>0;
		}
		
		return meDao.update(me)>0;
	}
	
	public Me getById(Integer id) {
		return meDao.selectById(id);
	}
	
	
	
}
