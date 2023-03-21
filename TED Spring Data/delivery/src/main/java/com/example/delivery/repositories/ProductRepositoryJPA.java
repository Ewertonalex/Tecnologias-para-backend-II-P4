package com.example.delivery.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.delivery.entities.Product;

public interface ProductRepositoryJPA extends JpaRepository<Product, Long>{
	
	
	@Query("SELECT p FROM Product p WHERE p.id = :id")
	Product findByProduct(Integer id);
	
	
	@Query(value="SELECT p.* FROM tb_product p  WHERE p.id = :id", nativeQuery = true)
	Product findByProductnative(Integer id);

	@Query("SELECT p FROM Product p")
	List<Product> findAllProducts();

	@Query(value = "SELECT * FROM Product", nativeQuery = true)
	List<Product> findAllProductsSQL();
}
