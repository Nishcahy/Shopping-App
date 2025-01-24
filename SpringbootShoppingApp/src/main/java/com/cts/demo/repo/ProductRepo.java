package com.cts.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cts.demo.entity.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {
	
//	@Query("select p from Product p where p.productPrice between ?1 and ?2")
//  List<Product> getAllProductsBetween(int initialPrice,int finalPrice);
	
	List<Product> findByProductPriceBetween(int initialPrice,int finalPrice);
	List<Product> findByProductCategory(String category);
	List<Product> findByProductCategoryAndProductPriceLessThan(String category,int productPrice);
}
