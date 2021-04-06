
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="com.pkochuru.flyawaypkg.HomeServlet" %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style>
img {
  display: block;
  margin-left: auto;
  margin-right: auto;
}
form { 
margin: 0 auto; 
width:800px;
}

      input[type=submit] {
        background-color: #62529c;
        border: none;
        color: #fff;
        padding: 5px 15px;
        text-decoration: none;
        margin: 4px 2px;
        cursor: pointer;
      }
      button
      {
      background-color: #62529c;
        border: none;
        color: #fff;
        padding: 5px 15px;
        text-decoration: none;
        margin: 4px 2px;
        cursor: pointer;
      }
</style>
<title>FlyAway</title>
</head>

<body style="background-color:#F0F8FF">
<%@include file="header.html" %>

<img src="Travel5.jpeg"
     alt="flight" width="800" height="200">
 
<div align="center">
<form action="home" method="get">
<h2 style="text-align:center">Search for the flights</h2>
<label ><strong> Select Source: </strong></label>  
<select name="lblsource">  
<option value = "default"> -------- 
</option> 
<option value = "Newark, NJ, USA"> Newark, NJ, USA   
</option>  
<option value = "Chicago, IL, USA"> Chicago, IL, USA   
</option>  
<option value = "Washington DC, USA"> Washington DC, USA  
</option>  
<option value = "NewYork, NY, USA"> NewYork, NY, USA  
</option>  
</select>  
&nbsp; &nbsp;
<label><strong>Select Destination: </strong></label>  
<select name="lbldest">
<option value = "default"> --------
</option>   
<option value = "Hyderabad, TG, India"> Hyderabad, TG, India   
</option>  
<option value = "Chennai, TN, USA"> Chennai, TN, USA   
</option>  
<option value = "Bangalore, KA, India"> Bangalore, KA, India  
</option>  
<option value = "NewYork, NY, USA"> NewYork, NY, USA  
</option>  
</select>
<br><br>
<strong>Date of Travel: </strong><input type = "date" name="dot"> 
&nbsp; &nbsp;
<strong>No. of Travelers: </strong>
<input type="text"  name = "noTravelers">
<br><br><br>
<input style="align:center"type="submit" value = "GO">


</form>
  </div>   
</body>
</html>