package com.ecommerce.nutrizenbackend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "UserRegister")
public class UserRegister {

	@Id //Se indica que es un id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//Es auto generado
	@Column(name="id", unique = true, nullable = false)
	private Long id;
	private String first_name;
	private String last_name;
	private String email;
	private String phone;
	private String password;
	
	public UserRegister(Long id, String first_name, String last_name, String email, String phone, String password) {
		super();
		this.id = id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.phone = phone;
		this.password = password;
	}//constructor UserRegister
	
	public UserRegister() {}//constructor vacio UserRegister

	public Long getId() {
		return id;
	}//getId

	public void setId(Long id) {
		this.id = id;
	}//setId

	public String getFirst_name() {
		return first_name;
	}//getFirst_name

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}//setFirst_name

	public String getLast_name() {
		return last_name;
	}//getLast_name

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}//setLast_name

	public String getEmail() {
		return email;
	}//getEmail

	public void setEmail(String email) {
		this.email = email;
	}//setEmail

	public String getPhone() {
		return phone;
	}//getPhone

	public void setPhone(String phone) {
		this.phone = phone;
	}//setPhone

	public String getPassword() {
		return password;
	}//getPassword

	public void setPassword(String password) {
		this.password = password;
	}//setPassword

	@Override
	public String toString() {
		return "UserRegister [id=" + id + ", first_name=" + first_name + ", last_name=" + last_name + ", email=" + email
				+ ", phone=" + phone + ", password=" + password + "]";
	}//toString
	
}//class UserRegister
