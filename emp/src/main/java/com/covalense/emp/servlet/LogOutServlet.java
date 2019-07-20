package com.covalense.emp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LogOutServlet
 */
@WebServlet("/logout")
public class LogOutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//3. Invalidate the session
		HttpSession httpSession = request.getSession(false);
		if(httpSession!=null) {
			httpSession.invalidate();
		}
		
		RequestDispatcher dispatcher = null;
		PrintWriter out = response.getWriter();

		out.print("<BR>");
		out.print("<BR>");
		out.print("<h3 style=\"color: red\" class=\"head text-center\">");
		out.print("LogOut Successful");
		out.print("<BR>");
		out.print("</h3>");

		dispatcher = request.getRequestDispatcher("Login.html");
		dispatcher.include(request, response);
	}

}
