package com.ab.factories;

import com.ab.daos.UserDAO;
import com.ab.daos.UserDatabaseDAOImpl;
import com.ab.models.User;
import com.ab.services.UserService;
import com.ab.services.UserServiceImpl;

public class UMSFactory {

	
public static User getUser(int userId, String userName, String userEmail) {
	
	return new User(userId, userName, userEmail);
	
}
	
public static User getCustomUser(String userName, String userEmail, String userPassword) {
	
	return new User(userName, userEmail, userPassword);
}

public static User getUserDetail(int userId, String userName, String userEmail, String userPassword) {
	
	return new User(userId, userName, userEmail, userPassword);
}
	
public static UserDAO userDAO() {
	
	return new UserDatabaseDAOImpl();
}
	
public static UserService getUserService() {
	
	return new UserServiceImpl(userDAO());
	
}
	
}
