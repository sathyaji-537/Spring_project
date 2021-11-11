<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
<h1>${OtpSuccessMessage}</h1>
<form action="verifyOTP.do">
 <pre>
     <label>Enter the  OTP</label>
     <input type="number" name="otp">
      <input type="submit" value="verifyOtp">
     
   </pre>
   </form>
</div>
</body>
</html>