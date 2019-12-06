package com.mymvc.pd.controller;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.controller.Controller;
import com.mymvc.pd.model.PdService;

public class PdDeleteController implements Controller{

	@Override
	public String requestProcess(HttpServletRequest request, HttpServletResponse response) throws Throwable {
		/*
		 	상품 삭제 처리 - 기존 pdDelete.jsp
		 
			/pd/pdDelete.do=>PdDeleteController
			=> pdList.do로 redirect (메세지를 주지 않는 경우 )		 
		*/
		
		//=> http://localhost:9090/mymvc/pd/pdDelete.do?no=2
		//1. 파라미터 읽어오기
		String no=request.getParameter("no");		
		
		//2. db작업
		PdService pdService=new PdService();
		try {
			int cnt=pdService.deletePd(Integer.parseInt(no));
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		//3. 결과 저장		
		//4. 뷰페이지나 이동할 페이지 리턴
		return "/pd/pdList.do";
	}

	@Override
	public boolean isRedirect() {
		return true;  //redirect
	}

}
