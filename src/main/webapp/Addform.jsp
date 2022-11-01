<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@page import="com.ab.models.Books"%> 
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add book form</title>
</head>
<body>

<form action="http://localhost:8080/bookstore-management-system/AddBookServlet" method="GET">
<h1> Please choose book to add </h1>




           <h1> List of the books </h1>
 <% 
    
      
      List<Books> bookList = (List<Books>)session.getAttribute("aList");
      

      %>
      
     <table border="1">
      
             <tr>
           
             <th> ISBN </th>
             <th> Title </th>
             <th> Price </th>
             <th> Actions </th>
             </tr>
	
	   <c:forEach items="${aList}" var="a">
        <tr>
          <td><c:out value="${a.bookISBN}" /></td>
          <td><c:out value="${a.title}" /></td>
           <td><c:out value="${a.price}" /></td>
          <td>
          <a href="http://localhost:8080/bookstore-management-system/AddtoBasketServlet?bookISBN=<c:out value="${a.bookISBN}" />&title=<c:out value="${a.title}" />&price=<c:out value="${a.price}" />">Add</a>
          </td>
        </tr>
      </c:forEach>
	  </table>
      

     </form>
     <br>
     <br>
     <br>
         <a href="bookmenu1.jsp">Go back </a>
      
   
            
</body>
</html>



