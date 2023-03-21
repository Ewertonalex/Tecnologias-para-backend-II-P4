package com.example.delivery.controllers;

import java.util.List;

import org.hibernate.annotations.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.delivery.dtos.ProductDTO;
import com.example.delivery.entities.Product;
import com.example.delivery.services.ProductService;

@RestController
@RequestMapping(value = "/products")
public class ProductController {
	
	@Autowired
	private ProductService service;
	
	@GetMapping
	public List<String> finAll(){
		return service.finAll();
	}
	
	@GetMapping("/all")
	public List<Product> findAllProduct(){
		return service.findAllProducts();
	}
	
	@GetMapping("/productsDto")
	public List<ProductDTO> findAllProductDto(){
		return service.findAllProductsDto();
	}
	
	@GetMapping("/product/{id}")
	public Product findByProductId (@PathVariable Integer id) {
		return service.findByProductId(id);
	}
	
	@GetMapping("/productnative/{id}")
	public Product findByProductIdNative (@PathVariable Integer id) {
		return service.findByProductIdNative(id);
	}

	@GetMapping("/allj")
	public List<Product> findAllProductJPQL(){
		return service.findAllProductsJPQL();
	}

	@GetMapping("/alls")
	public List<Product> findAllProductSQL(){
		return service.findAllProductsSQL();
	}

}
