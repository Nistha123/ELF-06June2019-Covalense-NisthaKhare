package com.covalense.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.covalense.mywebapp.beans.EmployeeInfoBean;

import lombok.extern.java.Log;

@Log
public class MyFirstServlet extends HttpServlet{
	
	 public MyFirstServlet() {
		log.info("First Constructor");
	 }
	
	@Override
	protected synchronized void doGet(HttpServletRequest req, HttpServletResponse resp) 
	throws ServletException, IOException {
		
		ServletContext ctx = getServletContext();
		String movieName = ctx.getInitParameter("movie");
		
		ServletConfig config = getServletConfig();
		String actorName = config.getInitParameter("actor");
		
		/*
		 * String httpMethod = req.getMethod(); String protocol = req.getProtocol();
		 * String reqURL = req.getRequestURL().toString();
		 * 
		 * log.info("HTTP Method===>" + httpMethod); log.info("Protocol===>" +
		 * protocol); log.info("Requested URL===>" + reqURL);
		 * 
		 */
		//Get query string Information
		String fnameValue = req.getParameter("fname");
		String lnameValue = req.getParameter("lname");
		
		String currentDataTime = new Date().toString();
		String htmlResponse = "<!DOCTYPE html>"+
							  "<html>"+
							  "<head>"+
							  "<meta charset=\"ISO-8859-1\">"+
							  "<title>My First HTML</title>"+
							  "</head>"+
							  "<body>"+
							  "	<h1>"+
							  "	Current Date and Time is : "+
							  "	<br>"+
							  "	<span style=\"color: blue\">" +currentDataTime+ "</span>"+
							  "<BR><BR>" +
							  "First Name :" + fnameValue + " " + "<BR>" +
							   "Last Name :" + lnameValue +
							   "<BR><BR>" +
							  "Movie Name :" + movieName + " " + "<BR>" +
							   "Actor Name :" + actorName +
							  "	</h1>"+
							  "</body>"+
							  "</html>";
		
		//send above HTML Response to Browser
		
		resp.setContentType("text/html");
	//	resp.setHeader("Refresh", "1");  //Auto Refresh for every second
		PrintWriter out = resp.getWriter();
		out.print(htmlResponse);
		
		//Get the object from Forward Servlet
		
				EmployeeInfoBean empInfo = (EmployeeInfoBean) ctx.getAttribute("info");
				if(empInfo==null) {
					out.print("<HTML>");
					out.print("<BODY>");
					out.print("<span style=\"color: blue\"> Employee Object not found !!!</span>");
					out.print("</BODY>");
					out.print("</HTML>");
				}else {
					out.print("<HTML>");
					out.print("<BODY>");
					out.print("<span style=\"color: blue\"> Employee Object found ...</span>");
					out.print("<BR>");
					out.print("<BR>Id is " + empInfo.getId());
					out.print("<BR>name is " + empInfo.getName());
					out.print("<BR>phone is " + empInfo.getPhone());
					out.print("<BR>Email is " + empInfo.getEmail());
					out.print("</BODY>");
					out.print("</HTML>");
				}
		
	}//End to doGet

}//End of class
