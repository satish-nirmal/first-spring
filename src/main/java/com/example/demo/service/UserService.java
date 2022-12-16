package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.User;

public interface UserService {

	public List<User> getAllUsers();
	
	public User getUser(String username);
	
	public void deleteUser(String username);
	
	public void addUser(User user);
	
	public void updateUser(User user, String username);
	
}
