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
import com.ab.utilities.DatabaseConnection;



public class BasketDatabaseDAOImpl implements BasketDAO {
	
	private Connection con;

	private PreparedStatement pst;
	
	private ResultSet rs;
	
	public boolean addBasket(Basket b){
		
		boolean f = false;
		 
		 con = DatabaseConnection.getConnection();
		 
		String query = "INSERT INTO Basket(book_ISBN,quantity, price, total) VALUES(?,?,?,?)";
		
		try {
			pst = con.prepareStatement(query);
			pst.setInt(1, b.getBookISBN());
			
			pst.setInt(2, b.getQuantity());
			pst.setFloat(3, b.getPrice());
			pst.setDouble(4, b.getTotal());
			rs = pst.executeQuery();
           
			int i = pst.executeUpdate();
			if(i==1) {
				f= true;
			}
		}
		catch (SQLException e){
			
			System.out.println(e);
		}
		return f;
	}

	@Override
	public boolean addBasket(int bookISBN, int quantity, float price, double total) {
		// TODO Auto-generated method stub
		return false;
	}
}
