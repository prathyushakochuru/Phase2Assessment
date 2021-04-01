package com.pkochuru.flyawaypkg;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Checkout
 */
@WebServlet("/checkout")
public class Checkout extends HttpServlet {
	
	String strsql;
	Connection dbCon;
	Statement statement;
	//define the db string connection
	
			String strconn = "jdbc:mysql://localhost:3306/flyaway?serverTimezone=UTC";
			
			//define the username
			String dbusername = "root";
			
			//define password
			String dbPwd = "";
			
			//define the driver and load
			String mySQLDriver = "com.mysql.jdbc.Driver";
			
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fname = request.getParameter("firstname");
		String lname = request.getParameter("lastname");
		String dob = request.getParameter("dob");
		String gender = request.getParameter("gender");
		String address = request.getParameter("addr");
		String contact = request.getParameter("contact");
		String emailid = request.getParameter("email");
		String flightmodel = request.getParameter("model");
		String airlines = request.getParameter("airlines");
		String source = request.getParameter("from");
		String destination = request.getParameter("to");
		String date = request.getParameter("dot");
		String tktprice = request.getParameter("tktprice");
		String flightid = request.getParameter("flightid");
		
		
	}

}
