package com.mymvc.board.controller;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.controller.Controller;
import com.mymvc.board.model.BoardService;
import com.mymvc.board.model.BoardVO;

public class BoardEditOkController implements Controller{

	@Override
	public String requestProcess(HttpServletRequest request, HttpServletResponse response) throws Throwable {
		/*
			 글 수정 처리 - 기존   edit_ok.jsp
			/board/edit_ok.do=>BoardEditOkController
			=> message.jsp 로 포워드( 메세지 출력)
		*/
		//1
		String no=request.getParameter("no");
		String title=request.getParameter("title");
		String name=request.getParameter("name");
		String pwd=request.getParameter("pwd");
		String email=request.getParameter("email");
		String content=request.getParameter("content");
		
		//2
		BoardService boardService=new BoardService();
		BoardVO vo=new BoardVO();
		vo.setContent(content);
		vo.setEmail(email);
		vo.setName(name);
		vo.setNo(Integer.parseInt(no));
		vo.setPwd(pwd);
		vo.setTitle(title);
		
		String msg="글 수정 실패", url="/board/edit.do?no="+no;
		try {
			int cnt=boardService.updateBoard(vo);
			if(cnt>0) {
				msg="글수정 처리되었습니다.";
				url="/board/detail.do?no="+no;
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
