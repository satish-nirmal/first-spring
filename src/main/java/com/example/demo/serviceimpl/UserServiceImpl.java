package com.example.demo.serviceimpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;


@Service
public class UserServiceImpl implements UserService {

List<User> users = new ArrayList<>(Arrays.asList(new User("virat@123", "12345"),
			new User("rohit@888", "12345"),
			new User("msd@07", "12345")
			));

	@Override
	public List<User> getAllUsers() {
		
		return users;
	}

	@Override
	public User getUser(String username) {
	
		return users.stream().filter(u -> u.getUsername().equals(username)).findFirst().get();
	}

	@Override
	public void deleteUser(String username) {
		
		users.removeIf(t -> t.getUsername().equals(username));
		
	}

	@Override
	public void addUser(User user) {
	
		users.add(user);	
	}

	@Override
	public void updateUser(User user, String username) {
	
		for(int i =0 ; i<=users.size();i++) {
		User u =	users.get(i);
		if(u.getUsername().equals(username)) {
			users.set(i, user);
		}
		}	
	}
}
