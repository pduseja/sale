package com.sogeti.digital.sale.repository.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@SuppressWarnings("serial")
@Entity(name = "orderitem")
public class OrderItem implements Serializable {

	@Id
	@GeneratedValue
	@Column(name = "orderitemid")
	private int orderItemId;

	@Column(name = "productquantity")
	private int productQuantity;

	@Column(name = "lineitemtotalcost")
	private Double lineItemTotalCost;

	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "orderid", nullable = false)
	@OnDelete(action = OnDeleteAction.CASCADE)
	private Orders order;

	@Column(name="productid")
	private int productId;
	
	/**
	 * @return the productId
	 */
	public int getProductId() {
		return productId;
	}

	/**
	 * @param productId the productId to set
	 */
	public void setProductId(int productId) {
		this.productId = productId;
	}

	/**
	 * @return the order
	 */
	public Orders getOrder() {
		return order;
	}

	/**
	 * @param order
	 *            the order to set
	 */
	public void setOrder(Orders order) {
		this.order = order;
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
