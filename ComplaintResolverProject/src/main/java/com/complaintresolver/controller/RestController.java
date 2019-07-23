package com.complaintresolver.controller;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.complaintresolver.model.UserModel;
//import com.ComplaintResolver.services.UserService;
import com.complaintresolver.repository.UserRepository;

@org.springframework.web.bind.annotation.RestController
public class RestController {
		@Autowired
		public UserRepository userRepository;
		@GetMapping("/")
		public String register(){
			return "this home page";
		}
		@GetMapping("/save-user")
		public String saveUser(@RequestParam String User_FullName,@RequestParam String User_Password,@RequestParam int User_MobileNumber,@RequestParam String User_Address,@RequestParam String User_Email)
		{
			UserModel user = new UserModel(User_FullName,User_Password,User_MobileNumber,User_Address,User_Email);
			//getUserService().SaveMyUser(user);
			return "User Saved";
		}
		
		
}
