package com.ab.daos;

import java.util.List;

import com.ab.models.User;

public interface UserDAO {

	public User registerUser(User user);

	public String loginProcess(String userEmail, String userPassword);

	public List<User> viewDetail(String userEmail);
}
