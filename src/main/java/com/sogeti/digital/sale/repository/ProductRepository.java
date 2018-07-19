package com.sogeti.digital.sale.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.sogeti.digital.sale.repository.entity.Products;

public interface ProductRepository extends CrudRepository<Products, Long> {

	
	@Query("select p from Products p where p.productType=:productType and p.productCategory=:productCategory and p.productSize=:productSize")
	public List<Products> getProductList(@Param("productType") String productType,@Param("productCategory") String productCategory,@Param("productSize") Double productSize);
	
	@Query("select p from Products p where p.productType=:productType")
	public List<Products> getProduct(@Param("productType") String productType);
	
	@Query("update Products p set p.quantity =:productQuantity where p.productId=:productID ")
	public Boolean updateProduct(Products product, String productID,int productQuantity);
}
