package com.complaintresolver.services;

import javax.transaction.Transactional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.complaintresolver.model.UserModel;
import com.complaintresolver.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	
	
	public void SaveMyUser(UserModel userModel) {
		getUserRepository().save(userModel);
		//userRepository.save(userModel); 
	}


	public UserRepository getUserRepository() {
		return userRepository;
	}


	public void setUserRepository(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
}
