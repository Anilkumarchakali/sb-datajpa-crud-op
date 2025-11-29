package com.example.SBP_DB_CRUD.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SBP_DB_CRUD.entity.User;
import com.example.SBP_DB_CRUD.service.UserService;
@RestController
@RequestMapping("/Controller")
public class UserController {

	private final UserService userService;

	public UserController(UserService userService) {
		this.userService = userService;
	}
	@PostMapping("/save")
	public User createUser(@RequestBody User user) {
		return userService.saveUser(user);
	}
	@GetMapping("/{uid}")
	public Optional<User> findUser(@PathVariable Integer uid) {
		return userService.getUser(uid);
	}
	@GetMapping
	public List<User> findAllUsers() {
	return (List<User>) userService.getAllUsers();	
	}
	@DeleteMapping("/{uid}")
	public String removeUser(@PathVariable Integer uid) {
		userService.deleteUser(uid);
		return uid + " uid data deleted";
	}
	@GetMapping("/count")
	public Integer totalUsers() {
		return (int) userService.countUsers();
	}
}
