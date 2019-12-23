package com.duchenyu.cms.common;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;

import com.duchenyu.cms.pojo.User;
import com.duchenyu.cms.service.UserService;

public class AuthUserInterceptor implements HandlerInterceptor{

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		Object userInfo = request.getSession().getAttribute(CmsConstant.UserSessionKey);
		if(userInfo!=null) {
			return true;
		}
		String cookieByName = CookieUtil.getCooieByName(request,"username");
		if(cookieByName!=null) {
			UserService userService = SpringBeanUtils.getBean(UserService.class);
			userInfo = userService.getByUsername(cookieByName);
			request.getSession().setAttribute(CmsConstant.UserSessionKey, userInfo);
		}
	    response.sendRedirect("/user/login");
		return false;
	}

}