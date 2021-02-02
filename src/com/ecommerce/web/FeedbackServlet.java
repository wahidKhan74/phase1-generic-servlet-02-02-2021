package com.ecommerce.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FeedbackServlet extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		// fetch input request data
		String fname = req.getParameter("fname");
		String lname = req.getParameter("lname");
		String message = req.getParameter("message");
		
		//send data response
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("<html><body>");
		out.println("<h2> Hi there, "+fname+ " "+ lname+"</h2>");
		out.println("<p> Your feedback is submitted as , "+message+ "</p>");
		out.println("</html></body>");
	}

	

}
