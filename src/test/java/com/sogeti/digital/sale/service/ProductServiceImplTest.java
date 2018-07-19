package com.sogeti.digital.sale.service;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.aspectj.lang.annotation.Before;
import org.dozer.Mapper;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.BDDMockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Profile;
import org.springframework.core.io.ClassPathResource;
import org.springframework.data.repository.init.Jackson2ResourceReader;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.rules.SpringClassRule;
import org.springframework.test.context.junit4.rules.SpringMethodRule;

import com.sogeti.digital.sale.repository.ProductRepository;
import com.sogeti.digital.sale.service.model.Products;

import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)
@SpringBootTest
@ActiveProfiles("sale-api-test")
public class ProductServiceImplTest {

	@ClassRule
	public static final SpringClassRule SPRING_CLASS_RULE = new SpringClassRule();

	@Rule
	public final SpringMethodRule springMethodRule = new SpringMethodRule();

	@MockBean
	ProductRepository productRepository;

	@Autowired
	private Mapper dozerMapper;

	@Autowired
	ProductService productService;
	
	  protected List<com.sogeti.digital.sale.repository.entity.Products> allRepoProducts;
	  protected Products product;
	  
	  @Before(value = "")
	  public void setUp() throws Exception {
	    

	    if (CollectionUtils.isEmpty(this.allRepoProducts)) {
	      
	      this.allRepoProducts = readFromFile();
	      this.product = convert(this.allRepoProducts.get(0));
	    }
	  }

	
	private Products convert(com.sogeti.digital.sale.repository.entity.Products product2) {
		
		return dozerMapper.map(product2, Products.class);
	}


	@SuppressWarnings("unchecked")
	private List<com.sogeti.digital.sale.repository.entity.Products> readFromFile() throws Exception {
		return (List<com.sogeti.digital.sale.repository.entity.Products>) new Jackson2ResourceReader().readFrom(new ClassPathResource("product.json"), getClass().getClassLoader());
	}



	@Test
	public void getProductListTest() {
		String productType = this.product.getProductType();
		String productCategory = this.product.getProductCategory();
		Double productSize = this.product.getProductSize();
		List <Products> list = new ArrayList<>();
		list.add(product);
		
		BDDMockito.given(this.productRepository.getProductList(productType, productCategory, productSize)).willReturn(allRepoProducts);
		assertNotNull(allRepoProducts);
		
		list = this.productService.getProductList(productType, productCategory, productSize);
		
		assertNotNull(list);
		
	}

	@Test
	public void testUpdateProduct() {
		fail("Not yet implemented");
	}

	@TestConfiguration
	@Profile("sale-api-test")
	public static class Config {

	}
}
