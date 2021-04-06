<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin preferences</title>
</head>
<body>
<% 
/* Check whether user is not logged in */
if(session.getAttribute("uName") == null){
	/* Redirect to the login  */
	response.sendRedirect("index.jsp");
}
	else{
		out.println("<h2 style=\"text-align:center\">Welcome, " + session.getAttribute("uName") + "! You are logged in now</h3>");
	}
	%>
<br>
<br>
<a href ="changepwd.jsp" style="text-align:center" ><strong>Change Password?</strong></a>
<br>
<a href ="logout" style="text-align:center" ><strong>Log out</strong></a>
<div align="center">
<form action="addflight" method ="get">
<h2>Add flight:</h2>
<h3>FlightModel: </h3>
<input type="text" placeholder = "Flight Model" name = "fmodel"><br>
<h3>Source: </h3>
<input type="text" placeholder = "Source" name = "from">
<br>
<h3>Destination: </h3>
<input type="text" placeholder = "Destination" name = "to">
<br>
<h3>Airlines: </h3>
<input type="text" placeholder = "Airlines" name = "airlines">
<br>
<h3>Duration: </h3>
<input type="text" placeholder = "Duration" name = "time">
<br>
<h3>TicketPrice: </h3>
<input type="text" placeholder = "Ticket Price" name = "tktprice">
<br>
<input type="submit" value = "ADD FLIGHT">


</form>
</div>

<br>
</body>
</html>