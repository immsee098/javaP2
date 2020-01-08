package com.ez.herb.event.model;

import java.util.List;

import com.ez.herb.product.model.ProductVO;

public interface EventProductService {
	int insertEventProduct(List<ProductVO> list, String eventName);
	
}
