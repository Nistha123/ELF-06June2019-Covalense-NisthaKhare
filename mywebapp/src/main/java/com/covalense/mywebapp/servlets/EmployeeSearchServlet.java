package com.covalense.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.covalense.mywebapp.beans.EmployeeInfoBean;
import com.covalense.mywebapp.dao.EmployeeDAO;
import com.covalense.mywebapp.dao.EmployeeDAOFactory;

@WebServlet(urlPatterns = "/search" , 
initParams = {
		@WebInitParam(name="actress",value = "basanti"),
		@WebInitParam(name="actor",value = "amitabh"),
		})
public class EmployeeSearchServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		ServletContext ctx = getServletContext();
		String movieName = ctx.getInitParameter("movie");
		
		ServletConfig config = getServletConfig();
		String actorName = config.getInitParameter("actor");
		String actressName = config.getInitParameter("actress");
		
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
			out.print("<BR>");
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
			out.print("<BR><BR>Movie is " + movieName);
			out.print("<BR>Actor is " + actorName);
			out.print("<BR>Actress is " + actressName);
			out.print("</BODY>");
			out.print("</HTML>");
		}
		
		//Get the object from Forward Servlet
		/* EmployeeInfoBean empInfo = (EmployeeInfoBean) req.getAttribute("info"); */
		
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
		
	}

}// End of class
