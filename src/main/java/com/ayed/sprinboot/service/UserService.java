package com.ayed.sprinboot.service;

import com.ayed.sprinboot.model.User;
import com.ayed.sprinboot.web.dto.UserRegistrationDto;

public interface UserService {
	
	public User save(UserRegistrationDto userRegitrationDto);
}
