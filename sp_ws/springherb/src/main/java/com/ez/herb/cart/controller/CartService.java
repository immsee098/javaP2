package com.ez.herb.cart.controller;

import java.util.List;
import java.util.Map;

public interface CartService {
	int insertCart(CartVO vo);
	List<Map<String, Object>> selectCart(String userid);
	int updateCart(CartVO cartVo);
	int deleteCart(int cartNo);
	
	
}
