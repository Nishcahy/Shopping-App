package com.cts.demo.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.demo.entity.Product;
import com.cts.demo.exception.ProductNotFound;
import com.cts.demo.service.ProductService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/products")
@AllArgsConstructor
public class ProductController {

	ProductService productService;

	private static final Logger logger = LoggerFactory.getLogger(ProductController.class);

//	@RequestMapping(method=RequestMethod.POST)
	@PostMapping("/save")
	public String saveProduct(@RequestBody Product product) {
		logger.info("Product added succesfully");
		return productService.addProduct(product);
	}

	@PutMapping("/update")
	public Product updateProduct(@RequestBody Product product) {
		logger.info("Product updated succesfully");
		return productService.updateProduct(product);
	}

	@DeleteMapping("/delete/{id}")
	public String deleteProduct(@PathVariable("id") int productId) {
		logger.info("Product deleted succesfully");
		return productService.deleteProduct(productId);
	}

	@GetMapping("/getById/{id}")
	public Product getProductById(@PathVariable("id") int productId) throws ProductNotFound {
		logger.info("Product fetched succesfully by id");
		return productService.getProductById(productId);
	}

	@GetMapping("/getAll")
	public List<Product> getAllProducts() {
		logger.info("Product added succesfully");
		return productService.getAllProducts();
	}

	@GetMapping("/getBetween/{price1}/{price2}")
	public List<Product> getAllProductsBetween(@PathVariable("price1") int initialPrice,
			@PathVariable("price2") int finalPrice) {
		logger.info("Product fetched succesfully");
		return productService.getAllProductsBetween(initialPrice, finalPrice);
	}
	
	@GetMapping("/findByCategory/{category}")
	public List<Product> findByProductCategory(@PathVariable String category) {
		return productService.findByProductCategory(category);
	}
	
	@GetMapping("/findlessThan/{category}/{price}")
	public List<Product> findByproductPriceLessThan(@PathVariable String category,@PathVariable int price) {
		return productService.findByproductPriceLessThan(category,price);
		
	}

}
