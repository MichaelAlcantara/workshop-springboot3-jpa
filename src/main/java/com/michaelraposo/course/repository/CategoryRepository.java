package com.michaelraposo.course.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.michaelraposo.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
