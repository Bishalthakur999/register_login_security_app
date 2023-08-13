package com.bishal.service;

import com.bishal.entity.User;

public interface UserService {
   
	public User saveUser(User user);
	public void removeSessionMessage();

}
