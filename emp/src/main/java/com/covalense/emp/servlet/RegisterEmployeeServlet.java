package com.covalense.emp.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.covalense.emp.dao.EmployeeDao;
import com.covalense.emp.dao.EmployeeDaoFactory;
import com.covalense.emp.dto.EmployeeInfoBean;

@WebServlet("/create")
public class RegisterEmployeeServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		EmployeeDao dao = EmployeeDaoFactory.getInstance();
		EmployeeInfoBean bean = new EmployeeInfoBean();
		
		PrintWriter out = resp.getWriter();
		
		 bean.setId(Integer.parseInt(req.getParameter("id")));
		 bean.setName(req.getParameter("nm"));
		 bean.setAcnt_no(Integer.parseInt(req.getParameter("ac")));
		 bean.setPassword(req.getParameter("pas"));
		 bean.setConfirmPassword(req.getParameter("confPas"));
		 bean.setAge(Integer.parseInt(req.getParameter("age")));
		 bean.setGender(req.getParameter("gen"));
		 bean.setSalary(Integer.parseInt(req.getParameter("sal")));
		 bean.setPhone(Integer.parseInt(req.getParameter("phone")));
		 bean.setEmail(req.getParameter("email"));
		 bean.setDesignation( req.getParameter("desig"));
		 try{
			bean.setDob(new SimpleDateFormat().parse(req.getParameter("dob")));
			bean.setJoining_date(new SimpleDateFormat().parse(req.getParameter("jdate")));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		 bean.setDept_ID(Integer.parseInt(req.getParameter("deptId")));
		 bean.setManager_ID(Integer.parseInt(req.getParameter("manId")));
		 
		 boolean saveData = dao.createEmployee(bean);
	}

}
