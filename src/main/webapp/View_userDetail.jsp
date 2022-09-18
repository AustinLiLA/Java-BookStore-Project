<%@page import="java.util.List"%>
<%@page import="com.ab.models.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Here is your detail</title>
</head>
<body>

  <% 
 
   List<User> viewDetail = (List<User>)session.getAttribute("Detail");
      

      %>
 <table border="1">
	
		<tr>
		
			<th> User Id</th>
			<th> User Name </th>
			<th> User Email</th>
			<th> User Password </th>
			
		</tr>

            
       <%
        for(User u: viewDetail){
        
        %>
         <tr>
         
             <td> <%=u.getUserId() %> </td>
             <td> <%=u.getUserName() %> </td>
             <td> <%=u.getUserEmail() %> </td>
             <td> <%=u.getUserPassword() %> </td>
         
          </tr>
       <%
         
           }//End of for loop
       %> 
         <a href="dashboard1.jsp">Go back </a>
</body>
</html>