package com.complaintresolver.controller;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class RegistrationController {

		
	@RequestMapping("/register")
	public String registration(HttpServletRequest request) {
		return "registration";
	}
	
}
