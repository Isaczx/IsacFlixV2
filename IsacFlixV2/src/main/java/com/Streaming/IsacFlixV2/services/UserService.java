package com.Streaming.IsacFlixV2.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Streaming.IsacFlixV2.entities.User;
import com.Streaming.IsacFlixV2.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public List<User> findAll(){
		return repository.findAll();
	}
	
	public User findById(int id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}
}
