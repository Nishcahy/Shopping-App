package com.cts.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.cts.demo.service.ProductService;
import com.cts.demo.service.ProductServiceImpl;

@SpringBootApplication
@EnableAspectJAutoProxy
public class SpringbootShoppingAppApplication {

	public static void main(String[] args) {
		ApplicationContext cont=SpringApplication.run(SpringbootShoppingAppApplication.class, args);
		ProductService ser=cont.getBean(ProductServiceImpl.class);
//		System.out.println(ser.getProducts());
		
	}

}
