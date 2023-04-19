package com.michaelraposo.course.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.michaelraposo.course.entities.Order;
import com.michaelraposo.course.entities.User;
import com.michaelraposo.course.repository.OrderRepository;

//annotation declarando que essa classe é um componente de serviço
@Service
public class OrderService {
	
	//Injeção de dependencia
	@Autowired
	private OrderRepository repository;
	
	public List<Order> findAll(){
		return repository.findAll();
	}
	
	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}
}
