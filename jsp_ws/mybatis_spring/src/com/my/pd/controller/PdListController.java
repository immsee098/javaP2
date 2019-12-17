package com.my.pd.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.my.pd.model.PdDTO;
import com.my.pd.model.PdService;

@Controller
public class PdListController {
	private PdService pdService;
	
	public PdListController() {
		System.out.println("PdListController 생성자 호출");
	}
	
	//DI - setter에 의한 종속객체 주입
	public void setPdService(PdService pdService) {
		this.pdService = pdService;
		System.out.println("PdListController-setPdService() 호출!");
	}

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
