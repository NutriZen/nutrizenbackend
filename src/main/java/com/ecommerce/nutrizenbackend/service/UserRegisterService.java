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
		Optional<UserRegister> userByEmail = userRegisterRepository.findByEmail(user.getEmail());
		if(userByEmail.isPresent()) {
			throw new IllegalStateException("El usuario con el email [" + user.getEmail() + "] ya existe");
		}else {
			user.setPassword( utils.SHAUtil.createHash(user.getPassword()) );
			userRegisterRepository.save(user);
		}//if else
	}//addNewUser

	
	//UserLoginService
	public boolean login(String email, String password) {
		  boolean res=false;
		    Optional<UserRegister> user = userRegisterRepository.findByEmail(email);
		    if (user.isPresent()) {
		    	System.out.println("Password SHA: "+utils.SHAUtil.createHash(password));
		        if (utils.SHAUtil.verifyHash(password, user.get().getPassword())) {
		            res=true;
		        }// if password
		    }//if isPresent
		    return res;
			
		}//login
	
	


	

}//UserRegisterService
