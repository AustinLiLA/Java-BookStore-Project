package com.ab.daos;

import java.awt.print.Book;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ab.factories.BMSFactory;
import com.ab.models.Basket;
import com.ab.models.Books;
import com.ab.utilities.DatabaseConnection;



public class BasketDatabaseDAOImpl implements BasketDAO {
	
	private Connection con;

	private PreparedStatement pst;
	
	private PreparedStatement pst2;
	
	private PreparedStatement pst3;
	
	private ResultSet rs1;
	
	private ResultSet rs2;
	

	@Override
	public List<Books> AddToBasket(int bookISBN,String title, float price, int quantity){
		
		
		List<Books> bookInfo = new ArrayList<>();
		
		 
		 con = DatabaseConnection.getConnection();
		 
		String query = "select title, price from Books where book_ISBN = ?";
		
		
		try {
			
			//Get the information of selected book
			
			pst = con.prepareStatement(query);
			
			
		    pst.setInt(1, bookISBN);
		    
		    //get the quantity of selected book 
		    
		    pst2 = con.prepareStatement("select quantity from Books where book_ISBN=?");
		    
		    //Update quantity 
		    
		    pst3 = con.prepareStatement("update Books set quantity = quanity-1 where book_ISBN=?");
		    
		    rs1 = pst.executeQuery();
		    
		    rs2 = pst2.executeQuery();
		    
		    while (rs1.next()) {
		    	
		    	title = rs1.getString("title");
		    	
		    	price = rs1.getFloat("price");
		    
			};
			while (rs2.next()) {
				
				quantity = rs2.getInt("quantity");
			}
			if(quantity > 0) {
				
				Books b2 = BMSFactory.getBooks2(rs1.getString("title"),rs1.getFloat("price"));
				
                bookInfo.add(b2);
                
				pst3.execute();
				
				return bookInfo;
			}
			
		}
		catch (SQLException e){
			
			System.out.println(e);
		}
		return null;
	}





	}

