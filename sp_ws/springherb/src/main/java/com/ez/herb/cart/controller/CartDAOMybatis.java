package com.ez.herb.cart.controller;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CartDAOMybatis implements CartDAO{

	@Autowired
	private SqlSessionTemplate sqlSession;
	
	private String namespace="config.mybatis.mapper.oracle.cart.";
	
	@Override
	public int insertCart(CartVO vo) {
		return sqlSession.insert(namespace+"insertCart", vo);
	}

	@Override
	public int updateCartQty(CartVO vo) {
		return sqlSession.update(namespace+"updateCartQty", vo);
	}

	@Override
	public int selectCartCount(CartVO vo) {
		return sqlSession.selectOne(namespace+"selectCartCount", vo);
	}

	@Override
	public List<Map<String, Object>> selectCart(String userid) {
		return sqlSession.selectList(namespace+"selectCart", userid);
	}
	
	
}
