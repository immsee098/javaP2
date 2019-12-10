package com.mymvc.board.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.controller.Controller;

public class BoardDeleteController implements Controller{

	@Override
	public String requestProcess(HttpServletRequest request, HttpServletResponse response) throws Throwable {
		/*
			 글 삭제 화면 보여주기 - delete.jsp
			/board/delete.do=>BoardDeleteController
			=> delete.jsp로 포워드
		*/
		//=> http://localhost:9090/mymvc/board/delete.do?no=116
		//1
		String no=request.getParameter("no");
		if(no==null || no.isEmpty()) {
			request.setAttribute("msg", "잘못된 url입니다.");
			request.setAttribute("url", "/board/list.do");
			
			return "/common/message.jsp";
		}
		
		//2
		
		//3
		
		//4		
		return "/board/delete.jsp";
	}

	@Override
	public boolean isRedirect() {
		// TODO Auto-generated method stub
		return false;
	}

}
