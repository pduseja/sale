package com.sogeti.digital.sale.client.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@ApiModel(description = "OrderItem")
@JacksonXmlRootElement(localName = "OrderItem")
@SuppressWarnings("serial")
public class OrderItem implements Serializable {

	@ApiModelProperty(name = "orderItemNo", required = true, readOnly = true, value = "orderItemNo")
	@JsonProperty("orderItemNo")
	@JacksonXmlProperty(localName = "orderItemNo")
	private int orderItemNo;

	@ApiModelProperty(name = "productquantity", required = true, readOnly = true, value = "productquantity")
	@JsonProperty("productquantity")
	@JacksonXmlProperty(localName = "productquantity")
	private int productQuantity;

	@ApiModelProperty(name = "lineItemTotalCost", required = true, readOnly = true, value = "lineItemTotalCost")
	@JsonProperty("lineItemTotalCost")
	@JacksonXmlProperty(localName = "lineItemTotalCost")
	private Double lineItemTotalCost;

	@ApiModelProperty(name = "products", required = true, readOnly = true, value = "products")
	@JsonProperty("products")
	@JacksonXmlProperty(localName = "products")
	private Products products;
	
	public Products getProducts() {
		return products;
	}

	public void setProducts(Products products) {
		this.products = products;
	}

	public void setOrderItemNo(int orderItemNo) {
		this.orderItemNo = orderItemNo;
	}

	/**
	 * @return the orderItemNo
	 */
	public int getOrderItemNo() {
		return orderItemNo;
	}

	/**
	 * @param orderItemNo the orderItemNo to set
	 */
	public void setOrderItemo(int orderItemNo) {
		this.orderItemNo = orderItemNo;
	}

	/**
	 * @return the productQuantity
	 */
	public int getProductQuantity() {
		return productQuantity;
	}

	/**
	 * @param productQuantity the productQuantity to set
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
	 * @param lineItemTotalCost the lineItemTotalCost to set
	 */
	public void setLineItemTotalCost(Double lineItemTotalCost) {
		this.lineItemTotalCost = lineItemTotalCost;
	}
}
