package com.Streaming.IsacFlixV2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Streaming.IsacFlixV2.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	
	
}	
