package com.testProject.book.model;

import java.sql.SQLException;
import java.util.List;

public class bookService {
	private bookDAO bookDao;
	
	public bookService() {
		System.out.println("생성자");
	}
	
	public void setBookDao(bookDAO bookDao) {
		this.bookDao = bookDao;
		System.out.println("setBook호출");
	}
	
	public List<bookVO> selectAll() throws SQLException{
		return bookDao.selectAll();
	}
}
