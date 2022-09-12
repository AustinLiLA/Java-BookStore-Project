package com.ab.controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ab.factories.BMSFactory;
import com.ab.factories.UMSFactory;
import com.ab.models.Books;
import com.ab.models.Basket;

import com.ab.models.User;
import com.ab.services.UserService;


/**
 * Servlet implementation class AddfunctionServlet
 */
@WebServlet("/AddtoBasketServlet")
public class AddtoBasketServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddtoBasketServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/*
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       
         
		
		
	    UserService us = BMSFactory.getUserService();
	    
	    List<Basket> Addedbook = us.AddProcess();
		HttpSession session = request.getSession(true);
		
		session.setAttribute("AList", Addedbook);
		
		response.sendRedirect("Shoppingbasket.jsp");
		}
	        
           
          
	}
	

