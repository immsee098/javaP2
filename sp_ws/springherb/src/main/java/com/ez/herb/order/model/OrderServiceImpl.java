package com.ez.herb.order.model;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ez.herb.cart.controller.CartDAO;
import com.ez.herb.common.DateSearchVO;

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

	@Override
	public List<Map<String, Object>> selectOrderDetailsView(int orderNo) {
		return orderDao.selectOrderDetailsView(orderNo);
	}

	@Override
	public Map<String, Object> selectOrdersView(int orderNo) {
		return orderDao.selectOrdersView(orderNo);
	}

	@Override
	public List<OrderAllVO> selectOrderList(DateSearchVO dateSearchVo) {
		return orderDao.selectOrderList(dateSearchVo);
	}

	@Override
	public int getTotalRecord(DateSearchVO dateSearchVo) {
		return orderDao.getTotalRecord(dateSearchVo);
	}

}
