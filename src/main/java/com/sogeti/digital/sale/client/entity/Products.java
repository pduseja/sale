package com.sogeti.digital.sale.client.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@ApiModel(description = "Products")
@JacksonXmlRootElement(localName = "Products")
@SuppressWarnings("serial")
public class Products implements Serializable {

	@ApiModelProperty(name = "productId", value = "productId")
	@JsonProperty("productId")
	@JacksonXmlProperty(localName = "productId")
	private int productId;
	
	@ApiModelProperty(name = "productType", value = "productType")
	@JsonProperty("productType")
	@JacksonXmlProperty(localName = "productType")
	private String productType;

	@ApiModelProperty(name = "productDescription", value = "productDescription")
	@JsonProperty("productDescription")
	@JacksonXmlProperty(localName = "productDescription")
	private String productDescription;

	@ApiModelProperty(name = "productSpecs", value = "productSpecs")
	@JsonProperty("productSpecs")
	@JacksonXmlProperty(localName = "productSpecs")
	private String productSpecs;

	@ApiModelProperty(name = "quantity", value = "quantity")
	@JsonProperty("quantity")
	@JacksonXmlProperty(localName = "quantity")
	private Integer quantity;

	@ApiModelProperty(name = "productSize", value = "productSize")
	@JsonProperty("productSize")
	@JacksonXmlProperty(localName = "productSize")
	private Double productSize;

	@ApiModelProperty(name = "productCategory", value = "productCategory")
	@JsonProperty("productCategory")
	@JacksonXmlProperty(localName = "productCategory")
	private String productCategory;

	@ApiModelProperty(name = "provider", value = "provider")
	@JsonProperty("provider")
	@JacksonXmlProperty(localName = "provider")
	private String provider;

	@ApiModelProperty(name = "tax", value = "tax")
	@JsonProperty("tax")
	@JacksonXmlProperty(localName = "tax")
	private Double tax;

	@ApiModelProperty(name = "cost", value = "cost")
	@JsonProperty("cost")
	@JacksonXmlProperty(localName = "cost")
	private Double cost;

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
	 * @return
	 */
	public Double getTax() {
		return tax;
	}

	/**
	 * @param tax
	 */
	public void setTax(Double tax) {
		this.tax = tax;
	}

	/**
	 * @return
	 */
	public Double getCost() {
		return cost;
	}

	/**
	 * @param cost
	 */
	public void setCost(Double cost) {
		this.cost = cost;
	}

	/**
	 * @return the productType
	 */
	public String getProductType() {
		return productType;
	}

	/**
	 * @param productType
	 *            the productType to set
	 */
	public void setProductType(String productType) {
		this.productType = productType;
	}

	/**
	 * @return the productDescription
	 */
	public String getProductDescription() {
		return productDescription;
	}

	/**
	 * @param productDescription
	 *            the productDescription to set
	 */
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	/**
	 * @return the productSpecs
	 */
	public String getProductSpecs() {
		return productSpecs;
	}

	/**
	 * @param productSpecs
	 */
	public void setProductSpecs(String productSpecs) {
		this.productSpecs = productSpecs;
	}

	/**
	 * @return the quantity
	 */
	public Integer getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity
	 *            the quantity to set
	 */
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	/**
	 * @return the productSize
	 */
	public Double getProductSize() {
		return productSize;
	}

	/**
	 * @param productSize
	 *            the productSize to set
	 */
	public void setProductSize(Double productSize) {
		this.productSize = productSize;
	}

	/**
	 * @return the productCategory
	 */
	public String getProductCategory() {
		return productCategory;
	}

	/**
	 * @param productCategory
	 *            the productCategory to set
	 */
	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}

	/**
	 * @return the provider
	 */
	public String getProvider() {
		return provider;
	}

	/**
	 * @param provider
	 *            the provider to set
	 */
	public void setProvider(String provider) {
		this.provider = provider;
	}

}
