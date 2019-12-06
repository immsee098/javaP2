package com.mymvc.pd.controller;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.controller.Controller;
import com.mymvc.pd.model.PdDTO;
import com.mymvc.pd.model.PdService;

public class PdWriteOkController implements Controller{

	@Override
	public String requestProcess(HttpServletRequest request, HttpServletResponse response) throws Throwable {
		/*
		 	/pd/pdWrite_ok.do=>PdWriteOkController
			=> message.jsp로 포워드 (메세지를 주는 경우)
		 */
		//1. 파라미터 읽어오기
		String pdName=request.getParameter("pdName");
		String price=request.getParameter("price");
		
		//2. 비즈니스 로직 처리 - db작업
		PdService pdService = new PdService();
		PdDTO dto = new PdDTO();
		dto.setPdName(pdName);
		dto.setPrice(Integer.parseInt(price));
		
		String msg="상품 등록 실패", url="/pd/pdWrite.do";
		try {
			int cnt=pdService.insertPd(dto);
			if(cnt>0) {
				msg="상품 등록 성공";
				url="/pd/pdList.do"; //=> message.jsp에 의해 redirect됨
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		//3. 결과 저장
		request.setAttribute("msg", msg);
		request.setAttribute("url", url);
		
		//4. 뷰페이지나 이동할 페이지 리턴
		return "/common/message.jsp";
	}

	@Override
	public boolean isRedirect() {
		return false;
	}

}
