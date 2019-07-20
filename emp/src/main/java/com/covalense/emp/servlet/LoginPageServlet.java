package com.covalense.emp.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.covalense.emp.dao.EmployeeDao;
import com.covalense.emp.dao.EmployeeDaoFactory;
import com.covalense.emp.dto.EmployeeInfoBean;

@WebServlet("/loginpage")
public class LoginPageServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		
		Cookie dummycookie = new Cookie("dummy", "CheckCookiesEnabled");
		resp.addCookie(dummycookie);
		
		HttpSession session = req.getSession(false);
		if (session == null) {
			
			// Invalid session ; Generate Login Page with Error Info
			/*
			 * out.print("<h1><span='color:red'>Invalid Session !!! Plzz Login </span></h1>"
			 * ); out.print("</br>"); out.print("</br>");
			 */
			RequestDispatcher dispatcher = req.getRequestDispatcher("Login.html");
			dispatcher.include(req, resp);
		} else {

			RequestDispatcher dispatcher = req.getRequestDispatcher("./show");
			dispatcher.include(req, resp);
		}

		
	}

}//End of Class
