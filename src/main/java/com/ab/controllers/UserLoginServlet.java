package com.ab.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ab.factories.UMSFactory;
import com.ab.services.UserService;

/**
 * Servlet implementation class UserLoginServlet
 */
@WebServlet("/UserLoginServlet")
public class UserLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public UserLoginServlet() {
        // TODO Auto-generated constructor stub
    }


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Read user input
		
		String userEmail = request.getParameter("userEmail");
		String userPassword = request.getParameter("userPassword");
		
		UserService userService = UMSFactory.getUserService();
		
		String status = userService.loginProcess(userEmail,userPassword);
		
		if(status.equals("success")) {
			
			response.sendRedirect("dashboard1.jsp");
		}
		else {
			
			response.sendRedirect("login_failure.jsp");
		}
	}

}
