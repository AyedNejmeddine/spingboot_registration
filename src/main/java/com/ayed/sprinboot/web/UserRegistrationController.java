package com.ayed.sprinboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ayed.sprinboot.service.UserService;
import com.ayed.sprinboot.web.dto.UserRegistrationDto;


@Controller
@RequestMapping("/registration")
public class UserRegistrationController {

	private UserService userService;

	public UserRegistrationController(UserService userService) {
		super();
		this.userService = userService;
	}
	
	@ModelAttribute("user")
	public UserRegistrationDto userRegistrationDto() {
		return new UserRegistrationDto();
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public String showRegistrationForm() {
		return "registration";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String registrationAccount(@ModelAttribute("user") UserRegistrationDto regitrationDto) {
		userService.save(regitrationDto);
		return "redirect:/registration?success";
	}
	
}
