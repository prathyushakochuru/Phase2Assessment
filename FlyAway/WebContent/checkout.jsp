<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style>
input[type=text], input[type=tel], select {
  
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
  width: 100px;
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
      body {
   text-align:center;
  
}
      div {
  border-radius: 5px;
  background-color: #F0F8FF;
  padding: 20px;
}
    </style>
<title>Checkout page</title>
</head>
<body>
<%@include file="header.html" %>
<%
String fname = request.getParameter("firstname");
String lname = request.getParameter("lastname");
String dob = request.getParameter("dob");
String gender = request.getParameter("gender");
String address = request.getParameter("addr");
String contact = request.getParameter("contact");
String emailid = request.getParameter("email");
String flightmodel = request.getParameter("model");
String airlines = request.getParameter("airlines");
//String source = request.getParameter("from");
//String destination = request.getParameter("to");
String date = request.getParameter("dot");
String tktprice = request.getParameter("tktprice");
String flightid = request.getParameter("flightid");

%>

<h1 style="text-align:center">Pay here</h1>
<div align="center">
<form action="pay" method="post">
<input type="hidden" name="fname" value = "<%=fname%>">
<input type="hidden" name="lname" value = "<%=lname%>">
<input type="hidden" name="dob" value = "<%=dob%>">
<input type="hidden" name="gender" value = "<%=gender%>">
<input type="hidden" name="address" value = "<%=address%>">
<input type="hidden" name="contact" value = "<%=contact%>">

<input type="hidden" name="dot" value = "<%=date%>">
<input type="hidden" name="flightid" value = "<%=flightid%>">
<br>
<h3>Your total ticket price : </h3><input type="text" value="<%=tktprice%>" name="price" readonly>
<br>
<label><strong>Email Id: </strong></label>
<input type="text" style="width:250px" name="email" value="<%=emailid%>" readonly>
<br>
<label for="ccn"><strong>Credit Card Number: </strong></label>
<input id="ccn" type="tel" inputmode="numeric" name="cardno" 
pattern="[0-9\s]{13,19}" autocomplete="cc-number" maxlength="19" placeholder="xxxx xxxx xxxx xxxx" style="width:170px">
<br>
<label for="cvc"><strong>CVC: </strong></label>
<input id="cvc" type="text" name="cvcno" placeholder="CVC">
<br>
<label><strong>Expiration Date: </strong></label>
<input type="text" name="expdate" placeholder="Exp date">
<br>
<label><strong>ZipCode: </strong></label>
<input type="text" name="zipcode" placeholder="Zipcode">
<br>
<br>
<input type="submit" value="Pay">
</form>

</div>
</body>
</html>