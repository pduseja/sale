package com.sogeti.digital.sale.service;

import java.util.List;

import com.sogeti.digital.sale.service.model.OrderItem;

public interface OrderItemService {

	public OrderItem createOrderItem(OrderItem orderItem);
	
	public List<OrderItem> getOrderItem(String orderId);
}
