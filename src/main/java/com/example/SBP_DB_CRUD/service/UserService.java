package com.example.SBP_DB_CRUD.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.SBP_DB_CRUD.crudrepo.UserRepostory;
import com.example.SBP_DB_CRUD.entity.User;

@Service
public class UserService {

	private final UserRepostory userRepo;

	public UserService(UserRepostory userRepo) {
		this.userRepo = userRepo;
	}
	
	public User saveUser(User user) {
		return userRepo.save(user);
	}
	
	public Optional<User> getUser(Integer uid) {
		return userRepo.findById(uid);
	}
	
	public List<User> getAllUsers() {
	return (List<User>) userRepo.findAll();	
	}
	
	public String deleteUser(Integer uid) {
		userRepo.deleteById(uid);
		return uid + " uid data deleted";
	}
	
	public Integer countUsers() {
		return (int) userRepo.count();
	}
}
