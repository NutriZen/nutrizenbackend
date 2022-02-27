package com.ecommerce.nutrizenbackend.service;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ecommerce.nutrizenbackend.model.UserRegister;

public interface UserRegisterRepository extends JpaRepository<UserRegister, Long> {
	
	@Query("SELECT u FROM UserRegister u WHERE u.email = ?1")
	Optional<UserRegister> findByEmail(String email);

}//interface UserRegisterRepository
