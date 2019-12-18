package com.ez.herb.board.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/board")
public class BoardWriteController {
	private static final Logger logger
		=LoggerFactory.getLogger(BoardWriteController.class); 
	
	@RequestMapping(value="/write.do", method=RequestMethod.GET)
	public String write_get() {
		logger.info("글쓰기 화면");
		
		return "board/write";
	}
	
}
