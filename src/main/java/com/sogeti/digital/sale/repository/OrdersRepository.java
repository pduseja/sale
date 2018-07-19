package com.sogeti.digital.sale.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.sogeti.digital.sale.repository.entity.Orders;

public interface OrdersRepository extends JpaRepository<Orders, Long> {

	@Query("select o from Orders o where o.orderId=:orderId")
	public Orders getOrders(@Param("orderId") String orderId);

}
