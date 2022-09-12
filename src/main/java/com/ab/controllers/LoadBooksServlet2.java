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
import com.ab.models.Books;
import com.ab.services.UserService;

/**
 * Servlet implementation class LoadBooksServlet2
 */
@WebServlet("/LoadBooksServlet2")
public class LoadBooksServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoadBooksServlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        UserService userService = BMSFactory.getUserService();
		
		List<Books> bookList = userService.loadBooks();
		
		// create a session object
		
		HttpSession session = request.getSession(true);
		
		// Store the above List of books in the session
		
		session.setAttribute("bList", bookList);
		
		response.sendRedirect("view_books2.jsp");
	}

	
	}


