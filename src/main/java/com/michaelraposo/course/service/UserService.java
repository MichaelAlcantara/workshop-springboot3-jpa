package com.michaelraposo.course.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.michaelraposo.course.entities.User;
import com.michaelraposo.course.repository.UserRepository;

//annotation declarando que essa classe é um componente de serviço
@Service
public class UserService {
	
	//Injeção de dependencia
	@Autowired
	private UserRepository repository;
	
	public List<User> findAll(){
		return repository.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}
}
