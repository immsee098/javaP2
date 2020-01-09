package com.ez.herb.cart.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartServiceImpl implements CartService{

	@Autowired
	private CartDAO cartDao;

	@Override
	public int insertCart(CartVO vo) {
		int cnt=0;
		
		int count=cartDao.selectCartCount(vo);
		if(count>0) {
			cnt=cartDao.updateCartQty(vo);
		}else {
			cnt=cartDao.insertCart(vo);
		}
		
		return cnt;
	}

	@Override
	public List<Map<String, Object>> selectCart(String userid) {
		return cartDao.selectCart(userid);
	}

	@Override
	public int updateCart(CartVO cartVo) {
		return cartDao.updateCart(cartVo);
	}

	@Override
	public int deleteCart(int cartNo) {
		return cartDao.deleteCart(cartNo);
	}
	
	
}
