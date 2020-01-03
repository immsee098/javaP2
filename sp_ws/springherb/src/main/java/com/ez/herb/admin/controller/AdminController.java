package com.ez.herb.admin.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/admin")
@Controller
public class AdminController {
	private static final Logger logger
		=LoggerFactory.getLogger(AdminController.class);
	
	@RequestMapping("/adminMain.do")
	public void adminMain() {
		logger.info("관리자 메인 화면 보여주기");
	}
	
	
}
