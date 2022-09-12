package com.ab.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import com.ab.models.User;
import com.ab.utilities.DatabaseConnection;

public class UserDatabaseDAOImpl implements UserDAO{

	private Connection con;
	
	private PreparedStatement pst;
	
	private ResultSet rs;
	
	@Override
    public User registerUser(User user) {
    	
    	con = DatabaseConnection.getConnection();
    	
    	// Prepare a statement 
    	
    	String query = "INSERT into user(user_name, user_email, user_password) value(?,?,?)";
    	
    	try {
    		
    		//step 3
    	pst = con.prepareStatement(query);
    	
    	// replace ?' with actual user data 
    	pst.setString(1,user.getUserName());
    	pst.setString(2,user.getUserEmail());
    	pst.setString(3,user.getUserPassword());
    		
    	//step 4 
    	// i indicates the number of records inserted/update/deleted on the table
    	int i = pst.executeUpdate(); // executeUpdate method is used to execute INSERT, UPDATE and DELETE command
    	
    	if(i>0) {
    		return user;
    		
    	}
    	}
    	catch(SQLException e) {
    	 System.out.println(e);
    	 
    	}
    	
    	return null;
    }


	@Override
	public String loginProcess(String userEmail, String userPassword) {
		
		String loginStatus = null;
		
		con = DatabaseConnection.getConnection();
		
		String query = "SELECT * from user WHERE user_email = ? AND user_password =?";
		
		try {
		pst = con.prepareStatement(query);
		
		// Replace ?'s with actual
		pst.setString(1, userEmail);
		
		pst.setString(2, userPassword);
		
		rs = pst.executeQuery();
		
		if(rs.next()) {// If customer record found do this
			loginStatus = "success";
		}
		else {
			loginStatus = "failure";
			
		}
		}
		catch(SQLException e) {
			
			System.out.println(e);
		}
		
		return loginStatus;
	}


	
	}

