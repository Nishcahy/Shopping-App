package com.cts.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.demo.entity.Product;
import com.cts.demo.service.ProductService;


@RestController
@RequestMapping("/products")

public class ProductController {
	
	@Autowired
	ProductService productService;
	
	private static final Logger logger= LoggerFactory.getLogger(ProductController.class);
	
//	@RequestMapping(method=RequestMethod.POST)
	@PostMapping("/save")
	public String saveProduct(@RequestBody Product product) {
		logger.info("Product added succesfully");
		return productService.addProduct(product);
	}

}
