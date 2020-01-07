package com.ez.herb.product.model;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ez.herb.common.SearchVO;
import com.ez.herb.event.model.EventProductVO;

@Repository
public class ProductDAOMybatis implements ProductDAO{
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	private String namespace="config.mybatis.mapper.oracle.product.";
	
	@Override
	public List<ProductVO> selectProductByEvent(String eventName) {
		return sqlSession.selectList(namespace+"selectProductByEvent",
				eventName);
	}

	@Override
	public ProductVO selectProduct(int productNo) {
		return sqlSession.selectOne(namespace+"selectProduct", productNo);
	}

	@Override
	public List<ProductVO> selectProductByCategory(int categoryNo) {
		return sqlSession.selectList(namespace+"selectProductByCategory",
				categoryNo);
	}

	@Override
	public int insertProduct(ProductVO productVo) {
		return sqlSession.insert(namespace+"insertProduct", productVo);
	}

	@Override
	public List<ProductVO> selectProductAll(EventProductVO searchVo) {
		return sqlSession.selectList(namespace+"selectProductAll", searchVo);
	}

	@Override
	public int getTotalRecord(EventProductVO searchVo) {
		return sqlSession.selectOne(namespace+"getTotalRecord", searchVo);
	}

	@Override
	public int deleteProduct(int productNo) {
		return sqlSession.delete(namespace+"deleteProduct", productNo);
	}

	
}
