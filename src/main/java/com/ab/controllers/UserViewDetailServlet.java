package com.ab.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ab.factories.BMSFactory;
import com.ab.factories.UMSFactory;
import com.ab.models.User;
import com.ab.services.UserService;

/**
 * Servlet implementation class UserViewDetail
 */
@WebServlet("/UserViewDetailServlet")
public class UserViewDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserViewDetailServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String userEmail = request.getParameter("userEmail");
				
		UserService userService = UMSFactory.getUserService();

		List <User> viewDetail = userService.viewDetail(userEmail);
		
		HttpSession session = request.getSession(true);
		
        session.setAttribute("Detail", viewDetail);
		
		response.sendRedirect("View_userDetail.jsp");

		
	}

	
	}


