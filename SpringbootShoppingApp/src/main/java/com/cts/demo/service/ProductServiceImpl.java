package com.cts.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.demo.entity.Product;
import com.cts.demo.exception.ProductNotFound;
import com.cts.demo.repo.ProductRepo;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService {

	private ProductRepo productrepo;

	@Override
	public String addProduct(Product product) {
		Product product1 = productrepo.save(product);
		if (product1 != null) {
			return "Product added sucessfully";
		}
		return "Failed...";
	}

	@Override
	public List<Product> getAllProducts() {

		return productrepo.findAll();
	}

	@Override
	public Product updateProduct(Product product) {

		return productrepo.save(product);
	}

	@Override
	public String deleteProduct(int productId) {
		productrepo.deleteById(productId);
		return "Product deleted Successfully";
	}

	@Override
	public Product getProductById(int productId) throws ProductNotFound {
		Optional<Product> optional = productrepo.findById(productId);
		if (optional.isPresent()) {
			return optional.get();
		} else {
			throw new ProductNotFound("No product found with given Id");
		}
	}

	@Override
	public List<Product> getAllProductsBetween(int initialPrice, int finalPrice) {

		return productrepo.findByProductPriceBetween(initialPrice, finalPrice);
	}

	@Override
	public List<Product> findByProductCategory(String category) {

		return productrepo.findByProductCategory(category);
	}

	@Override
	public List<Product> findByproductPriceLessThan(String category,int price) {

		return productrepo.findByProductCategoryAndProductPriceLessThan(category,price);
	}

}
