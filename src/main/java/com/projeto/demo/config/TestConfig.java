package com.projeto.demo.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.projeto.demo.entities.User;
import com.projeto.demo.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456"); 
		User u3 = new User(null, "Lucas Silva", "lucas@gmail.com", "966666666", "abcdef");
		User u4 = new User(null, "Julia Costa", "julia@gmail.com", "955555555", "ghijkl");
		User u5 = new User(null, "Pedro Almeida", "pedro@gmail.com", "944444444", "mnopqr");
		
		userRepository.saveAll(Arrays.asList(u1,u2,u3,u4,u5));
	}
}
