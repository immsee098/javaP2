package com.my.pd.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.my.pd.model.PdDTO;
import com.my.pd.model.PdService;

@Controller
public class PdListController {
	@Autowired
	private PdService pdService;
		
	@RequestMapping("/pd/pdList.do")
	public ModelAndView pdList(
			@RequestParam(required = false) String pdName){
		//1
		System.out.println("상품 목록, 파라미터 pdName="+pdName);
		
		//2
		Map<String, String> paramMap=new HashMap<String, String>();
		paramMap.put("pdName", pdName);
		
		List<PdDTO> list=pdService.selectAll(paramMap);
		System.out.println("상품목록 결과, list.size="+list.size());
		
		//3
		ModelAndView mav=new ModelAndView();
		mav.addObject("list", list);
		mav.setViewName("pd/pdList");
		
		return mav; 
	}
	
}
