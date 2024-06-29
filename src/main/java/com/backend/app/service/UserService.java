package com.backend.app.service;

import java.util.List;

import com.backend.app.model.User;

public interface UserService {

	
	public User insert(User userVO);

	public List<User> findAll();

	public void delete(int id);

	public User findById(int id);

	public User updateUser(int id, User userVO);

}
