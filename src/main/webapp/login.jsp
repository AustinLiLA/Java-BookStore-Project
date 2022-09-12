<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Form</title>
</head>
<body>

     <form action="http://localhost:8080/bookstore-management-system/UserLoginServlet" method="POST">
	

     Email ID : <input type="text" name="userEmail" /> <br>
     
     Password : <input type="password" name="userPassword"/> <br>
     
     <input type="submit" value="Login"/> 



     </form>
     
     New Customer? <a href="index.jsp">Click here to register</a>
     <br>
     <br>
     Do not want to register?<a href="bookmenu1.jsp">Click here to browse the content</a>
</body>
</html>