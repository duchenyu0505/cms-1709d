package com.duchenyu.cms.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.duchenyu.cms.common.CmsConstant;
import com.duchenyu.cms.common.JsonResult;
import com.duchenyu.cms.pojo.Tousu;
import com.duchenyu.cms.pojo.User;
import com.duchenyu.cms.service.TousuService;

@Controller
@RequestMapping("/tousu/")
public class TousuController {
	
	@Autowired
	private TousuService tousuService;
	/**
	 * @Title: add   
	 * @Description: 添加评论 
	 * @param: @param comment
	 * @param: @return      
	 * @return: JsonResult      
	 * @throws
	 */
	@RequestMapping("add")
	public @ResponseBody JsonResult add(Tousu tousu,HttpSession session) {
		User userInfo = (User) session.getAttribute(CmsConstant.UserSessionKey);
		
		if(userInfo==null) {
			return JsonResult.fail(CmsConstant.unLoginErrorCode,"用户未登录");
		}
		tousu.setUserId(userInfo.getId());
		boolean add = tousuService.add(tousu);
		if(add) {
			return JsonResult.sucess();
		}
		
		return JsonResult.fail(10000, "未知错误");
	}
	
}
