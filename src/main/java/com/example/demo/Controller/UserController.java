package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	
	@GetMapping("/users")
	public List<User> getAllUsers(){
		
		return userService.getAllUsers(); 
	}
	
	@GetMapping("/user/{username}")
	public User getUser(@PathVariable String username) {
	
		return userService.getUser(username);
	}
	
	@DeleteMapping("/user/{username}")
	public void deleteUser(@PathVariable String username) {
		
		userService.deleteUser(username);
	}
	
	@PostMapping("/user")
	public void addUser(@RequestBody User user) {
		
		userService.addUser(user);
	}
	
	@PutMapping("/user/{username}")
	public void updateUser(@RequestBody User user, String username) {
		
		userService.updateUser(user, username);
		
	}
}
