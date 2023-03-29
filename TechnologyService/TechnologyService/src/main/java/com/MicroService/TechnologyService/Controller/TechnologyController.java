package com.MicroService.TechnologyService.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.MicroService.TechnologyService.Model.Technology;
import com.MicroService.TechnologyService.Service.TechnologyService;

@RestController
@RequestMapping("/technology")
public class TechnologyController {
	
     @Autowired
	TechnologyService service;

	@PostMapping
	public ResponseEntity<Technology> saveUser(@RequestBody Technology user) {
		Technology user1 = service.saveTechnology(user);
		return ResponseEntity.status(HttpStatus.CREATED).body(user1);

	}

	@GetMapping("/{technologyId}")
	public ResponseEntity<Technology> getUserById(@PathVariable String userId) {
		Technology user = service.getTechnology(userId);
		return ResponseEntity.ok(user);
	}

	@GetMapping
	public ResponseEntity<List<Technology>> getAllUsers() {
		List<Technology> user = service.getAllTechnology();
		return ResponseEntity.ok(user);
	}
	
	@GetMapping("/users/{userId}")
	public ResponseEntity<List<Technology>> getUserByUserId(@PathVariable String userId) {
		List<Technology> user = service.findByUserId(userId);
		return ResponseEntity.ok(user);
	}
}
