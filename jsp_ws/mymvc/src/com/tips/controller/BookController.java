package com.tips.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tips.model.BookExpert;
import com.tips.model.TravelExpert;

public class BookController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		requestPro(request, response);
	}
	
	protected void doPost(HttpServletRequest request, 
			HttpServletResponse response) 
					throws ServletException, IOException {
		requestPro(request, response);
	}

	private void requestPro(HttpServletRequest request, 
			HttpServletResponse response) 
					throws ServletException, IOException{
		//1. 파라미터 읽어오기
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
		String lang=request.getParameter("lang");
		
		//2. 비즈니스 로직 처리
		BookExpert model = new BookExpert();
		String result=model.getTip(lang);
		
		//3. 결과 저장
		request.setAttribute("result", result);
		//System.out.println("result="+result);
		
		//4. 뷰로 포워드
		RequestDispatcher dispatcher
			=request.getRequestDispatcher("/tips/bookResult.jsp");
		dispatcher.forward(request, response);
	}

}
