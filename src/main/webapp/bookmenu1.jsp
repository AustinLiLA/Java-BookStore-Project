<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<style type="text/css">
.center{
text-align: center;
list-style-position: inside;
}
ol{

font-size:160%;

}
ol.center li{

text-align: left;
margin-left: 40%
}
</style>
<meta charset="UTF-8">

<title>Unregistered user Book menu</title>
</head>
<body>

   <center>
           <h1>BookStore Application</h1>
           <h2>Menu</h2>

   </center>
     
    <ol class="center">
     <li><a href="http://localhost:8080/bookstore-management-system/LoadBooksServlet2"> List all books</a></li>
     <li><a href="SearchBookForm.jsp">Search Books</a></li>
     <li><a href="http://localhost:8080/bookstore-management-system/AddBookServlet">Add Book to shopping basket</a></li>
    </ol> 
   
    <br>
    <br>
    <br>
     <a href="index.jsp">Click here to register</a>
    
</body>
</html>