package com.ecommerce.nutrizenbackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.nutrizenbackend.model.UserRegister;
import com.ecommerce.nutrizenbackend.service.UserRegisterService;

@RestController
@RequestMapping(path = "/api/login/")
@CrossOrigin(origins = "*")
public class UserLoginController {
	
	private final UserRegisterService userRegisterService;

	@Autowired
	public UserLoginController(UserRegisterService userRegisterService) {
		super();
		this.userRegisterService = userRegisterService;
	}//UserLoginController
	
	
	//Metodo para el login de usuarios
	@PostMapping
	public String Login(@RequestBody UserRegister user) {
		String respuesta = "false";
		if(userRegisterService.login(user.getEmail(), user.getPassword())) {
			respuesta = "true";
		}//if
		return respuesta;
	}//Login
	
}//class UserLoginController
