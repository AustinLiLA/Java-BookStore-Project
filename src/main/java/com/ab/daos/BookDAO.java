package com.ab.daos;

import java.util.List;

import com.ab.models.Basket;
import com.ab.models.Books;

public interface BookDAO {

	public List<Books> loadBooks();
	
	public List<Books> searchBooks(int bookISBN, String author);
	
	public List<Books> AddBooks(int bookISBN, String title,float price);
	
	public List<Basket> AddProcess();
	
	public List<Basket> ViewBasket();


	
}
