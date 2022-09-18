package com.ab.models;

public class Basket{
    

	
	private int bookISBN;
	
	private float price;
	private int quantity; 
	
	private double total;
	
	
	
	public Basket() {
		
		
	}
	
	
	public Basket(int bookISBN,float price) {
		
	}


	public Basket(int bookISBN, int quantity, float price, double total) {
		
		this.quantity = quantity;
		this.total = total;
	}
	




public int getBookISBN() {
		return bookISBN;
	}
	public float getPrice() {
		return price;
	}
public int getQuantity() {
	return quantity;
}

public double getTotal() {
	return total;
}



public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public void setTotal(double total) {
	this.total = total;
}

public void setBookISBN(int bookISBN) {
 this.bookISBN = bookISBN;
}
public void setPrice(float price) {
	 this.price = price;
	}
public void setPrice(int price) {

}
public void increaseQuantity() {
	
	this.quantity++;
}
public void decreaseQuantity() {
	if(this.quantity>0) {
		this.quantity--;
	}
}
 
	 
}
