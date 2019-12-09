package com.mymvc.pd.controller;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.controller.Controller;
import com.mymvc.pd.model.PdDTO;
import com.mymvc.pd.model.PdService;

public class PdEditOkController implements Controller{

	@Override
	public String requestProcess(HttpServletRequest request, HttpServletResponse response) throws Throwable {
		/*
			상품 수정 처리 - 기존 pdEdit_ok.jsp
			/pd/pdEdit_ok.do=>PdEditOkController
			=> pdDetail.do 로 redirect
		*/
		//1
		String no=request.getParameter("no");
		String pdName=request.getParameter("pdName");
		String price=request.getParameter("price");
		
		//2
		PdService pdService=new PdService();
		PdDTO dto=new PdDTO();
		dto.setNo(Integer.parseInt(no));
		dto.setPdName(pdName);
		dto.setPrice(Integer.parseInt(price));
		try {
			int cnt=pdService.updatePd(dto);
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		//3
		
		//4
		return "/pd/pdDetail.do?no="+no;
	}

	@Override
	public boolean isRedirect() {
		return true;
	}

}
