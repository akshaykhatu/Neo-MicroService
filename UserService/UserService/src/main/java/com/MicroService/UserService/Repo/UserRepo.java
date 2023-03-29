package com.MicroService.UserService.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.MicroService.UserService.Model.User;

@Repository
public interface UserRepo extends JpaRepository<User, String>{
	

}
