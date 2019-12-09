package com.mymvc.board.controller;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.controller.Controller;
import com.mymvc.board.model.BoardService;
import com.mymvc.board.model.BoardVO;
import com.mymvc.common.PagingVO;

public class BoardListController implements Controller{

	@Override
	public String requestProcess(HttpServletRequest request, HttpServletResponse response) throws Throwable {
		/*
			 글 목록 보여주기  - list.jsp
			/board/list.do=>BoardListController
			=> list.jsp 로 포워드
		*/
		//1. 파라미터 읽어오기
		//검색 관련 파라미터
		String condition=request.getParameter("searchCondition");
		String keyword=request.getParameter("searchKeyword");
		
		//2. db 작업
		BoardService boardService=new BoardService();
		List<BoardVO> list=null;
		try {
			list=boardService.selectAll(condition, keyword);
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		//페이징 처리 관련
		int currentPage=1;
		if(request.getParameter("currentPage")!=null) {
			currentPage
				=Integer.parseInt(request.getParameter("currentPage"));
		}
		
		int totalRecord=0;
		if(list!=null && !list.isEmpty()) {
			totalRecord=list.size();
		}
		
		int pageSize=5;
		int blockSize=10;
		
		PagingVO pageVo
			=new PagingVO(currentPage, totalRecord, pageSize, blockSize);
		
		//3. 결과 저장
		request.setAttribute("list", list);
		request.setAttribute("pageVo", pageVo);
		
		//4. 뷰페이지나 이동할 페이지 리턴
		return "/board/list.jsp";
	}

	@Override
	public boolean isRedirect() {
		return false;
	}

}
