package com.ab.daos;

import java.util.List;

import com.ab.models.Basket;
import com.ab.models.Books;

public interface BasketDAO {

	public List<Books> AddToBasket(int bookISBN,String title, float price,int quantity);
	
	
}
