
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.ab.models.Basket"%>
<%@page import="com.ab.models.Books"%>
 <%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Shopping Basket Page</title>
</head>
<body>


 <% List<Books> Addedbooks = (List<Books>) session.getAttribute("AList");


 %>
 
<table cellpadding="2", cellspacing="2", border="1">
      <tr>
           <th>ISBN</th>
            <th>title</th>
           <th>Price</th>
           <th>Quantity</th>
           <th>Sub Total</th>
           <th>Option</th>
      </tr>
       <c:forEach items="${AList}" var="A">
        <tr>
        
          
           <td>${A.bookISBN} </td>
           <td>${A.title} </td>
           <td>${A.price} </td>
           <td>${A.quantity} </td>
           <td>${A.price * quantity}</td>
            <td align="center">Remove </td>
        </tr>
       
       </c:forEach>
       </table>
       
       <a href= "Addform.jsp">Continue Shopping</a>
       
</body>
</html>