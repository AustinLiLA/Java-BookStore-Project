<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Page</title>
</head>
<body>

    <h1> Registration Form</h1>
    
    <form action="http://localhost:8080/bookstore-management-system/UserRegistrationServlet" method ="POST">
        
      Name: <input type="text" name="userName"/> <br>
      
      Email: <input type="text" name="userEmail"/> <br>
      
      password:<input type="password" name="userPassword" /> <br> 
        
      <input type="submit" value="Register"/> 
      
      
      
      </form>
      
      Registered Customer? <a href="login.jsp"> Click here to login</a>
      
</body>
</html>