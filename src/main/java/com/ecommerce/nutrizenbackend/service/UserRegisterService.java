package com.ecommerce.nutrizenbackend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.ecommerce.nutrizenbackend.model.UserRegister;

@Service
public class UserRegisterService {
	
	private final UserRegisterRepository userRegisterRepository;

	@Autowired
	public UserRegisterService(UserRegisterRepository userRegisterRepository) {
		this.userRegisterRepository = userRegisterRepository;
	}
	
	public List<UserRegister> getUsers() {
		return userRegisterRepository.findAll();
	}//getUsers
	
	public void addNewUser(UserRegister user) {
		Optional<UserRegister> userByEmail = userRegisterRepository.findByName(user.getEmail());
		if(userByEmail.isPresent()) {
			throw new IllegalStateException("El usuario con el email [" + user.getEmail() + "] ya existe");
		}else {
			userRegisterRepository.save(user);
		}//if else
		
	}//addNewUser


	

}//UserRegisterService
