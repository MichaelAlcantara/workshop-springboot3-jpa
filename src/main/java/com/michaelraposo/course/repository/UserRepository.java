package com.michaelraposo.course.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.michaelraposo.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
