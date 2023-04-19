package com.michaelraposo.course.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.michaelraposo.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
