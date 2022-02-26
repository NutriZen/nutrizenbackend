package com.ecommerce.nutrizenbackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.nutrizenbackend.model.UserRegister;
import com.ecommerce.nutrizenbackend.service.UserRegisterService;

@RestController
@RequestMapping(path = "/api/users/")
@CrossOrigin(origins = "*")
public class UserRegisterController {
	
	private final UserRegisterService userRegisterService;

	@Autowired
	public UserRegisterController(UserRegisterService userRegisterService) {
		this.userRegisterService = userRegisterService;
	}//UserRegisterController
	
	@GetMapping
	public List<UserRegister> getUsers(){
		return userRegisterService.getUsers();
	}//getUsers
	
	@PostMapping
	public void addNewUser(@RequestBody UserRegister user) {
		userRegisterService.addNewUser(user);
	}
	
	
	
}//UserRegisterController
