package com.cts.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cts.demo.entity.Product;
import com.cts.demo.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	
//	@RequestMapping(method=RequestMethod.POST)
	@PostMapping("/save")
	public String saveProduct(@RequestBody Product product) {
		return productService.addProduct(product);
	}

}
