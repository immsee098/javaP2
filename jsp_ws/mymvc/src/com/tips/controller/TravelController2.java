package com.tips.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.controller.Controller;
import com.tips.model.TravelExpert;

public class TravelController2 implements Controller{

	@Override
	public String requestProcess(HttpServletRequest request, HttpServletResponse response) throws Throwable {
		//1. 파라미터 읽어오기
		String city=request.getParameter("city");

		//2. 비즈니스 로직 처리
		TravelExpert model = new TravelExpert();
		String result=model.getTip(city);
		System.out.println("city="+city+", result="+result);
		
		//3. 결과 저장
		request.setAttribute("result", result);
		
		return "/tips/travelResult.jsp";
	}

}
