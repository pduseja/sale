package com.sogeti.digital.sale.repository.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MapKeyColumn;

@SuppressWarnings("serial")
@Entity(name = "Orders")
public class Orders implements Serializable {

	@Id
	@GeneratedValue
	@Column(name = "orderid")
	private int orderId;

	@MapKeyColumn(name = "userid")
	@Column(name = "userid")
	private int userId;

	@MapKeyColumn(name = "total")
	@Column(name = "total")
	private Double total;

	@MapKeyColumn(name = "tax")
	@Column(name = "tax")
	private Double tax;

	/**
	 * @return the orderId
	 */
	public int getOrderId() {
		return orderId;
	}

	/**
	 * @param orderId
	 *            the orderId to set
	 */
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	/**
	 * @return the userId
	 */
	public int getUserId() {
		return userId;
	}

	/**
	 * @param userId
	 *            the userId to set
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}

	/**
	 * @return the total
	 */
	public Double getTotal() {
		return total;
	}

	/**
	 * @param total
	 *            the total to set
	 */
	public void setTotal(Double total) {
		this.total = total;
	}

	/**
	 * @return the tax
	 */
	public Double getTax() {
		return tax;
	}

	/**
	 * @param tax
	 *            the tax to set
	 */
	public void setTax(Double tax) {
		this.tax = tax;
	}
}
