package com.cts.demo.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Entity
@Data
@Table
public class Product {

	@Id
	@NotEmpty
	@NotNull(message = "Product ID cannot be null")
	private int productId;

	@NotNull(message = "Product Name cannot be null")
	private String productName;
	@Positive(message = "Price should be Positive")
	private int productPrice;
	@NotNull(message = "Product Category cannot be null")
	private String productCategory;

	private Date productValidaty;

}
