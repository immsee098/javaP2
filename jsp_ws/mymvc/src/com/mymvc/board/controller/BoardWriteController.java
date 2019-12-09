package com.mymvc.board.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.controller.Controller;

public class BoardWriteController implements Controller{

	@Override
	public String requestProcess(HttpServletRequest request, HttpServletResponse response) throws Throwable {
		/*
			 글쓰기 화면 보여주기 - write.jsp
			/board/write.do=>BoardWriteController
			=> write.jsp로 포워드
		*/
		//1. 파라미터 읽어오기
		
		//2. db 작업
		
		//3. 결과 저장
		
		//4. 뷰페이지나 이동할 페이지 리턴		
		return "/board/write.jsp";
	}

	@Override
	public boolean isRedirect() {
		// TODO Auto-generated method stub
		return false;
	}

}
