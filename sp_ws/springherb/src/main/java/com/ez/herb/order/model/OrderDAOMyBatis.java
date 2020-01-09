package com.ez.herb.order.model;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class OrderDAOMybatis implements OrderDAO{
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	private String namespace="config.mybatis.mapper.oracle.order.";
		
	@Override
	public int insertOrder(OrderVO orderVo) {
		return sqlSession.insert(namespace+"insertOrder", orderVo);
	}

	@Override
	public int insertOrderDetail(OrderVO orderVo) {
		return sqlSession.insert(namespace+"insertOrderDetail", orderVo);
	}

}
