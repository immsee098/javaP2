package com.mymvc.pd.controller;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.controller.Controller;
import com.mymvc.pd.model.PdDTO;
import com.mymvc.pd.model.PdService;

public class PdListController implements Controller{

	@Override
	public String requestProcess(HttpServletRequest request, HttpServletResponse response) throws Throwable {
		/*
		 	상품 목록 보여주기 : pdList.jsp
		 	
			/pd/pdList.do=>PdListController
			=> pdList.jsp 로 포워드		  
		  */
		//1. 파라미터 읽어오기		
		//2. db작업
		PdService pdService=new PdService();
		List<PdDTO> list=null;
		try {
			list=pdService.selectAll();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		//3. 결과 저장
		request.setAttribute("list", list);
		
		//4. 뷰페이지나 이동할 페이지 리턴		
		return "/pd/pdList.jsp";
	}

	@Override
	public boolean isRedirect() {
		return false;
	}

}
