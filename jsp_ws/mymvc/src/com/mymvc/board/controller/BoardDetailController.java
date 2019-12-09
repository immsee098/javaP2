package com.mymvc.board.controller;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.controller.Controller;
import com.mymvc.board.model.BoardService;
import com.mymvc.board.model.BoardVO;

public class BoardDetailController implements Controller{

	@Override
	public String requestProcess(HttpServletRequest request, HttpServletResponse response) throws Throwable {
		/*
			  글 상세보기 보여주기 - detail.jsp
			/board/detail.do=>BoardDetailController
			=> detail.jsp로 포워드
		*/
		//=> http://localhost:9090/mymvc/board/detail.do?no=116
		//1. 파라미터 읽어오기
		String no=request.getParameter("no");
		if(no==null || no.isEmpty()) {
			request.setAttribute("msg", "잘못된 url입니다.");
			request.setAttribute("url", "/board/list.do");
			
			return "/common/message.jsp";
		}
		
		//2. db 작업
		BoardService boardService=new BoardService();
		BoardVO vo=null;
		try {
			vo=boardService.selectByNo(Integer.parseInt(no));
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		//3. 결과 저장
		request.setAttribute("vo", vo);
		
		//4. 뷰페이지나 이동할 페이지 리턴	
		return "/board/detail.jsp";
	}

	@Override
	public boolean isRedirect() {
		// TODO Auto-generated method stub
		return false;
	}

}
