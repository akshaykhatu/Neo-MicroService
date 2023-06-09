package com.MicroService.UserService.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.MicroService.UserService.Model.User;
import com.MicroService.UserService.Service.UserService;

@RestController
@RequestMapping("/users")
public class UserServiceController {
	@Autowired
	private UserService userService;
	
	@PostMapping
	public ResponseEntity<User> saveUser(@RequestBody User user) {
		User user1 = userService.saveUser(user);
		return ResponseEntity.status(HttpStatus.CREATED).body(user1);

	}
	
	@GetMapping("/{userId}")
	public ResponseEntity<User> getUserById(@PathVariable String userId) {
		User user =	userService.getUser(userId);
		return ResponseEntity.ok(user);
	}
 
	@GetMapping
	public ResponseEntity<List<User>> getAllUsers() {
		List<User> user =	userService.getAllUsers();
		return ResponseEntity.ok(user);
	}
	
}
