package com.bishal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bishal.entity.User;
import java.util.List;


public interface UserRepo extends JpaRepository<User, Integer>{
	
	public User findByEmail(String email);

}
