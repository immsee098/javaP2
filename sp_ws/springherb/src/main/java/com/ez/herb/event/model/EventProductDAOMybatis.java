package com.ez.herb.event.model;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EventProductDAOMybatis implements EventProductDAO{

	@Autowired
	private SqlSessionTemplate sqlSession;
	
	private String namespace="config.mybatis.mapper.oracle.eventproduct.";
	
	@Override
	public int insertEventProduct(EventProductVO vo) {
		return sqlSession.insert(namespace+"insertEventProduct", vo);
	}

	@Override
	public int selectEventProductCount(EventProductVO vo) {
		return sqlSession.selectOne(namespace+"selectEventProductCount", 
				vo);
	}

	
}
