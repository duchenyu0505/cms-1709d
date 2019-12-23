package com.duchenyu.cms.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dcy.DateUtil;
import com.duchenyu.cms.dao.TousuDao;
import com.duchenyu.cms.pojo.Tousu;

@Service
public class TousuService {

	@Autowired
	private TousuDao tousuDao;
	
	@Autowired
	private ArticleService articleService;
	
	//添加评论
	
	public boolean add(Tousu tousu) {
		String createdStr = DateUtil.dateTimeFormat.format(new Date());
		
		tousu.setCreated(createdStr);
		
		tousuDao.insert(tousu);
		
		articleService.addTousu(tousu.getArticleId());
		return true;
	}
}
