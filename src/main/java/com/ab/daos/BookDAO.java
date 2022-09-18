package com.ab.daos;

import java.util.List;

import com.ab.models.Basket;
import com.ab.models.Books;

public interface BookDAO {

	public List<Books> loadBooks();
	
	public List<Books> searchBooks(int bookISBN, String author);
	
	public List<Books> AddBooks(int bookISBN, String title,float price);
	
	public static List<Books> AddToBasket(int bookISBN,String title, float price,int quantity) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	public List<Basket> ViewBasket();

	

	
}
