package com.pkochuru.flyawaypkg;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Servlet implementation class AddFlight
 */
@WebServlet("/addflight")
public class AddFlight extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fmodel= request.getParameter("fmodel");
		String from=request.getParameter("from");
		String to = request.getParameter("to");
		String airlines = request.getParameter("airlines");
		String duration = request.getParameter("time");
		String tktprice = request.getParameter("tktprice");
		
		PrintWriter out = response.getWriter();  
		response.setContentType("text/html");
		
		SessionFactory theFactory = new Configuration().configure("hibernate-config.xml").addAnnotatedClass(tblFlights.class).buildSessionFactory();
		try
		{	
			Session theSession = theFactory.getCurrentSession();
			
			tblFlights t1 = new tblFlights(fmodel, from, to, airlines, duration, tktprice);
			
			theSession.beginTransaction();
			
			theSession.save(t1);
			
			theSession.getTransaction().commit();
		       
		    theSession.close();
		    
		    out.println("<h3 style=\"text-align:center\">Flight added successfully!</h3><br>"
		    		+ "<br><br><a href =\"logout\" style=\"text-align:center\">Log out</a>");
		}
		finally
		{
			 theFactory.close();
		}
		
		
		
	}

	
}
