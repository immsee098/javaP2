package com.ez.herb.board.model;

import java.util.List;

import com.ez.herb.common.SearchVO;

public interface BoardService {
	public int insertBoard(BoardVO vo);
	public List<BoardVO> selectAll(SearchVO searchVo);
	public int updateReadCount(int no);
	public BoardVO selectByNo(int no);
	
}
