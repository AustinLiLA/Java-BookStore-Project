<%@page import="java.util.List"%>
<%@page import="com.ab.models.Books"%>
 <%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List of Books</title>
</head>
<body>


      <h1> List of Books </h1>


      
      
  
      
      <table border="1">
	
		<tr>
		
			<th> Book ISBN </th>
			<th> Title </th>
			<th> Author </th>
			<th> Overview </th>
			<th> Price</th>
		</tr>
	
	<c:forEach items="${bList}" var="b">
        <tr>
          <td><c:out value="${b.bookISBN}" /></td>
          <td><c:out value="${b.title}" /></td>
          <td><c:out value="${b.author}" /></td>
          <td><c:out value="${b.overview}" /></td>
          <td><c:out value="${b.price}" /></td>
        </tr>
      </c:forEach>
	
      
     </table>
     <br>
     <br>
     <br>
         <a href="dashboard1.jsp">Go back </a>
      
     
      


</body>
</html>