package com.cts.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.demo.entity.Product;
import com.cts.demo.repo.ProductRepo;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private ProductRepo productrepo;
	
	@Override
	public String addProduct(Product product) {
		// TODO Auto-generated method stub
		Product pr = productrepo.save(product);
		if(pr!=null) {
			return "Product added sucessfully";
		}
		return "Failed...";
	}
	
//	public List<Product> getProducts(){
//		List<Product> p=new ArrayList<>();
//		System.out.println("Method called");
//		return p;
//	}
	
	

}
