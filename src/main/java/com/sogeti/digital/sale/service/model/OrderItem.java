package com.sogeti.digital.sale.service.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class OrderItem implements Serializable {

	private int orderItemId;

	private int productQuantity;

	private Double lineItemTotalCost;
	
	private Products products;
	
	private int orderId;

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public Products getProducts() {
		return products;
	}

	public void setProducts(Products products) {
		this.products = products;
	}

	/**
	 * @return the orderItemId
	 */
	public int getOrderItemId() {
		return orderItemId;
	}

	/**
	 * @param orderItemId
	 *            the orderItemId to set
	 */
	public void setOrderItemId(int orderItemId) {
		this.orderItemId = orderItemId;
	}

	/**
	 * @return the productQuantity
	 */
	public int getProductQuantity() {
		return productQuantity;
	}

	/**
	 * @param productQuantity
	 *            the productQuantity to set
	 */
	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}

	/**
	 * @return the lineItemTotalCost
	 */
	public Double getLineItemTotalCost() {
		return lineItemTotalCost;
	}

	/**
	 * @param lineItemTotalCost
	 *            the lineItemTotalCost to set
	 */
	public void setLineItemTotalCost(Double lineItemTotalCost) {
		this.lineItemTotalCost = lineItemTotalCost;
	}

}
