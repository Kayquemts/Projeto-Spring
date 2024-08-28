package com.projeto.demo.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.projeto.demo.entities.Order;
import com.projeto.demo.entities.User;
import com.projeto.demo.repositories.OrderRepository;
import com.projeto.demo.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired	
	private OrderRepository orderRepository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456"); 
		User u3 = new User(null, "Lucas Silva", "lucas@gmail.com", "966666666", "abcdef");
		User u4 = new User(null, "Julia Costa", "julia@gmail.com", "955555555", "ghijkl");
		User u5 = new User(null, "Pedro Almeida", "pedro@gmail.com", "944444444", "mnopqr");
		
		Order o1 = new Order(null, Instant.parse("2024-01-10T08:00:00Z"), u1);
		Order o2 = new Order(null, Instant.parse("2024-01-15T14:30:00Z"), u2);
		Order o3 = new Order(null, Instant.parse("2024-02-01T11:00:00Z"), u3);
		Order o4 = new Order(null, Instant.parse("2024-02-10T09:45:00Z"), u4);
		Order o5 = new Order(null, Instant.parse("2024-03-05T16:20:00Z"), u5);
		Order o6 = new Order(null, Instant.parse("2024-03-15T13:30:00Z"), u1);
		Order o7 = new Order(null, Instant.parse("2024-04-01T10:00:00Z"), u2);
		Order o8 = new Order(null, Instant.parse("2024-04-10T15:15:00Z"), u3);
		Order o9 = new Order(null, Instant.parse("2024-05-01T08:30:00Z"), u4);
		Order o10 = new Order(null, Instant.parse("2024-05-15T14:00:00Z"), u5);

		
		
		
		userRepository.saveAll(Arrays.asList(u1,u2,u3,u4,u5));
		orderRepository.saveAll(Arrays.asList(o1,o2,o3,o4,o5,o6,o7,o8,o9,o10));
	}
}
