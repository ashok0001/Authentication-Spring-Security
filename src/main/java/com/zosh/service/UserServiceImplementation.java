package com.zosh.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zosh.modal.User;
import com.zosh.repository.UserRepository;

@Service
public class UserServiceImplementation implements UserService {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public User updateUser(User user) {
		// TODO Auto-generated method stub
		
		return userRepository.save(user);
		

	}

	@Override
	public User findUserById(Integer userId) {
		// TODO Auto-generated method stub
		
		
		Optional<User> opt=userRepository.findById(userId);
		
		if(opt.isPresent()) {
			return opt.get();
		}
		
		return null;
	}

	@Override
	public void deleteUser(User user) {
		
		userRepository.delete(user);
		// TODO Auto-generated method stub
		
	}

}
