package com.ez.herb.email;

import javax.mail.MessagingException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMessage.RecipientType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

@Component
public class EmailSender {

	@Autowired private JavaMailSender mailSender;
	
	public void sendMail(String subject, String content, 
			String receiver, String sender) throws MessagingException {
		
		MimeMessage mimeMsg=mailSender.createMimeMessage();
		mimeMsg.setSubject(subject);
		mimeMsg.setText(content, "utf-8","html");
		mimeMsg.setRecipient(RecipientType.TO, 
				new InternetAddress(receiver));
		mimeMsg.setFrom(new InternetAddress(sender));
		
		mailSender.send(mimeMsg);
		
		
		/*
		MimeMessage message = mailSender.createMimeMessage();
		MimeMessageHelper messageHelper 
			= new MimeMessageHelper(message, true, "UTF-8");
		//MimeMessageHelper(MimeMessage mimeMessage, boolean multipart, String encoding)
		messageHelper.setSubject(subject);		
		messageHelper.setText(content, true);
		//setText(String text, boolean html)

		messageHelper.setFrom(new InternetAddress(sender));
		messageHelper.setTo(new InternetAddress(receiver));
				
		mailSender.send(message);
		*/
	}
	
}
