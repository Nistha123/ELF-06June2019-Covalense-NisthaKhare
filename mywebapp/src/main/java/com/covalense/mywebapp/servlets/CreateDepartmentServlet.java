package com.covalense.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.covalense.mywebapp.beans.EmployeeDepartmentInfoBean;
import com.covalense.mywebapp.dao.EmployeeDAO;
import com.covalense.mywebapp.dao.EmployeeDAOFactory;

@WebServlet("/createDept")
public class CreateDepartmentServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
	throws ServletException, IOException {
		
		EmployeeDAO dao = EmployeeDAOFactory.getInstance();
		EmployeeDepartmentInfoBean bean = new EmployeeDepartmentInfoBean();
		
		PrintWriter out = resp.getWriter();
		
		bean.setDeptID(Integer.parseInt(req.getParameter("dId")));
		bean.setDeptName(req.getParameter("dName"));
		
		boolean setDept = dao.createDeptInfo(bean);
		
		out.print("<HTML>");
		out.print("<BODY>");
		out.print("<span style=\"color: blue\">Department listed successfully !!!</span>");
		out.print("</BODY>");
		out.print("</HTML>");

	
	}

}
