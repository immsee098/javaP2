package com.mymvc.board.controller;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.controller.Controller;
import com.mymvc.board.model.BoardService;
import com.mymvc.board.model.BoardVO;

public class BoardWriteOkController implements Controller{

	@Override
	public String requestProcess(HttpServletRequest request, HttpServletResponse response) throws Throwable {
		/*
			 글쓰기 처리 - 기존 write_ok.jsp
			/board/write_ok.do=>BoardWriteOkController
			=> message.jsp로 포워드 (메시지 보여주기)
		*/
		//1. 파라미터 읽어오기
		String title=request.getParameter("title");
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String content=request.getParameter("content");
		String pwd=request.getParameter("pwd");
		
		//2. db 작업
		BoardService boardService=new BoardService();
		BoardVO vo= new BoardVO();
		vo.setContent(content);
		vo.setEmail(email);
		vo.setName(name);
		vo.setPwd(pwd);
		vo.setTitle(title);
		
		String msg="글쓰기 실패", url="/board/write.do";
		try {
			int cnt=boardService.insertBoard(vo);
			if(cnt>0) {
				msg="글쓰기 처리되었습니다.";
				url="/board/list.do";
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
