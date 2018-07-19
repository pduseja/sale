package com.sogeti.digital.sale.service;

import java.util.List;

import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sogeti.digital.sale.repository.OrderItemRepository;
import com.sogeti.digital.sale.repository.OrdersRepository;
import com.sogeti.digital.sale.service.model.OrderItem;
import com.sogeti.digital.sale.service.model.Orders;

@Component
public class OrderServiceImpl implements OrderService {

	@Autowired
	OrdersRepository ordersRepository;

	@Autowired
	private Mapper dozerMapper;

	@Autowired
	private OrderItemRepository orderItemRepository;

	@Override
	public String createOrder(Orders order) {
		String sucess = new String();
		com.sogeti.digital.sale.repository.entity.Orders orderObj = this.ordersRepository
				.save(convertOrder(order));

		com.sogeti.digital.sale.repository.entity.OrderItem orderItemInt = new com.sogeti.digital.sale.repository.entity.OrderItem();
		List<OrderItem> orderItemList = order.getOrderItemList();
		for (OrderItem orderItem : orderItemList) {
			com.sogeti.digital.sale.repository.entity.OrderItem orderItemEnt = new com.sogeti.digital.sale.repository.entity.OrderItem();
			orderItemEnt.setLineItemTotalCost(orderItem.getLineItemTotalCost());
			orderItemEnt.setOrder(orderObj);
			orderItemEnt.setProductQuantity(orderItem.getProductQuantity());
			// Ideally This product details will be fetched from Stocks Service,
			// wherein Products will be primary entity and depending on
			// productType, productId is fetched.
			orderItemEnt.setProductId(orderItem.getProducts().getProductId());

			orderItemInt = this.orderItemRepository.save(orderItemEnt);
		}

		if (orderObj != null && orderItemInt != null) {
			sucess = "Success";
		}
		return sucess;
	}

	private com.sogeti.digital.sale.repository.entity.Orders convertOrder(
			Orders order) {

		return dozerMapper.map(order,
				com.sogeti.digital.sale.repository.entity.Orders.class);
	}

	@Override
	public Orders getOrder(String orderId) {
		// TODO Auto-generated method stub
		return null;
	}

}
