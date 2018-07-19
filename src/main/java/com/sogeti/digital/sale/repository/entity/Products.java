package com.sogeti.digital.sale.repository.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@SuppressWarnings("serial")
@Entity(name = "Products")
public class Products implements Serializable {

	@Id
	@GeneratedValue
	@Column(name = "productid")
	private int productId;

	@Column(name = "producttype")
	private String productType;

	@Column(name = "productdescription")
	private String productDescription;

	@Column(name = "productspecs")
	private String productSpecs;

	@Column(name = "quantity")
	private int quantity;

	@Column(name = "productsize")
	private Double productSize;

	@Column(name = "productcategory")
	private String productCategory;

	@Column(name = "provider")
	private String provider;

	@Column(name = "tax")
	private Double tax;

	@Column(name = "cost")
	private Double cost;

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

	/**
	 * @return the cost
	 */
	public Double getCost() {
		return cost;
	}

	/**
	 * @param cost
	 *            the cost to set
	 */
	public void setCost(Double cost) {
		this.cost = cost;
	}

	/**
	 * @return the productId
	 */
	public int getProductId() {
		return productId;
	}

	/**
	 * @param productId
	 *            the productId to set
	 */
	public void setProductId(int productId) {
		this.productId = productId;
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
	 *            the productSpecs to set
	 */
	public void setProductSpecs(String productSpecs) {
		this.productSpecs = productSpecs;
	}

	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity
	 *            the quantity to set
	 */
	public void setQuantity(int quantity) {
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
