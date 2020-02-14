//윤해서
package com.herbmall.comments.model;

import java.sql.SQLException;
import java.util.List;

public class CommentsService {
	
	private commentDAO commentDao;
	
	public CommentsService() {
		commentDao = new commentDAO();
	}
	
	public List<commentVO> selectComment(int num) throws SQLException{
		return commentDao.selectComment(num);
	}
	
	public int insertComment(commentVO vo) throws SQLException {
		return commentDao.insertComment(vo);
	}

}
