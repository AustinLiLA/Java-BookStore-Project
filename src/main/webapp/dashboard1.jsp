<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
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
<head>
<meta charset="UTF-8">
<title>Dashboard</title>
</head>
<body>


      <center>
       <h1>Welcome to our application</h1>
       
      </center>
     
    <ol class="center">
     <li><a href="http://localhost:8080/bookstore-management-system/LoadBooksServlet"> List all books</a></li>
     <li><a href="SearchBookForm2.jsp">Search Books</a></li>
     <li><a href="">Add Book to shopping basket</a></li>
     <li><a href="">Check order History</a></li>
     <li><a href="http://localhost:8080/bookstore-management-system/UserViewDetailServlet">Accounting Details</a></li>

    </ol> 
<br> 
<br>
<br>
<a href="login.jsp">Click here to logout</a>

</body>
</html>