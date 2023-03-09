package com.programming.techie.orderservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.programming.techie.orderservice.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {}
