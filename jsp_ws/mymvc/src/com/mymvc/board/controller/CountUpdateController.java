package com.mymvc.board.controller;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.controller.Controller;
import com.mymvc.board.model.BoardService;

public class CountUpdateController implements Controller{

	@Override
	public String requestProcess(HttpServletRequest request, HttpServletResponse response) throws Throwable {
		/*
			 조회수 증가 처리 - 기존 countUpdate.jsp
			/board/countUpdate.do=>CountUpdateController
			=> detail.do 로 redirect		
		*/
		//=> http://localhost:9090/mymvc/board/countUpdate.do?no=116
		//1
		String no=request.getParameter("no");
		
		//2
		BoardService boardService=new BoardService();
		try {
			int cnt=boardService.updateReadCount(Integer.parseInt(no));
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		//3
		
		//4
		return "/board/detail.do?no="+no;
	}

	@Override
	public boolean isRedirect() {
		return true;
	}

}
