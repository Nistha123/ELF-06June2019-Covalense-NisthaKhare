package com.covalense.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/include")
public class IncludeServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req,
			HttpServletResponse resp)
			throws ServletException, IOException {
		
		RequestDispatcher dispatcher = null;
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		out.println("111111111111111111111111");
		
		out.println("<BR>");		
		dispatcher = req.getRequestDispatcher("index.html");
		dispatcher.include(req, resp);
		out.println("<BR>");
		
		out.println("222222222222222222222222");
		
		out.println("<BR>");
		dispatcher = req.getRequestDispatcher("currentDate?fname=Nistha&lname=Khare");
		dispatcher.include(req, resp);
		out.println("<BR>");
		
		
		out.println("333333333333333333333333");
		
		out.println("<BR>");
		dispatcher = req.getRequestDispatcher("search?id=1");
		dispatcher.include(req, resp);
		out.println("<BR>");
		
		out.println("444444444444444444444444");
		
		
	}//End of doGet

}//End of class
