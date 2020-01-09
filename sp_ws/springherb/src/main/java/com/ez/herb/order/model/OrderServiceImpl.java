package com.ez.herb.order.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ez.herb.cart.controller.CartDAO;

@Service
public class OrderServiceImpl implements OrderService{
	@Autowired
	private OrderDAO orderDao;
	
	@Autowired
	private CartDAO cartDao;
		
	@Override
	@Transactional
	public int insertOrder(OrderVO orderVo) {
		int cnt=orderDao.insertOrder(orderVo);		
		cnt = orderDao.insertOrderDetail(orderVo);
		cnt = cartDao.deleteCartByUserid(orderVo.getCustomerId());
		
		return cnt;
	}

}
