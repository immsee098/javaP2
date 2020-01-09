package com.ez.herb.order.model;

public interface OrderDAO {
	int insertOrder(OrderVO orderVo);
	int insertOrderDetail(OrderVO orderVo);
	
}
