package com.testProject.book.controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.testProject.book.model.bookService;
import com.testProject.book.model.bookVO;

@Controller
public class bookListController {
	private bookService bookService;
	
	public bookListController() {
		System.out.println("생성자 bookList");
	}
	
	public void setbookService(bookService bookService) {
		this.bookService = bookService;
		System.out.println("setBookservice 호출");
	}
	
	
	@RequestMapping("/book/bookList.do")
	public ModelAndView bookList() {
		System.out.println("책 목록");
		
		List<bookVO> list = null;
		
		try {
			list = bookService.selectAll();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("list", list);
		mav.setViewName("book/bookList");
		
		return mav;
	}
}
