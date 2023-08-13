package com.bishal.controller;

import java.security.Principal;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bishal.repository.UserRepo;

@Controller
@RequestMapping("/user/")
public class UserController {
	
	@Autowired
	private UserRepo userRepo;

	@ModelAttribute
	public void commonUser(Principal p, Model m) {
		if (p != null) {
			String email = p.getName();
			com.bishal.entity.User user =  userRepo.findByEmail(email);
			m.addAttribute("user", user);
		}

	}

	@GetMapping("/profile")
	public String profile() {
		return "profile";
	}

}
