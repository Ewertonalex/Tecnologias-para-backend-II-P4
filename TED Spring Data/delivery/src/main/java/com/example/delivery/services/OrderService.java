package com.example.delivery.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.delivery.dtos.OrderDTO;
import com.example.delivery.entities.Order;
import com.example.delivery.repositories.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository repository;
	
	public List<Order> findAllOrders(){
		return repository.findAllOrders();
	}
	
	public List<OrderDTO> findAllOrdersDto(){
		List<Order> orders = repository.findAllOrders();	
		return orders.stream().map(x -> new OrderDTO(x)).collect(Collectors.toList());
	}

}
