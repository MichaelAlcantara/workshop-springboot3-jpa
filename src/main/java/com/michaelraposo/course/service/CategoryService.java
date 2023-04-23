package com.michaelraposo.course.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.michaelraposo.course.entities.Category;
import com.michaelraposo.course.repository.CategoryRepository;

//annotation declarando que essa classe é um componente de serviço
@Service
public class CategoryService {
	
	//Injeção de dependencia
	@Autowired
	private CategoryRepository repository;
	
	public List<Category> findAll(){
		return repository.findAll();
	}
	
	public Category findById(Long id) {
		Optional<Category> obj = repository.findById(id);
		return obj.get();
	}
}
