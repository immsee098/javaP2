package com.mybatisweb.pd.controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mybatisweb.pd.model.PdDTO;
import com.mybatisweb.pd.model.PdService;

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
	public ModelAndView pdList(){
		System.out.println("상품 목록");
		
		//1
		
		//2
		List<PdDTO> list=null;
		try {
			list=pdService.selectAll();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		//3
		ModelAndView mav=new ModelAndView();
		mav.addObject("list", list);
		mav.setViewName("pd/pdList");
		
		return mav; 
	}
	
}
