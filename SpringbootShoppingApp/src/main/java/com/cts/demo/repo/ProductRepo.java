package com.cts.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.demo.entity.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {
	


}
