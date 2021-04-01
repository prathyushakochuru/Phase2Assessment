package com.pkochuru.flyawaypkg;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Connection;

/**
 * Servlet implementation class HomeServlet
 */
@WebServlet("/home")
public class HomeServlet extends HttpServlet {
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
			
			String strheaders = "<tr><th>FlightID</th><th>FlightModel</th><th>Airlines</th><th>Source</th><th>Destination</th><th>Duration</th><th>TicketPrice</th><tr>";
			

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String source = request.getParameter("lblsource");
		String destination = request.getParameter("lbldest");
		String dateTravel = request.getParameter("dot");
		Integer noTravelers = Integer.parseInt(request.getParameter("noTravelers"));
		
		HttpSession session = request.getSession();
		
		session.setAttribute("numTravel", noTravelers);
		session.setAttribute("date", dateTravel);
		
		strsql = "SELECT * FROM flyaway.tblFlights WHERE Source = '"
    			+ source.trim() + "' AND Destination = '" + destination.trim() + "'";
		
		PrintWriter out = response.getWriter();  
		response.setContentType("text/html");  
        out.println("<html>"+getStyle()+"<body style=\"background-color:#F0F8FF;text-align:center;\"> <img src=\"logo.png\"\n"
        		+ "     alt=\"logo\" width=\"auto\" height=\"auto\">");  
        
        try {
    		
    		Class.forName(mySQLDriver);
			//establish the MySql connection 
			dbCon = DriverManager.getConnection(strconn, dbusername, dbPwd);
			
			//get a reference to the statement
			statement = dbCon.createStatement();
			ResultSet result = statement.executeQuery(strsql);
			
			//RequestDispatcher disp = request.getRequestDispatcher("results");
			
			
			
			out.println("<br><h1>Flights found   </h1><a href=\"index.jsp\"><button>Modify the Search</button></a><br><table id=\"customers\"border=1 width=50% height=50%>");  
            out.println(strheaders);
			
			while(result.next())
			{
				String FlightID = result.getString("FlightID");
				String FlightModel = result.getString("FlightModel");
				String Airlines = result.getString("Airlines");
				String Source = result.getString("Source");
				String Destination = result.getString("Destination");
				String Duration = result.getString("Duration");
				String TicketPrice = result.getString("TicketPrice");
				out.println("<tr><td>" + FlightID + "</td><td>" + FlightModel + "</td><td>" + Airlines + "</td><td>" + Source+ "</td><td>"
						+ Destination + "</td><td>" + Duration + "</td><td>" +TicketPrice + "</td><td><a href='flightdetails.jsp?flightModel="+FlightModel+ "&"
								+ "airlines="+ Airlines +"&source="+Source+"&desti="+Destination+"&duration="+Duration+"&tktprice="+TicketPrice + ""
										+ "&date="+dateTravel+"&num="+noTravelers+"&id="+FlightID+"'>Select</a></td></tr>");
			}
			
			out.println("</table>"); 
			
            out.println("</html></body>");  
            
            
            dbCon.close(); 
            
            //disp.include(request, response);
		} 
        catch (SQLException | ClassNotFoundException e) {
			
			System.out.println("Can'r load records - " + e.getMessage());
		}
		
		
		
	}
	
	public String getStyle()
	{
		String strStyle = "<style>"
				+ "#customers {"
				+ "  font-family: Arial, Helvetica, sans-serif;"
				+ "  border-collapse: collapse;"
				+ "  width: 100%;"
				+ "}"
				
				+ "#customers td, #customers th {"
				+ "  border: 1px solid #ddd;"
				+ "  padding: 8px;"
				+ "}"
				
				+ "#customers tr:nth-child(even){background-color: #f2f2f2;}"
				
				+ "#customers tr:hover {background-color: #ddd;}"
			
				+ "#customers th "
				+ "  padding-top: 12px;"
				+ "  padding-bottom: 12px;"
				+ "  text-align: left;\n"
				+ "  background-color: green;"
				+ "  color: white;"
				+ "}"
				+ "button {"
				+ "background-color: #62529c;\n"
				+ "        border: none;\n"
				+ "        color: #fff;\n"
				+ "        padding: 5px 15px;\n"
				+ "        text-decoration: none;\n"
				+ "        margin: 4px 2px;\n"
				+ "        cursor: pointer;"
				+ "}"
				+ "</style>";
		
		return strStyle;
	}


	

}
