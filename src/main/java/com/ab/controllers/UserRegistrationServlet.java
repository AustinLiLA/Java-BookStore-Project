package com.ab.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ab.factories.UMSFactory;
import com.ab.models.User;
import com.ab.services.UserService;


/**
 * Servlet implementation class UserRegistrationServlet
 */
@WebServlet("/UserRegistrationServlet")
public class UserRegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public UserRegistrationServlet() {
    	super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Write to code retrieve user input 
		String userName = request.getParameter("userName");
		String userEmail = request.getParameter("userEmail");
		String userPassword = request.getParameter("userPassword");
		
		// Create a model object using the input values
		
		User user = UMSFactory.getCustomUser(userName, userEmail, userPassword);
		
		UserService userService =UMSFactory.getUserService();
		
		User registeredUser = userService.registerUser(user);
		
		if(registeredUser != null ) {
			
			response.sendRedirect("register_success.jsp"); //JSP represents view
		}
		else {
			// Redirect the request to index page
			
			response.sendRedirect("index.jsp"); // JSP represents view
			
		}
	}
     
}
