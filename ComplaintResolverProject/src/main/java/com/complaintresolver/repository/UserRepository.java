package com.complaintresolver.repository;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import com.complaintresolver.model.UserModel;

@Repository(value = "userRepository")
public interface UserRepository extends CrudRepository<UserModel, Integer> {

}
