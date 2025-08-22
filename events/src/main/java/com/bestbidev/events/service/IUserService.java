package com.bestbidev.events.service;

import java.util.List;

import com.bestbidev.events.model.User;

public interface IUserService {
	public User addUser(User user);
	public User getUserById(Integer id);
	public User getUserByEmail(String email);
	public List<User> getAllUsers();
}