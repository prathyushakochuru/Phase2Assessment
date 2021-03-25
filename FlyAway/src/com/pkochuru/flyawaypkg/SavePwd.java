package com.pkochuru.flyawaypkg;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SavePwd
 */
@WebServlet("/savepwd")
public class SavePwd extends HttpServlet {
	
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
		response.setContentType("text/html"); 
		String pwd = request.getParameter("newpassword").trim();
		
		HttpSession session = request.getSession();
		PrintWriter out = response.getWriter(); 
		
		String struser = (String) session.getAttribute("uName");
		
		strsql = "Update tblLogin SET Password = '" + pwd + "' where UserName = '" + struser + "'";
		try {
    		
    		Class.forName(mySQLDriver);
			//establish the MySql connection 
			dbCon = DriverManager.getConnection(strconn, dbusername, dbPwd);
			
			//get a reference to the statement
			statement = dbCon.createStatement();
			
			if(statement.executeUpdate(strsql) > 0)
			{
				out.println("<h2>Updated Successfully</h2>");
			}
			
		}
		catch (SQLException | ClassNotFoundException e) {
			
			out.println("Can't update your pasword - " + e.getMessage());
		}
		

	}

}
