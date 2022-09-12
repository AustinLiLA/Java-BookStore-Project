package com.ab.services;


import java.util.List;

import com.ab.models.Basket;
import com.ab.models.Books;
import com.ab.models.User;

public interface UserService {

	public User registerUser(User user);

	public String loginProcess(String userEmail, String userPassword);

	public List<Books> loadBooks();
	
	public List<Books> searchBooks(int bookISBN, String author);
	
	public List<Books> AddBooks(int bookISBN, String title, float price);
	
	public List<Basket> AddProcess();
}
