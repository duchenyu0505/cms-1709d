package com.duchenyu.cms.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.duchenyu.cms.common.JsonResult;
import com.duchenyu.cms.pojo.Me;
import com.duchenyu.cms.service.MeService;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("/admin/me/")
public class MeController {

		@Autowired
		private MeService meService;
		
		@RequestMapping("list")
		public String list(Me me,Model model,
				@RequestParam(value="pageNum",defaultValue="1") int pageNum,@RequestParam(value="pageSize",defaultValue="3") int pageSize) {
			PageInfo<Me> pageInfo = meService.getPageInfo(me,pageNum,pageSize);
			model.addAttribute("pageInfo", pageInfo);
			model.addAttribute("me",me);
			return "me/list";
		}
		
		
		//编辑
		@RequestMapping("edit")
		public String update(Integer id,Model m) {
			if(id!=null) {
				Me me = meService.getById(id);
				m.addAttribute("me", me);
			}
			
			return "me/edit";
		}
		
		@RequestMapping("save")
		@ResponseBody
		public JsonResult save(Me me,Model m) {
			System.out.println(me+"1111111111111111111111");
			meService.save(me);
			
			return JsonResult.sucess();
		}
		
		@RequestMapping("delByIds")
		@ResponseBody
		public JsonResult delByIds(String ids,Model m) {
			meService.delByIds(ids);
			return JsonResult.sucess();
		}
}
