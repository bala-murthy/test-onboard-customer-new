package com.bala.tf.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.bala.tf.model.User;

@RestController
public class OnboardCustomerContrtoller {
	
	@GetMapping("/getuserdetails/{userId}")
	public User getUserDetails(@PathVariable String userId) {
		return new User(userId);
	}

}
