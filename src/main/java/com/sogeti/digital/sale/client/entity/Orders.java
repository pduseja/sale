package com.sogeti.digital.sale.client.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@ApiModel(description = "Orders")
@JacksonXmlRootElement(localName = "Orders")
@SuppressWarnings("serial")
public class Orders implements Serializable {

	@ApiModelProperty(name = "orderId", required = true, readOnly = true, value = "orderId")
	@JsonProperty("orderId")
	@JacksonXmlProperty(localName = "orderId")
	private int orderId;
	
	@ApiModelProperty(name = "userId", required = true, readOnly = true, value = "userId")
	@JsonProperty("userId")
	@JacksonXmlProperty(localName = "userId")
	private int userId;
	
	@ApiModelProperty(name = "total", required = true, readOnly = true, value = "total")
	@JsonProperty("total")
	@JacksonXmlProperty(localName = "total")
	private Double total;
	
	@ApiModelProperty(name = "tax", required = true, readOnly = true, value = "tax")
	@JsonProperty("tax")
	@JacksonXmlProperty(localName = "tax")
	private Double tax;
	
	@ApiModelProperty(name = "orderItemList", required = true, readOnly = true, value = "orderItemList")
	@JsonProperty("orderItemList")
	@JacksonXmlProperty(localName = "orderItemList")
	private List<OrderItem> orderItemList;

	public List<OrderItem> getOrderItemList() {
		return orderItemList;
	}

	public void setOrderItemList(List<OrderItem> orderItemList) {
		this.orderItemList = orderItemList;
	}

	/**
	 * @return the orderId
	 */
	public int getOrderId() {
		return orderId;
	}

	/**
	 * @param orderId the orderId to set
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
	 * @param userId the userId to set
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
	 * @param total the total to set
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
	 * @param tax the tax to set
	 */
	public void setTax(Double tax) {
		this.tax = tax;
	}
}
