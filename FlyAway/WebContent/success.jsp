<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style>
div {
	  border-radius: 5px;
background-color: #F0F8FF;
padding: 20px;
height: auto;
}
body {
   text-align:center;
  
}
#ref
{
color: green;
}
</style>
<title>Payment succeeded</title>
</head>
<body>
<%@include file="header.html" %>
<div align="center">

<h2>Thank you for your payment!</h2><br>

<h3>Your booking reference number : </h3>
<h3 id="ref"> <%=request.getAttribute("refno")%> </h3><br>
<h4>We have sent you the booking reference number to your email.</h4>

<br><br><br>
</div>

</body>
</html>