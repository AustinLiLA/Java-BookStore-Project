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
 * Servlet implementation class SearchBookServlet
 */
@WebServlet("/SearchBooksServlet1")
public class SearchBooksServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchBooksServlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int bookISBN = Integer.parseInt(request.getParameter("bookISBN"));
		String author = request.getParameter("author");
		
        UserService userService = BMSFactory.getUserService();
		
		List<Books> searchBook = userService.searchBooks(bookISBN, author);
		
		// create a session object
		
		HttpSession session = request.getSession(true);
		
		// Store the above List of books in the session
		
		session.setAttribute("sList", searchBook);
		
		response.sendRedirect("SearchBookfinal1.jsp");
	}

	

}
