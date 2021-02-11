package com.ayed.sprinboot.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ayed.sprinboot.model.Role;
import com.ayed.sprinboot.model.User;
import com.ayed.sprinboot.repository.UserRepository;
import com.ayed.sprinboot.web.dto.UserRegistrationDto;
@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;
	
	public UserServiceImpl(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}

	@Override
	public User save(UserRegistrationDto regitrationDto) {
		User user = new User(regitrationDto.getFirstName(),
							 regitrationDto.getLastName(),
							 regitrationDto.getEmail(),
							 regitrationDto.getPassword(),
							 Arrays.asList(new Role("ROLE_USER")));
		return userRepository.save(user);
	}

}
