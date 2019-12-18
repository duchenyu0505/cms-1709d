package com.duchenyu.cms.controller.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.duchenyu.cms.pojo.Article;
import com.duchenyu.cms.pojo.Channel;
import com.duchenyu.cms.pojo.User;
import com.duchenyu.cms.service.ArticleService;
import com.duchenyu.cms.service.UserService;
import com.github.pagehelper.PageInfo;


@Controller
@RequestMapping("/admin/")
public class AdminController {
	
	@Autowired
	private UserService service;
	
	@Autowired
	private ArticleService articleService;
	@RequestMapping("/")
	public String login() {
		return "admin/login";
	}
	
	@RequestMapping("/home")
	public String home() {
		return "admin/home";
	}
	
	@RequestMapping("/welcome")
	public String welcome() {
		return "admin/welcome";
	}
	
	@RequestMapping("/user")
	public String user(User user,Model m,@RequestParam(value = "pageNum",defaultValue = "1")Integer pageNum
			,@RequestParam(value = "pageSize",defaultValue = "3")Integer pageSize) {
			PageInfo<User> pageInfo=service.getPageInfo(user, pageNum, pageSize);
			m.addAttribute("pageInfo",pageInfo);
		return "admin/user";
	}
	
	@ResponseBody
	@RequestMapping("/user/locked")
	public boolean locked(Integer userId) {
		boolean b = service.locked(userId);
		
		return b;
	}
	
	//文章管理
	@RequestMapping("/article")
	public String article(Article article,Model model,
			@RequestParam(value="pageNum",defaultValue="1") int pageNum,@RequestParam(value="pageSize",defaultValue="3") int pageSize) {
		//设置文章状态
		article.setStatusIds("0,-1,1");
		PageInfo<Article> pageInfo = articleService.getPageInfo(article,pageNum,pageSize);
		model.addAttribute("pageInfo1", pageInfo);
		List<Channel> channelList = articleService.getChannelList();
		model.addAttribute("channelList", channelList);
		return "admin/article";
	}
	
	@ResponseBody
	@RequestMapping("/user/unlocked")
	public boolean unLocked(Integer userId){
		
		boolean b = service.unLocked(userId);
		System.out.println(b);
		return b;
		
	}
}
