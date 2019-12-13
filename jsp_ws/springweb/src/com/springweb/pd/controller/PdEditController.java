package com.springweb.pd.controller;

import java.sql.SQLException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.springweb.pd.model.PdDTO;
import com.springweb.pd.model.PdService;

@Controller
@RequestMapping("/pd/pdEdit.do")
public class PdEditController {
	private PdService pdService;
	
	public PdEditController(PdService pdService) {
		this.pdService= pdService;
	}
	
	public void setPdService(PdService pdService) {
		this.pdService = pdService;

	}
	
	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView pdEdit_get(int no) {
		System.out.println("상품 수정 화면 보여주기");
		try {
			PdDTO pdDto = pdService.selectByNo(no);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		ModelAndView mav = new ModelAndView();
		mav.setObject("pdDto", PdDTO);
		mav.setViewName("/pd/Edit");
		return mav;
	}
}
