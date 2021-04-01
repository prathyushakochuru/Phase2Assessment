<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style>
input[type=text], select {
  
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}
body {
   text-align:center;
  
}
      input[type=button],
      input[type=submit] {
        background-color: #62529c;
        border: none;
        color: #fff;
        padding: 15px 30px;
        text-decoration: none;
        margin: 4px 2px;
        cursor: pointer;
      }
      div {
  border-radius: 5px;
  background-color: #F0F8FF;
  padding: 20px;
}
    </style>
<title>Register Flight</title>
</head>

<body>
<%@include file="header.html" %>
<% String fm= request.getParameter("fm");
String al=request.getParameter("al");
String from = request.getParameter("from");
String to = request.getParameter("to");
String time = request.getParameter("time");

String date = request.getParameter("date");

int price = Integer.parseInt(request.getParameter("price").trim());
int num = Integer.parseInt(request.getParameter("num").trim());
String id = request.getParameter("id");

int totalcost = 0;
if(num>1){
	totalcost = price * num;
}
else
{
	totalcost = price;
}
%>

<h1 style="text-align:center">Passenger Details</h1>
<div align="center">

<form action="checkout.jsp" method="post">
<strong>First Name: </strong>
<Input type="text" placeholder="First name" name="firstname" required>
&nbsp; &nbsp;
<strong>Last Name: </strong>
<Input type="text" placeholder="Last name" name="lastname" required>
<br><br>
<strong>Date of birth: </strong>
<Input type="date"  name="dob" required>
&nbsp; &nbsp;
<strong>Gender: </strong>
<select name = "gender">
<option value="default">Choose Gender</option>
<option value="Female">Female</option>
<option value="Male">Male</option>
</select>

<br><br>
<strong>Address: </strong>
<Input type="text" placeholder="Address" name="addr" required>
&nbsp; &nbsp;
<strong>Contact Number: </strong>
<Input type="text" placeholder="Contact number" name="contact" required>
&nbsp; &nbsp;
<strong>Email Id: </strong>
<Input type="text" placeholder="Email" name="email" required>
<br><br>
<strong>Flight Number: </strong>
<Input type="text" name="model" value = "<%=fm %>" readonly>
&nbsp; &nbsp;
<strong>Airlines: </strong>
<Input type="text" name="airlines" value = "<%=al %>" readonly>
<br><br>
<strong>From: </strong>
<Input type="text" name="from" value = "<%=from %>" readonly>
&nbsp; &nbsp;
<strong>To: </strong>
<Input type="text" name="to" value = "<%=to %>" readonly>
&nbsp; &nbsp;
<strong>Date of Travel: </strong>
<Input type="text" name="dot" value = "<%=date %>" readonly>
<br><br>
<strong>Total Price: </strong> ($<%= price%>.00 X <%= num%>)

<Input type="text" name="tktprice" value = "$<%= totalcost%>.00" readonly> 

<input type="hidden" name="flightid" value=<%=id%>>
<br><br>
<input type="submit" value = "CHECK OUT">
</form>

</div>
</body>
</html>