package com.sogeti.digital.sale.service;

import com.sogeti.digital.sale.service.model.Orders;

public interface OrderService {

	/**
	 * Method Description: This method will create a record in Orders Table in DB. 
	 * 
	 * @param order
	 * @return
	 */
	public String createOrder(Orders order);
	
	/**
	 * Method Description: This method will retrieve the order details for the Order ID.
	 * 
	 * @param orderId
	 * @return
	 */
	public Orders getOrder(String orderId);
}
