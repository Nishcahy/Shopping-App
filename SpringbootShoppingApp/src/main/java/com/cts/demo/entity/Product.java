package com.cts.demo.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table
public class Product {
	
	@Id
	private int productId;
	private String productName;
	private int productPrice;
	private String productCategory;
	private Date productValidaty;
	

}
