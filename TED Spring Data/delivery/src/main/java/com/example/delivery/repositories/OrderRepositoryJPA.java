package com.example.delivery.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.delivery.entities.Order;

public interface OrderRepositoryJPA extends JpaRepository<Order, Long> {

}
