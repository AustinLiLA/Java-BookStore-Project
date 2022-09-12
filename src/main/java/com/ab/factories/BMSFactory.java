package com.ab.factories;

import com.ab.daos.BookDAO;
import com.ab.daos.BookDatabaseDAOImpl;
import com.ab.models.Basket;
import com.ab.models.Books;
import com.ab.services.UserService;
import com.ab.services.UserServiceImpl;

public class BMSFactory {

	public static Books getBooks(int bookISBN,String title,String author,String overview,float price) {
		
		return new Books(bookISBN,title,author,overview,price);
		
	}
	
	public static BookDAO bookDAO() {
		
		return new BookDatabaseDAOImpl();
		
	}
	public static UserService getUserService() {
		
		return new UserServiceImpl(bookDAO());
	}
    public static Books getcustomBooks(int bookISBN,String title,float price) {
	
	return new Books(bookISBN, title,price); 
    }
	public static Basket AddProcess(int bookISBN, int quantity, float price, double total){
		
	 return new Basket(bookISBN, quantity, price, total);
	}
 }

