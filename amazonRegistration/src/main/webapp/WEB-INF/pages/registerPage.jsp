<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> Amazon Registration</title>
</head>
<body bgcolor="green">

<h1 id = "heading" >RegistrationForm</h1>
<h1>${OTPmessageSucess}</h1>
<div align="center">
<form action ="onRegister.do">
   <pre>
     <label>Enter the  UserName</label>
     <input type="text" name="userName">
     <label>Enter the Email</label>
     <input type="email" name="email">
     <label>Enter the Password</label>
     <input type="password" name="password">
      <label>Enter the PhoneNo</label>
     <input type="text" name="phoneNo">
      <label>Enter the Age</label>
     <input type="text" name="age">
      <label>Enter the Address</label>
     <input type="text" name="address">
      
     
     
     
     <input type="submit" value="Register">
     </pre>
     </form>
     <div>
</body>
</html>