package com.cts.demo.service;

import java.util.List;

import com.cts.demo.entity.Product;
import com.cts.demo.exception.ProductNotFound;

public interface ProductService {

	String addProduct(Product product);

	List<Product> getAllProducts();

	Product updateProduct(Product product);

	String deleteProduct(int productId);

	Product getProductById(int productId) throws ProductNotFound;

	List<Product> getAllProductsBetween(int initialPrice, int finalPrice);

	List<Product> findByProductCategory(String category);

	List<Product> findByproductPriceLessThan(String category, int price);
}
