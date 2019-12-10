package com.mymvc.board.controller;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.controller.Controller;
import com.mymvc.board.model.BoardService;

public class BoardDeleteOkController implements Controller{

	@Override
	public String requestProcess(HttpServletRequest request, HttpServletResponse response) throws Throwable {
		/*
			 글 삭제 처리 - 기존 delete_ok.jsp
			/board/delete_ok.do=>BoardDeleteOkController
			=> message.jsp로 포워드 (메세지 출력)
		*/
		//1
		String no=request.getParameter("no");
		String pwd=request.getParameter("pwd");
		
		//2
		BoardService boardService=new BoardService();
		String msg="글 삭제 실패", url="/board/delete.do?no="+no;
		try {
			int cnt=boardService.deleteBoard(Integer.parseInt(no), pwd);
			if(cnt>0) {
				msg="글 삭제되었습니다.";
				url="/board/list.do";
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		//3
		request.setAttribute("msg", msg);
		request.setAttribute("url", url);
		
		//4		
		return "/common/message.jsp";
	}

	@Override
	public boolean isRedirect() {
		// TODO Auto-generated method stub
		return false;
	}

}
