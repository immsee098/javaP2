package com.ez.herb.admin.manager.model;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ManagerDAOMybatis implements ManagerDAO{
	@Autowired
	private SqlSessionTemplate sqlSession;

	private String namespace="config.mybatis.mapper.oracle.manager.";
	
	@Override
	public List<Map<String, Object>> selectAuth() {
		return sqlSession.selectList(namespace+"selectAuth");
	}

	@Override
	public int selectDup(String userid) {
		return sqlSession.selectOne(namespace+"selectDup", userid);
	}

	@Override
	public int insertManager(ManagerVO vo) {
		return sqlSession.insert(namespace+"insertManager", vo);
	}

	@Override
	public String selectPwd(String userid) {
		return sqlSession.selectOne(namespace+"selectPwd", userid);
	}
	
	

	
}
