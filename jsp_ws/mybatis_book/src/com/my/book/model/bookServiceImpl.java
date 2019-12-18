package com.my.book.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class bookServiceImpl implements BookService {

	@Autowired
	private bookDAO bookDao;
	
	public int insertBook(bookVO vo) {
		return bookDao.insertBook(vo);
	}
}
