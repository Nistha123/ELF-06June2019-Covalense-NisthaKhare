package com.covalense.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.covalense.mywebapp.beans.EmployeeInfoBean;
import com.covalense.mywebapp.dao.EmployeeDAO;
import com.covalense.mywebapp.dao.EmployeeDAOFactory;
@WebServlet("/create")
public class CreateEmployeeServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Session session = null;
		EmployeeDAO dao = EmployeeDAOFactory.getInstance();
		EmployeeInfoBean bean = new EmployeeInfoBean();
		
		PrintWriter out = resp.getWriter();
	
			 bean.setId(Integer.parseInt(req.getParameter("id")));
			 bean.setName(req.getParameter("nm"));
			 bean.setAccountNo(Integer.parseInt(req.getParameter("ac")));
			 bean.setAge(Integer.parseInt(req.getParameter("age")));
			 bean.setGender(req.getParameter("gen"));
			 bean.setSalary(Integer.parseInt(req.getParameter("sal")));
			 bean.setPhone(Integer.parseInt(req.getParameter("phone")));
			 bean.setEmail(req.getParameter("email"));
			 bean.setDesignation( req.getParameter("desig"));
			 try{
				bean.setDob(new SimpleDateFormat().parse(req.getParameter("dob")));
				bean.setJoining_date(new SimpleDateFormat().parse(req.getParameter("jDate")));
			} catch (ParseException e) {
				e.printStackTrace();
			}
			
			 bean.setDepartmentId(Integer.parseInt(req.getParameter("dId")));
			 bean.setManagerId(Integer.parseInt(req.getParameter("mId")));
			 
			 boolean saveEmp = dao.createEmployeeInfo(bean);
			 out.print("<HTML>");
				out.print("<BODY>");
				out.print("<span style=\"color: blue\"> Employee registered successfully !!!</span>");
				out.print("</BODY>");
				out.print("</HTML>");
		
	}//end of post()

}//end of class
