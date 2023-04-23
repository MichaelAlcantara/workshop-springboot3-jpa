package com.michaelraposo.course.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.michaelraposo.course.entities.Category;
import com.michaelraposo.course.entities.Category;
import com.michaelraposo.course.entities.Order;
import com.michaelraposo.course.entities.User;
import com.michaelraposo.course.entities.enuns.OrderStatus;
import com.michaelraposo.course.repository.CategoryRepository;
import com.michaelraposo.course.repository.OrderRepository;
import com.michaelraposo.course.repository.UserRepository;

//Declarando que é uma classe de configuração
@Configuration
//Declarando que essa classe é do perfil de teste
@Profile("test")
public class TestConfig implements CommandLineRunner {

	//Injeção de dependencias
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private CategoryRepository categoryRepository;

	@Override
	//Tudo que for colocado dentro desse método irá roda quando o sistema começa
	public void run(String... args) throws Exception {
		
		Category cat1 = new Category(null, "Electronics"); 
		Category cat2 = new Category(null, "Books"); 
		Category cat3 = new Category(null, "Computers");
		
		categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
		
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456"); 
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456"); 
		
		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.PAID, u1); 
		Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.WAITING_PAYMENT, u2); 
		Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.CANCELED, u1); 

		
		userRepository.saveAll(Arrays.asList(u1, u2));
		orderRepository.saveAll(Arrays.asList(o1, o2, o3));
		
	}

	
}
