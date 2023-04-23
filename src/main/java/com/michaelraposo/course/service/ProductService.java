package com.michaelraposo.course.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.michaelraposo.course.entities.Product;
import com.michaelraposo.course.repository.ProductRepository;

//annotation declarando que essa classe é um componente de serviço
@Service
public class ProductService {
	
	//Injeção de dependencia
	@Autowired
	private ProductRepository repository;
	
	public List<Product> findAll(){
		return repository.findAll();
	}
	
	public Product findById(Long id) {
		Optional<Product> obj = repository.findById(id);
		return obj.get();
	}
}
