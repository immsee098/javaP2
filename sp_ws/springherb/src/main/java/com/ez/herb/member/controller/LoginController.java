package com.ez.herb.member.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/login")
public class LoginController {
	private static final Logger logger
		=LoggerFactory.getLogger(LoginController.class);
	
	@RequestMapping(value="/login.do", method = RequestMethod.GET)
	public String login_get() {
		logger.info("로그인 화면 보여주기");
		
		return "login/login";
	}
	
	@RequestMapping(value="/login.do", method=RequestMethod.POST)
	public String login_post(@RequestParam String userid,
			@RequestParam String pwd, 
			@RequestParam(required = false) String chkSave) {
		logger.info("로그인 처리, 파라미터 userid={}, pwd={}", userid, pwd);
		logger.info("chkSave={}", chkSave);
		
		
	}
	
	
}




