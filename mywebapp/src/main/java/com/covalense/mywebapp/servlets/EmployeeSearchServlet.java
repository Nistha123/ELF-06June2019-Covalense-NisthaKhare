package com.covalense.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.covalense.mywebapp.beans.EmployeeInfoBean;
import com.covalense.mywebapp.dao.EmployeeDAO;
import com.covalense.mywebapp.dao.EmployeeDAOFactory;

@WebServlet("/search")
public class EmployeeSearchServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String idValue = req.getParameter("id");

		// Interact with DB & get the Employee Info
		EmployeeDAO dao = EmployeeDAOFactory.getInstance();
		EmployeeInfoBean bean = dao.getEmployeeInfo(idValue);

		// Send the response to Browser
		PrintWriter out = resp.getWriter();

		if (bean == null) {
			out.print("<HTML>");
			out.print("<BODY>");
			out.print("<span style=\"color: blue\"> Employee not found !!!</span>");
			out.print("</BODY>");
			out.print("</HTML>");
		} else {
			out.print("<HTML>");
			out.print("<BODY>");
			out.print("<span style=\"color: blue\"> Employee found ...</span>");
			out.print("<BR>");
			out.print("<BR>Id is " + bean.getId());
			out.print("<BR>name is " + bean.getName());
			out.print("<BR>phone is " + bean.getPhone());
			out.print("<BR>Age is " + bean.getAge());
			out.print("<BR>Salary is " + bean.getSalary());
			out.print("<BR>Account no is " + bean.getAccountNo());
			out.print("<BR>DOB is " + bean.getDob());
			out.print("<BR>Designation is " + bean.getDesignation());
			out.print("<BR>Dept ID is " + bean.getDepartmentId());
			out.print("<BR>Manager ID is " + bean.getManagerId());
			out.print("</BODY>");
			out.print("</HTML>");
		}
	}

}// End of class
