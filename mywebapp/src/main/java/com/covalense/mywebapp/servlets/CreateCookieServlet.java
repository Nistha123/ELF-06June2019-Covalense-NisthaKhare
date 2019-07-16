package com.covalense.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CreateCookieServlet
 */
@WebServlet("/createcookie")
public class CreateCookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		//Create a Cookie
		Cookie myNameCookie = new Cookie("myName", "Nistha");
		Cookie myLocCookie = new Cookie("myLoc", "Bangalore");
		myLocCookie.setMaxAge(7*24*60*60);   //time in sec
		
		//Send the above Cookie to Browser
		
		response.addCookie(myNameCookie);
		response.addCookie(myLocCookie);
		
		PrintWriter out = response.getWriter();
		out.print("Cookie Created !!!!");
		
	}// End of doGet

}// End of class
