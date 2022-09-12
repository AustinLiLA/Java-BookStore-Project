package com.ab.daos;

import com.ab.models.Basket;

public interface BasketDAO {

	public boolean addBasket(int bookISBN,int quantity, float price,double total);
}
