<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
/* Check whether user is not logged in */
if(session.getAttribute("uName") == null){
	/* Redirect to the login  */
	response.sendRedirect("index.jsp");
}
	else{
		out.println("Hello, " + session.getAttribute("uName") + "! Please change your password below.");
	}
	%>


<form action="savepwd" method="get" style="text-align:center">

<h3>Enter new password: </h3>
<input type="password" placeholder = "Your Password" name = "newpassword">
<br>
<input type="submit" value = "SAVE">
</form>
</body>
</html>