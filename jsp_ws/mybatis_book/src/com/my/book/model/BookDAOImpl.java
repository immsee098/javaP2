package com.my.book.model;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BookDAOImpl implements bookDAO {
	private String namespace="com.bookbatis.mapper.pd";
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	public int insertBook(bookVO vo) {
		int cnt = sqlSession.insert(namespace+"insertBook", vo);
		return cnt;
	}


}
