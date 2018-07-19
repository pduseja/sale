package com.sogeti.digital.sale.service;

import java.util.ArrayList;
import java.util.List;

import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sogeti.digital.sale.repository.ProductRepository;
import com.sogeti.digital.sale.service.model.Products;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	ProductRepository productRepository;

	@Autowired
	private Mapper dozerMapper;
	
	@Override
	public List<Products> getProductList(String productType, String productCategory, Double productSize) {
		
	return this.convert(this.productRepository.getProductList(productType, productCategory, productSize));
	
	}
	
	@Override
	public List<Products> getProductLists(String productType) {
		
	return this.convert(this.productRepository.getProduct(productType));
	
	}
	

	@SuppressWarnings("unchecked")
	private List<Products> convert(List<com.sogeti.digital.sale.repository.entity.Products> product) {
		List<Products> list = new ArrayList<>();
		return dozerMapper.map(product, list.getClass());
	}


	public Boolean updateProduct(Products product) {
		// TODO Auto-generated method stub
		return null;
	}

}
