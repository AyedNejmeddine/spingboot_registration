package com.ayed.sprinboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/login")
public class MainController {
	
	@RequestMapping(method= RequestMethod.GET)
	public String login() {
		return "login";
	}

}
