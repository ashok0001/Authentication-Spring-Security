package com.zosh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zosh.modal.User;
import com.zosh.service.UserService;

import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping("/api/users")
public class UserController {
	
	@Autowired
	private UserService userService; 
	
	@PutMapping("/edit")
	public ResponseEntity<User> updateUserHandler(@RequestBody User user){
		
		User updatedUser = userService.updateUser(user);
		
		
		return new ResponseEntity<User>(updatedUser,HttpStatus.OK);
		
	}
	
	@PutMapping("/{userId}")
	public ResponseEntity<User> findUserByIdHandler(@PathVariable Integer userId){
		
		User user = userService.findUserById(userId);
		
		
		return new ResponseEntity<User>(user,HttpStatus.OK);
		
	}
	
	@PutMapping("/{userId}")
	public ResponseEntity<String> deleteUserHandler(@PathVariable Integer userId){
		
		User user = userService.findUserById(userId);
		
		userService.deleteUser(user);
		
		
		return new ResponseEntity<>("User Delete Successfully",HttpStatus.OK);
		
	}

}
