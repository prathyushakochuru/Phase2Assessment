<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style type="text/css">
body {
   text-align:center;
  
}</style>
<title>Insert title here</title>
</head>

<br>
<body>
<%@include file="header.html" %>
<%
if(session.getAttribute("uName") !=null)
{
	response.sendRedirect("admin.jsp");
}
%>


<form action="authenticate" method="get">
<h2>Please login</h2>
<h3>Username: </h3>
<input type="text" placeholder = "Your Name" name = "username"><br>
<h3>Password: </h3>
<input type="password" placeholder = "Your Password" name = "password">
<br>
<input type="submit" value = "LOGIN">
</form>
</body>
</html>