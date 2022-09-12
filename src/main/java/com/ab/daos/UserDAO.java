package com.ab.daos;

import com.ab.models.User;

public interface UserDAO {

	public User registerUser(User user);

	public String loginProcess(String userEmail, String userPassword);

	
}
