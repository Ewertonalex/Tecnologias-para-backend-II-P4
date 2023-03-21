package com.example.delivery.repositories;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.delivery.entities.Product;

@Repository
public class ProductRepository {
	
	public List<String> findAll(){
		List<String> teste = new ArrayList<>();
		teste.add("teste 1");
		teste.add("teste 2");
		teste.add("teste 3");
		teste.add("teste 4");
		teste.add("teste 5");
		return teste;
	}
	
	public List<Product> findAllProducts(){
		List<Product> teste = new ArrayList<>();
		teste.add(new Product(1L, "teste 1", 1.0, "teste 1 descricao", "http:/teste1"));
		teste.add(new Product(2L, "teste 2", 2.0, "teste 2 descricao", "http:/teste2"));
		teste.add(new Product(3L, "teste 3", 3.0, "teste 3 descricao", "http:/teste3"));
		teste.add(new Product(4L, "teste 4", 4.0, "teste 4 descricao", "http:/teste4"));
		return teste;
	}
	
}
