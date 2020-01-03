package com.ez.herb.admin.manager.model;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AuthorityDAOMybatis implements AuthorityDAO {
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	private String namespace ="config.mybatis.mapper.oracle.manager.";
	
	public List<AuthorityVO> selectAuth() {
		List<AuthorityVO> list = sqlSession.selectList(namespace+"selectAuth");
		
		return list;
	}
}
