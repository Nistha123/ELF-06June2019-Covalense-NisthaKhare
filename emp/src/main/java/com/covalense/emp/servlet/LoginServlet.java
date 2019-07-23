package com.covalense.emp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.covalense.emp.dao.EmployeeDao;
import com.covalense.emp.dao.EmployeeDaoFactory;
import com.covalense.emp.dto.EmployeeInfoBean;

import lombok.extern.java.Log;

@Log
@WebServlet("/login")
public class LoginServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		RequestDispatcher dispatcher = null;
		PrintWriter out = resp.getWriter();

		// Check cookies are disabled
		if (req.getCookies() == null) {
			out.print("<BR>");
			out.print("<BR>");
			out.print("<h3 style=\"color: red\" class=\"head text-center\">");
			out.print("Please Enable Cookies");
			out.print("<BR>");
			out.print("</h3>");
			dispatcher = req.getRequestDispatcher("Login.html");
			dispatcher.include(req, resp);
			return;
		}

		EmployeeDao dao = EmployeeDaoFactory.getInstance();
		EmployeeInfoBean bean = dao.getEmployeeInfo(Integer.parseInt(req.getParameter("id")));
		String beanPas = req.getParameter("password");

		if (bean == null || !beanPas.equals(bean.getPassword())) {

			String url = "./loginfail?msg=Invalid Credentials !!";
			req.getRequestDispatcher(url).forward(req, resp);

		} else {
			if (beanPas.equals(bean.getPassword())) {

				// 1. valid Credentials; Create a session
				HttpSession httpSession = req.getSession(true);
				httpSession.setAttribute("userData", bean);

				req.setAttribute("empBean", bean);
				
				String url = "ShowEmployee.jsp";
				req.getRequestDispatcher(url).forward(req, resp);

			}
		}
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

}
