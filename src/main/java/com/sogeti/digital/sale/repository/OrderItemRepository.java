package com.sogeti.digital.sale.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sogeti.digital.sale.repository.entity.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
	

}
