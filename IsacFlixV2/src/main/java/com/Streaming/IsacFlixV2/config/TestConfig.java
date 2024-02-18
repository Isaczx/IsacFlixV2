package com.Streaming.IsacFlixV2.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.Streaming.IsacFlixV2.entities.User;
import com.Streaming.IsacFlixV2.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
		
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		User isac = new User("isac" , "isacjobz@gmail.coms", "174.137.887-57", "IsacSantos");
		userRepository.save(isac);
		
	}
}
