package com.ez.herb.email;

import javax.mail.MessagingException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmailController {
	private static final Logger logger
	=LoggerFactory.getLogger(EmailController.class);
	 	
	@Autowired EmailSender emailSender;
	
	@RequestMapping("/email/send.do")
	public String send_email() {
		String subject="문의에 대한 답변입니다. 안녕하세요";
		String content="<h1>이메일 내용입니다.</h1> <strong>감사합니다!!</strong>";
		String receiver="now4ever@naver.com";
		String sender="admin@herbmall.com";
				
		try {
			emailSender.sendMail(subject, content, receiver, sender);
			logger.info("이메일 발송 성공");
		} catch (MessagingException e) {
			logger.info("이메일 발송 실패!!");
			e.printStackTrace();
		}
		
		return "redirect:/index.do";
	}

	@RequestMapping("/sandbox/emailTest.do")
	public void emailTest() {
		logger.info("emailTest 화면 보여주기");
	}
	
}



