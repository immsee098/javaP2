package com.ez.herb.product.model;

import java.util.List;

import com.ez.herb.common.SearchVO;
import com.ez.herb.event.model.EventProductVO;

public interface ProductDAO {
	List<ProductVO> selectProductByEvent(String eventName);
	ProductVO selectProduct(int productNo);
	List<ProductVO> selectProductByCategory(int categoryNo);
	int insertProduct(ProductVO productVo);
	List<ProductVO> selectProductAll(EventProductVO searchVo);
	int getTotalRecord(EventProductVO searchVo);
	int deleteProduct(int productNo);
	
	
}
