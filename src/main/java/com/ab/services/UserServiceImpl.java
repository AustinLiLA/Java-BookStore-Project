package com.ab.services;

import java.util.List;

import com.ab.daos.BasketDAO;
import com.ab.daos.BookDAO;
import com.ab.daos.UserDAO;
import com.ab.models.Basket;
import com.ab.models.Books;
import com.ab.models.User;

public class UserServiceImpl implements UserService{

	private UserDAO userDAO; //Has-a relationship

	private BookDAO bookDAO; // Has a relationship
	
	private BasketDAO basketDAO;
	
public UserServiceImpl(BasketDAO basketDAO) {
		
		this.basketDAO = basketDAO;
	}
	
	public UserServiceImpl(UserDAO userDAO) {
		
		this.userDAO = userDAO;
	}
	public UserServiceImpl(BookDAO bookDAO) {
		
		this.bookDAO =bookDAO;
	}
	@Override
	public User registerUser(User user) {
		// Try to encrypt customer password before sending user details to DAO
		
		return this.userDAO.registerUser(user);
	}

	@Override
	public String loginProcess(String userEmail, String userPassword) {
		// Try to encrypt customer password before sending user details to DAO
		return this.userDAO.loginProcess(userEmail, userPassword);
	}

	@Override
	public List<Books> loadBooks() {
		// Write code to filter out the records given by DAO layers
		return this.bookDAO.loadBooks();
	}

	@Override
	public List<Books> searchBooks(int bookISBN, String author){
		
		return this.bookDAO.searchBooksByISBN(bookISBN);
	}
	
    @Override
	public List<Books> AddBooks(int bookISBN, String title,float price) {
		// TODO Auto-generated method stub
		return this.bookDAO.AddBooks(bookISBN, title,price);
	}
	@Override
	public List<Books> AddToBasket(int bookISBN, String title, float price, int quantity) {
		// TODO Auto-generated method stub
		return BookDAO.AddToBasket(bookISBN, title, price, quantity);
	}

	@Override
	public List<User> viewDetail(String userEmail) {
		// TODO Auto-generated method stub
		return this.userDAO.viewDetail(userEmail);
	}
	
	
	
	
}
