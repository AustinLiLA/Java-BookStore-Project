package com.ab.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.Cookie;

import com.ab.factories.BMSFactory;
import com.ab.models.Basket;
import com.ab.models.Books;
import com.ab.utilities.DatabaseConnection;

public class BookDatabaseDAOImpl implements BookDAO{

	private Connection con;
	
    private PreparedStatement pst;
	
  
	private ResultSet rs;
	

	
	@Override
	public List<Books> loadBooks() {
		
		con = DatabaseConnection.getConnection();
		
		String query = "SELECT * FROM books";
		
		try {
			
		pst = con.prepareStatement(query);
		
		rs = pst.executeQuery();
		
		List<Books> bList = new ArrayList<>();
		
		/*int i = pst.executeUpdate();
		
		if(i>0) {
    		return loadBooks();
    		
    	} */
		
		while(rs.next()) {
			
			Books b = BMSFactory.getBooks(rs.getInt("book_ISBN"), rs.getString("title"), rs.getString("author"), rs.getString("overview"), rs.getFloat("price"));
			
			bList.add(b);
			
			
			
		}
			
			return bList;
			
			
			
		}
		
		catch(SQLException e) {
			
			System.out.println(e);
			
			
		}
		
          return null;	
		
		
	}

	@Override
	public List<Books> searchBooks(int bookISBN, String author) {
		con = DatabaseConnection.getConnection();
		
	  
		String searchbookresult = null;
		
		String query = "SELECT * FROM books WHERE book_ISBN= ? or author = ? ";
		
		
		
		try {
			pst = con.prepareStatement(query);
			pst.setInt(1, bookISBN);
			
			pst.setString(2, author);
			rs = pst.executeQuery();
			List<Books> searchbList = new ArrayList<>();
		
        if(rs.next()) {
			
			Books b1 = BMSFactory.getBooks(rs.getInt("book_ISBN"), rs.getString("title"), rs.getString("author"), rs.getString("overview"), rs.getFloat("price"));
			
			searchbList.add(b1);
			
			searchbookresult = "success";
			 
			return searchbList;
		}
        else{
        	
        	searchbookresult = "failure";
        	
        }
       
		}
			
		catch(SQLException e){
			
			System.out.println(e);
			
		}
		
		return null;
	}

	@Override
	public List<Books> AddBooks(int bookISBN, String title, float price) {
		
		String query = "SELECT book_ISBN, title, price FROM books ";
        con = DatabaseConnection.getConnection();
	
		
		try {
			
		pst = con.prepareStatement(query);
		
		rs = pst.executeQuery();
		
		List<Books> aList = new ArrayList<>();
		
		
		while(rs.next()) {
			
			Books a = BMSFactory.getcustomBooks(rs.getInt("book_ISBN"), rs.getString("title"), rs.getFloat("Price"));
			
			aList.add(a);
			
			
			
		}
			
			return aList;
			
		}
		catch (SQLException e) {
	    
			System.out.println(e);
			
		}
	   return null;
	
}

	/*@Override
	public List<Books> ViewBasket() {
		int added_basket_books = 0;
		
		Cookie c = null;
        con = DatabaseConnection.getConnection();
        try {
        	
        	
        }
	*/

	/*@Override
	public List<Basket> AddProcess(int bookISBN,int quantity, float price,double total) {
    
       int item = 0; 
       int book_price = 0;
       int item_total = 0; 
		
       List<Basket> AList = new ArrayList<>();
		String query = "SELECT * from books where book_ISBN = ' "+bookISBN + " ' ";
		String query1 = "SELECT * from basket where book_ISBN ='"+bookISBN+" ' " ;
        con = DatabaseConnection.getConnection();
	
        try {
    		pst = con.prepareStatement(query);
    		
    		
    		rs = pst.executeQuery();
    		
    		while(rs.next()){ 
    			
    				book_price = rs.getInt(3);
    				
    				item_total = book_price; 
    		}
    		pst1 = con.prepareStatement(query1);
    	    rs1 = pst.executeQuery();
    	    while(rs1.next()) {
    	    	
    	    	total = rs1.getInt(4);
    	    	total = total + item_total;
    	    	quantity = rs1.getInt(3);
    	    	quantity = quantity +1;
    	    	item = 1;
    	    }
    	    if (item==1) {
    	    	pst.executeUpdate("update basket set total='"+total+"',quantity='"+quantity+"' where book_ISBN='"+bookISBN+"'");
    	    }
    	    if (item==0) {
    	    	
    	    	PreparedStatement pst2 = con.prepareStatement("insert into basket(book_ISBN,quantity,price,total) values(?,?,?,?)");
    	    	pst2.setInt(1, bookISBN);
    	    	pst2.setInt(2, quantity);
    	    	pst2.setFloat(3, price);
    	    	pst2.setDouble(4, total);
    	    	pst2.executeUpdate();
    	    	
    	    }
    		}
    		catch(SQLException e) {
    			
    			System.out.println(e);
    		}
    		
    		return null;
    	} */

	@Override
	public List<Basket> AddProcess(){
		 
		 boolean addbook = false ;
		 List<Basket> AList = new ArrayList<>();
		 con = DatabaseConnection.getConnection();
		 
		String query = "INSERT INTO Basket(book_ISBN,quantity, price, total) VALUES(?,?,?,?)";
		
		try {
			pst = con.prepareStatement(query);
			
			rs = pst.executeQuery();
            Basket A = BMSFactory.AddProcess(rs.getInt("book_ISBN"), rs.getInt("quantity"), rs.getFloat("price"), rs.getDouble("total"));
			
			AList.add(A);
		}
		catch (SQLException e){
			
			System.out.println(e);
		}
		return null;
	}
		
	
	@Override
	public List<Basket> ViewBasket() {
		
			
		return null;
	}
	
}
