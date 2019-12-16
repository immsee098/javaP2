package com.springweb.pd.controller;

import java.sql.SQLException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.springweb.pd.model.PdDTO;
import com.springweb.pd.model.PdService;

@Controller
@RequestMapping("/pd/pdEdit.do")
public class PdEditController {
	private PdService pdService;
	
	public PdEditController() {
		System.out.println("PdEditController 생성자 호출");
	}
	
	//DI - setter를 이용한 종속객체 주입
	public void setPdService(PdService pdService) {
		this.pdService = pdService;
		System.out.println("PdEditController - setPdService() 호출!");
	}

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView pdEdit_get(
			@RequestParam(defaultValue = "0") int no) {
		//1
		System.out.println("수정 화면 보여주기, 파라미터 no="+no);
		
		ModelAndView mav = new ModelAndView();
		if(no==0) {
			mav.addObject("msg", "잘못된 url입니다.");
			mav.addObject("url", "/pd/pdList.do");
			mav.setViewName("common/message");
			
			return mav;
		}
		
		//2
		PdDTO dto=null;
		
		try {
			dto=pdService.selectByNo(no);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		//3
		mav.addObject("pdDto", dto);
		mav.setViewName("pd/pdEdit");
		
		return mav;
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView pdEdit_post(@ModelAttribute PdDTO pdDto) {
		//1
		System.out.println("상품 수정 처리, 파라미터 pdDto="+pdDto);
		
		//2
		String msg="상품 수정 실패", url="/pd/pdEdit.do?no="+pdDto.getNo();
		try {
			int cnt=pdService.updatePd(pdDto);
			if(cnt>0) {
				msg="상품수정 성공!";
				url="/pd/pdDetail.do?no="+pdDto.getNo();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		//3
		ModelAndView mav=new ModelAndView();
		mav.addObject("msg", msg);
		mav.addObject("url", url);
		mav.setViewName("common/message");
		
		return mav;
	}
	
	
	
}
