package com.mymvc.board.controller;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.controller.Controller;
import com.mymvc.board.model.BoardService;
import com.mymvc.board.model.BoardVO;

public class BoardEditController implements Controller{

	@Override
	public String requestProcess(HttpServletRequest request, HttpServletResponse response) throws Throwable {
		/*
			 글 수정 화면 보여주기 - edit.jsp
			/board/edit.do=>BoardEditController
			=> edit.jsp 로 포워드
		*/
		//=> http://localhost:9090/mymvc/board/edit.do?no=116
		//1
		String no=request.getParameter("no");
		if(no==null || no.isEmpty()) {
			request.setAttribute("msg", "잘못된 url입니다.");
			request.setAttribute("url", "/board/list.do");
			
			return "/common/message.jsp";
		}
		
		//2
		BoardService boardService=new BoardService();
		BoardVO vo=null;
		try {
			vo=boardService.selectByNo(Integer.parseInt(no));
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		//3
		request.setAttribute("boardVo", vo);
		
		//4		
		return "/board/edit.jsp";
	}

	@Override
	public boolean isRedirect() {
		return false;
	}

}
