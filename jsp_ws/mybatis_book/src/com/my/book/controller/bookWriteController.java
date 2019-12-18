package com.my.book.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.my.book.model.BookService;
import com.my.book.model.bookVO;

@Controller
public class bookWriteController {
	
	@Autowired
	private BookService bookService;
	
	@RequestMapping(value="/book/bookWrite.do", method=RequestMethod.GET)
	public ModelAndView bookWrite_get() {
		System.out.println("책 등록 화면입니다");
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("book/bookWrite");
		
		return mav;
	}
	
	@RequestMapping(value="/book/bookWrite.do", method = RequestMethod.POST)
	public ModelAndView bookWrite_post(@ModelAttribute bookVO vo) {
		System.out.println("상품 등록 처리, 파라미터 bookVo="+vo);
		
		String msg = "등록 실패", url="/book/bookWrite.do";
		int cnt = bookService.insertBook(vo);
		System.out.println("상품 등록 결과, cnt-"+cnt);
		
		if(cnt>0) {
			msg="상품 등록 성공";
			url="/book/bookWrite.do";
		}
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", msg);
		mav.addObject("url", url);
		mav.setViewName("common/message");
		
		return mav;
	}
	
}
