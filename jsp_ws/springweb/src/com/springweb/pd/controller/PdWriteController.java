package com.springweb.pd.controller;

import java.sql.SQLException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.springweb.pd.model.PdDTO;
import com.springweb.pd.model.PdService;

@Controller
public class PdWriteController {
	private PdService pdService;
	
	public PdWriteController() {
		System.out.println("PdWriteController 생성자 호출");
	}

	//DI - setter에 의한 종속객체 주입
	public void setPdService(PdService pdService) {
		this.pdService = pdService;
		
		System.out.println("PdWriteController-setPdService() 호출!");
	}


	@RequestMapping(value = "/pd/pdWrite.do", method = RequestMethod.GET)
	public ModelAndView pdWrite_get() {
		System.out.println("상품 등록 화면 보여주기");
		
		//1
		
		//2
		
		//3
		ModelAndView mav=new ModelAndView();
		mav.setViewName("pd/pdWrite");
		
		return mav;
	}
	
	@RequestMapping(value="/pd/pdWrite.do", method = RequestMethod.POST)
	public ModelAndView pdWrite_post(@ModelAttribute PdDTO pdDto) {
		//1
		System.out.println("상품 등록 처리, 파라미터 pdDto="+pdDto);
		
		//2
		String msg="상품등록 실패", url="/pd/pdWrite.do";
		try {
			int cnt=pdService.insertPd(pdDto);
			if(cnt>0) {
				msg="상품 등록 성공";
				url="/pd/pdList.do";
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		//3
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", msg);
		mav.addObject("url", url);
		mav.setViewName("common/message");
		
		return mav;
	}
	
	
}







