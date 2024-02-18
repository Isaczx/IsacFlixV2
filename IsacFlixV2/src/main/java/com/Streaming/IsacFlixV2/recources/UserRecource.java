package com.Streaming.IsacFlixV2.recources;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Streaming.IsacFlixV2.entities.User;

@RestController
@RequestMapping("/users")
public class UserRecource {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		User isac = new User((byte) 1, "isac" , "isacjobz@gmail.com", "174.137.857-57", "IsacSantos");
		return ResponseEntity.ok().body(isac);
	}
}
