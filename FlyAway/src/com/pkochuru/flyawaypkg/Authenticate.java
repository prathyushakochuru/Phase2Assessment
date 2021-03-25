package com.pkochuru.flyawaypkg;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Authenticate
 */
@WebServlet("/authenticate")
public class Authenticate extends HttpServlet {
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
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("username");
		String pwd = request.getParameter("password");
		
		HttpSession session = request.getSession();
		PrintWriter out = response.getWriter(); 
		
		strsql = "SELECT * FROM flyaway.tblLogin WHERE UserName = '"+name+ "'";
		
		try {
    		
    		Class.forName(mySQLDriver);
			//establish the MySql connection 
			dbCon = DriverManager.getConnection(strconn, dbusername, dbPwd);
			
			//get a reference to the statement
			statement = dbCon.createStatement();
			ResultSet result = statement.executeQuery(strsql);
			
			while(result.next())
			{
				String strName = result.getString("UserName");
				
				String strPwd = result.getString("Password");
				
				if(strName.equals(name) &&  strPwd.equals(pwd) && name !=null)
				{
					session.setAttribute("uName", name);
					response.sendRedirect("admin.jsp");
				}
				
				
				else
				{
					response.sendRedirect("index.html");
					//RequestDispatcher disp = request.getRequestDispatcher("index.jsp");
					//out.println("Please login with Admin credentials!");
					//disp.include(request, response);
				}
			}
		

		}
		catch (SQLException | ClassNotFoundException e) {
			
			System.out.println("Can'r load records - " + e.getMessage());
		}
	

	}

}
