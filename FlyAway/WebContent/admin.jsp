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
		out.println("Welcome, " + session.getAttribute("uName") + "! You are logged in now");
	}
	%>
<br>
<br>
<a href ="changepwd.jsp" >Change Password?</a>

<br>
<br>
<a href ="logout" >Log out</a>
</body>
</html>