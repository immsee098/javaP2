package com.ez.herb.cart.controller;

import java.util.List;
import java.util.Map;

public interface CartDAO {	
	int insertCart(CartVO vo);
	int updateCartQty(CartVO vo);
	int selectCartCount(CartVO vo);
	List<Map<String, Object>> selectCart(String userid);
	
	
}
