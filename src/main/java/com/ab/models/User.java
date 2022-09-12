package com.ab.models;

public class User {

	private int userId;
	
	private String userName; 
	
	private String userEmail;
	
	private String userPassword;





public User(int userId, String userName, String userEmail, String userPassword) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userEmail = userEmail;
		this.userPassword = userPassword;
	}


public User(int userId, String userName, String userEmail) {
	super();
	this.userId = userId;
	this.userName = userName;
	this.userEmail = userEmail;
}


public User(String userName, String userEmail, String userPassword) {
	super();
	this.userName = userName;
	this.userEmail = userEmail;
	this.userPassword = userPassword;
}


public int getUserId() {
	return userId;
}


public String getUserName() {
	return userName;
}


public String getUserEmail() {
	return userEmail;
}


public String getUserPassword() {
	return userPassword;
}


@Override
public String toString() {
	return "User [userId=" + userId + ", userName=" + userName + ", userEmail=" + userEmail + ", userPassword="
			+ userPassword + "]";
} 
	
	
	
	
	

	
	
}
