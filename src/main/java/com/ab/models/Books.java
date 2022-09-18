package com.ab.models;

public class Books {

	private int bookISBN;
	
	private String title;
	
	private String author; 
	
	private String overview;
	
	private int quantity;
	
	private float price;
    
	
public Books(String title,float price) {
		
		
		this.title = title;
		
		this.price = price;
	}
	

public Books(int bookISBN,float price) {
	
	
	this.bookISBN = bookISBN;
	
	this.price = price;
}


public Books(int bookISBN, String title, String author, String overview, float price) {
	super();
	this.bookISBN = bookISBN;
	this.title = title;
	this.author = author;
	this.overview = overview;
	this.price = price;
}





public Books(int bookISBN, String title, float price) {
	this.bookISBN = bookISBN;
	this.title = title;
	this.price = price;
}
public int getBookISBN() {
	return bookISBN;
}
public String getTitle() {
		return title;
	}

public String getAuthor() {
		return author;
	}

public String getOverview() {
		return overview;
	}



public float getPrice() {
	return price;
}

@Override
public String toString() {
	return "Books [bookISBN=" + bookISBN + ", title=" + title + ", author=" + author + ", overview=" + overview
			+ ", price=" + price + "]";
}




	
	

	
}
