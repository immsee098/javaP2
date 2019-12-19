package com.ez.herb.board.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ez.herb.common.SearchVO;

@Service
public class BoardServiceImpl implements BoardService{
	@Autowired
	private BoardDAO boardDao;
		
	public int insertBoard(BoardVO vo){
		return boardDao.insertBoard(vo);
	}
	
	public List<BoardVO> selectAll(SearchVO searchVo){
		return boardDao.selectAll(searchVo);
	}
	
	public int updateReadCount(int no){
		return boardDao.updateReadCount(no);
	}
		
	public BoardVO selectByNo(int no){
		return boardDao.selectByNo(no);
	}
	
	/*
	public int updateBoard(BoardVO vo) throws SQLException {
		return boardDao.updateBoard(vo);
	}
	
	public int deleteBoard(int no, String pwd) throws SQLException {
		return boardDao.deleteBoard(no, pwd);
	}
	
	
	
	public List<BoardVO> selectMainNotice() throws SQLException{
		return boardDao.selectMainNotice();
	}
	*/
}



