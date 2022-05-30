package com.devsuperior.bds04.dto;

import java.util.HashSet;
import java.util.Set;

import javax.validation.constraints.Email;

import com.devsuperior.bds04.entities.Role;
import com.devsuperior.bds04.entities.User;

public class UserDTO {
	
	private Long id;
	
	@Email(message="Email invalido")
	private String email;
	private String password;
	
	private Set<Role> roles = new HashSet<>();
	
	public UserDTO() {
	}

	public UserDTO(Long id, @Email(message = "Email invalido") String email) {
		this.id = id;
		this.email = email;
	}
	
	public UserDTO(User entity) {
		id = entity.getId();
		email = entity.getEmail();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Set<Role> getRoles() {
		return roles;
	}

}
