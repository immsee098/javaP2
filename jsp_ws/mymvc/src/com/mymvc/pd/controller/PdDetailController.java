package com.mymvc.pd.controller;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.controller.Controller;
import com.mymvc.pd.model.PdDTO;
import com.mymvc.pd.model.PdService;

public class PdDetailController implements Controller{

	@Override
	public String requestProcess(HttpServletRequest request, HttpServletResponse response) throws Throwable {
		/*
		 	상품 상세보기 보여주기 : pdDetail.jsp
		 	
			/pd/pdDetail.do=>PdDetailController
			=> pdDetail.jsp로 포워드
	    */
		
		//=> http://localhost:9090/mymvc/pd/pdDetail.do?no=2
		//1. 파라미터 읽어오기
		String no=request.getParameter("no");
		if(no==null || no.isEmpty()) {
			request.setAttribute("msg", "잘못된 url입니다.");
			request.setAttribute("url", "/pd/pdList.do");
			
			return "/common/message.jsp";
		}
		
		//2. db작업
		PdService pdService=new PdService();
		PdDTO dto=null;
		try {
			dto=pdService.selectByNo(Integer.parseInt(no));
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		//3. 결과 저장
		request.setAttribute("pdDto", dto);
		
		//4. 뷰페이지나 이동할 페이지 리턴		
		return "/pd/pdDetail.jsp";
	}

	@Override
	public boolean isRedirect() {
		return false;
	}

}
