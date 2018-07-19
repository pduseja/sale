package com.sogeti.digital.sale.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import java.util.ArrayList;
import java.util.List;

import org.dozer.Mapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sogeti.digital.sale.client.entity.Orders;
import com.sogeti.digital.sale.client.entity.Products;
import com.sogeti.digital.sale.service.OrderService;
import com.sogeti.digital.sale.service.ProductService;

/**
 * Class Description:This class is an API class for Sale Service which defines
 * different API's for Sale API.
 * 
 * @author pduseja
 *
 */
@RestController
@Api
@RequestMapping("/digital/sale")
public class SaleApi {
	private static final Logger LOGGER = LoggerFactory.getLogger(SaleApi.class);

	@Autowired
	private Mapper dozerMapper;

	@Autowired
	private ProductService productService;

	@Autowired
	private OrderService orderService;

	/**
	 * Method Description: This method will help to retrieve list of Products
	 * for a given ProductType.
	 * 
	 * @param productType
	 * @return: Returns List of Products
	 */
	@ApiOperation(value = "Create Order", notes = "Create Order", nickname = "createOrder")
	@ApiResponses({
			@ApiResponse(code = 200, message = "Success!"),
			@ApiResponse(code = 404, message = "Product not found for the defined Search Criteria") })
	@GetMapping(path = "/products/{productType}", produces = {
			"application/xml", "application/json" })
	public List<Products> getProductLists(
			@ApiParam(value = "", required = true) @PathVariable String productType) {
		LOGGER.info("Inside {}.getProductList()", getClass().getSimpleName());

		return this.convert(this.productService.getProductLists(productType));

	}

	/**
	 * Method Description: This Get method is defined, if a user wants to narrow
	 * down his / her search criteria to specific items in Advanced search.
	 * 
	 * @param productType
	 * @param productCategory
	 * @param productSize
	 * @return: List of Products for Defined Advanced Search.
	 */
	@ApiOperation(value = "Get Product Details", notes = "Get Product Details", nickname = "getProductList")
	@ApiResponses({ @ApiResponse(code = 200, message = "Success!"),
			@ApiResponse(code = 404, message = "Product not found") })
	@GetMapping(path = "/product/{productType}/{productCategory}/{productSize}", produces = {})
	public List<Products> getProductList(
			@ApiParam(value = "", required = true) @PathVariable String productType,
			@PathVariable String productCategory,
			@PathVariable Double productSize) {
		LOGGER.info("Inside {}.getProductList()", getClass().getSimpleName());

		return this.convert(this.productService.getProductList(productType,
				productCategory, productSize));
	}

	/**
	 * Method Description: This method is used to create a record in Orders
	 * Table for an order placed on site.
	 * 
	 * @param order
	 * @return
	 */
	@ApiOperation(value = "Add Order", notes = "add Order", nickname = "createOrder")
	@ApiResponses({ @ApiResponse(code = 200, message = "Success!"),
			@ApiResponse(code = 404, message = "Page not found") })
	@PostMapping(path = "/order", produces = { MediaType.APPLICATION_XML_VALUE,
			MediaType.APPLICATION_JSON_VALUE }, consumes = {
			MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE })
	public String createOrder(
			@ApiParam(value = "", required = true) @RequestBody Orders order) {
		LOGGER.info("Inside {}.createOrder()", getClass().getSimpleName());
		String success = new String();

		success = orderService.createOrder(convertOrder(order));
		if (!StringUtils.isEmpty(success)) {
			success = "Order Created Successfully!!";
		} else {
			success = "Unable to create Order due to some internal error!!";
		}

		return success;
	}

	@SuppressWarnings("unchecked")
	private List<Products> convert(
			List<com.sogeti.digital.sale.service.model.Products> productList) {
		List<Products> list = new ArrayList<>();
		return (List<Products>) dozerMapper.map(productList, list.getClass());
	}

	private com.sogeti.digital.sale.service.model.Orders convertOrder(
			Orders order) {

		return dozerMapper.map(order,
				com.sogeti.digital.sale.service.model.Orders.class);
	}
}
