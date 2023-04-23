package com.michaelraposo.course.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.michaelraposo.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
