<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style type="text/css">
body {
   text-align:center;
  
}
body.ul
{
 align:center;
}
 div {
  border-radius: 5px;
  background-color: #F0F8FF;
  padding: 20px;
  height: auto;
}
</style>
<title>Flight Details</title>
</head>
<%@include file="header.html" %>
<body>

<% String fm= request.getParameter("flightModel");
String al=request.getParameter("airlines");
String from = request.getParameter("source");
String to = request.getParameter("desti");
String time = request.getParameter("duration");
String price = request.getParameter("tktprice");
String date = request.getParameter("date");
String num = request.getParameter("num");
String id = request.getParameter("id");


%>


<h1>Flight Details</h1>
<div align="center">

<p><b>Flight Model: </b>
<%= fm %>
</p>
<p><b>Airlines: </b>
<%= al %>
</p>
<p><b>From: </b>
<%= from %>
</p>
<p><b>To: </b>
<%= to %>
</p>
<p><b>Duration: </b>
<%= time %>
</p>
<p><b>Ticket Price: </b>
$<%= price%>.00
</p>
<p><b>Total number of travelers: </b>
<%= num %>
</p>
<p><b>Date of Travel: </b>
<%= date %>
</p>



<br>


<a href="register.jsp?fm=<%=fm%>&al=<%=al%>&from=<%=from%>&to=<%=to%>&time=<%=time%>&price=<%=price%>&date=<%=date%>&num=<%=num%>&id=<%=id%>"><button style="background-color: #62529c;
        border: none;
        color: #fff;
        padding: 15px 30px;
        text-decoration: none;
        margin: 4px 2px;
        cursor: pointer;">CONTINUE TO CHECKOUT</button></a>

</div>
</body>

</html>