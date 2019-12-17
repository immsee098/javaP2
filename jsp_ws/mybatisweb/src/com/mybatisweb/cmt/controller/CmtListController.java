package com.mybatisweb.cmt.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mybatisweb.cmt.model.CommentVO;
import com.mybatisweb.pd.model.PdService;

@Controller
public class CmtListController {
	private PdService pdService;
		
	//DI
	public void setPdService(PdService pdService) {
		this.pdService = pdService;
	}

	@RequestMapping("/comment/cmtList.do")
	public ModelAndView cmtList() {
		//1
		
		//2
		List<CommentVO> list=pdService.selectCmtAll();
		System.out.println("comment 전체조회 결과 list.size="+list.size());
		
		//3
		ModelAndView mav=new ModelAndView();
		mav.addObject("list", list);
		mav.setViewName("comment/cmtList");
		
		return mav;
	}
	
}
