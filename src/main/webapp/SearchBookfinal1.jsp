<%@page import="java.util.List"%>
<%@page import="com.ab.models.Books"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Search Result Pages</title>
</head>
<body>
      <h2> Search result</h2>
 <% 
    
      
      List<Books> searchList = (List<Books>)session.getAttribute("sList");
      

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
        for(Books b: searchList){
        
        %>
         <tr>
         
             <td> <%=b.getBookISBN() %> </td>
             <td> <%=b.getTitle() %> </td>
             <td> <%=b.getAuthor() %> </td>
             <td> <%=b.getOverview() %> </td>
             <td> <%=b.getPrice() %> </td>
          </tr>
       <%
        }
       %>
       </table>
       
            <br>
     <br>
     <br>
         <a href="bookmenu1.jsp">Go back to Menu</a>
</body>
</html>