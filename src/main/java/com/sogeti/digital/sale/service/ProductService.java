package com.sogeti.digital.sale.service;

import java.util.List;

import com.sogeti.digital.sale.service.model.Products;

public interface ProductService {
	
	public List<Products> getProductList(String productType,String productCategory,Double productSize);
	
	public List<Products> getProductLists(String productType);
	
	public Boolean updateProduct(Products product);

}
