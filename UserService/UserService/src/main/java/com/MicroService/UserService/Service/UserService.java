package com.MicroService.UserService.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.MicroService.UserService.Model.User;


public interface UserService {
	
	User saveUser(User user);
	
	List<User> getAllUsers();
	
	User getUser(String userId);
}
