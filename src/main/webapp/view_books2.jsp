<%@page import="java.util.List"%>
<%@page import="com.ab.models.Books"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Unregister User Page</title>
</head>
<body>
           <h1> List of the books </h1>
 <% 
    
      
      List<Books> bookList = (List<Books>)session.getAttribute("bList");
      

      %>
      <table border="1">
      
           <tr>
           
             <th> ISBN </th>
             <th> Title </th>
             <th> Author </th>
             <th> Overview </th>
             <th> Price </th>
      
            </tr>
            
       <%
        for(Books b: bookList){
        
        %>
         <tr>
         
             <td> <%=b.getBookISBN() %> </td>
             <td> <%=b.getTitle() %> </td>
             <td> <%=b.getAuthor() %> </td>
             <td> <%=b.getOverview() %> </td>
             <td> <%=b.getPrice() %> </td>
          </tr>
       <%
         
           }//End of for loop
       %> 
       </table>
       <br>
       <br>
       <br>
        <a href="bookmenu1.jsp">Back to the menu</a>
</body>
</html>