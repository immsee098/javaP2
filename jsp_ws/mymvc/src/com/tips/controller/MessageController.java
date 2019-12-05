package com.tips.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tips.model.MessageModel;

//@WebServlet("/MsgController")
public class MessageController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) 
					throws ServletException, IOException {
		requestPro(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		requestPro(request, response);
	}

	private void requestPro(HttpServletRequest request, 
			HttpServletResponse response) 
					throws ServletException, IOException{
		//1. 파라미터 읽어오기
		String message=request.getParameter("message");
		
		//2. 비즈니스 로직 처리 - db작업
		MessageModel model = new MessageModel();
		String result=model.getMessage(message);
		
		//3. request에 결과 저장
		request.setAttribute("result", result);
		
		//4. 뷰 페이지로 포워딩
		RequestDispatcher dispatcher 
			= request.getRequestDispatcher("/test/messageView.jsp");
		dispatcher.forward(request, response);
	}

	
}


/* web.xml
  
 <servlet>
  	<servlet-name>msgCont</servlet-name>
  	<servlet-class>com.tips.controller.MessageController</servlet-class>
  </servlet>
  
  <servlet-mapping>
  	<servlet-name>msgCont</servlet-name>
  	<url-pattern>/msgController</url-pattern>
  </servlet-mapping>
   
  <servlet>
  	<servlet-name>travelCont</servlet-name>
  	<servlet-class>com.tips.controller.TravelController</servlet-class>
  </servlet>
  
  <servlet-mapping>
  	<servlet-name>travelCont</servlet-name>
  	<url-pattern>/travel.do</url-pattern>
  </servlet-mapping>
   
  <servlet>
  	<servlet-name>bookCont</servlet-name>
  	<servlet-class>com.tips.controller.BookController</servlet-class>
  </servlet>
  
  <servlet-mapping>
  	<servlet-name>bookCont</servlet-name>
  	<url-pattern>/book.do</url-pattern>
  </servlet-mapping> 
  
  
  */
