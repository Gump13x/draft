package com.bp.service;

import com.bp.model.User;

import java.util.List;

public interface UserService {
	public List<User> getAllUsers();

	public User getUserById(Long id);

	public void save(User user);

	public void update(User user);

	public void delete(Long id);

}
