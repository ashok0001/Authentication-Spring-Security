package com.zosh.service;

import com.zosh.modal.User;

public interface UserService {
	
	public User updateUser(User user);
	
	public User findUserById(Integer userId);
	
	public void deleteUser(User user);

}
