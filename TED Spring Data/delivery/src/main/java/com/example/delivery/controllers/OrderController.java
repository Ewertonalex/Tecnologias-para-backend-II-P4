package com.example.delivery.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.delivery.dtos.OrderDTO;
import com.example.delivery.entities.Order;
import com.example.delivery.services.OrderService;

@RestController
@RequestMapping(value = "/orders")
public class OrderController {
	
	@Autowired
	private OrderService service;
	
	@GetMapping("/all")
	public List<Order> findAllOrders(){
		return service.findAllOrders();
	}
	
	@GetMapping("/ordersDto")
	public List<OrderDTO> findAllOrdersDto(){
		return service.findAllOrdersDto();
	}

}
