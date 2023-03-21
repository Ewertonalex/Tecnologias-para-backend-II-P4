package com.example.delivery.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.delivery.dtos.ProductDTO;
import com.example.delivery.entities.Product;
import com.example.delivery.repositories.ProductRepository;
import com.example.delivery.repositories.ProductRepositoryJPA;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repository;
	
	@Autowired
	private ProductRepositoryJPA repositoryJpa;
	
	public List<String> finAll(){
		return repository.findAll();
	}
	
	public List<Product> findAllProducts(){
		return repository.findAllProducts();
	}
	
	public List<ProductDTO> findAllProductsDto(){
		List<Product> products = repository.findAllProducts();
		/*List<ProductDTO> dtos = new ArrayList<>();
		for(Product product : products){
			dtos.add(new ProductDTO(product)); 
		}*/
		return products.stream().map(x -> new ProductDTO(x)).collect(Collectors.toList());
	}
	
	public Product findByProductId(Integer id) {
		return repositoryJpa.findByProduct(id);
	}
	
	public Product findByProductIdNative(Integer id) {
		return repositoryJpa.findByProductnative(id);
	}
	
	

}
