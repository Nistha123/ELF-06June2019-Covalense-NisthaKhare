package com.covalense.mywebapp.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.omg.CORBA.Request;

import com.covalense.mywebapp.beans.EmployeeInfoBean;

/**
 * Servlet implementation class ForwardServlet
 */
public class ForwardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response)
			throws ServletException, IOException {
		
		EmployeeInfoBean infoBean = new EmployeeInfoBean();
				infoBean.setId(30);
				infoBean.setName("abc");
				infoBean.setEmail("abc.gmail.com");
				infoBean.setPhone(78979798);
				
				//Pass the above object to EmployeeSearchServlet
				
		/* request.setAttribute("info", infoBean); */
				
				ServletContext ctx = getServletContext();
				ctx.setAttribute("info", infoBean);
				
		
		String url = "search?id=1";
		//String url = "http://www.gmail.com";
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
		
	}//end of doGet()

}//end of class
