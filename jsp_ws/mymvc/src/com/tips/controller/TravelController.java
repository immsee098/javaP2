package com.tips.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tips.model.TravelExpert;

//@WebServlet("/TravelController")
public class TravelController extends HttpServlet {
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
		
		String city=request.getParameter("city");
		
		//2. 비즈니스 로직 처리
		TravelExpert model = new TravelExpert();
		String result=model.getTip(city);
		
		//3. 결과 저장
		request.setAttribute("result", result);
		
		//4. 뷰로 포워드
		RequestDispatcher dispatcher
			=request.getRequestDispatcher("/tips/travelResult.jsp");
		dispatcher.forward(request, response);
	}

}
