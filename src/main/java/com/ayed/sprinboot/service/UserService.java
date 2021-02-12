package com.ayed.sprinboot.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.ayed.sprinboot.model.User;
import com.ayed.sprinboot.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService{
	
	public User save(UserRegistrationDto userRegitrationDto);
}
