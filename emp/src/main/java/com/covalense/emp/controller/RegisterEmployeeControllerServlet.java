package com.covalense.emp.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.covalense.emp.dao.EmployeeDao;
import com.covalense.emp.dao.EmployeeDaoFactory;
import com.covalense.emp.dto.EmployeeInfoBean;
import com.covalense.emp.dto.EmployeeOtherInfoBean;


@WebServlet("/create")
public class RegisterEmployeeControllerServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		EmployeeDao dao = EmployeeDaoFactory.getInstance();
		EmployeeInfoBean bean = new EmployeeInfoBean();
		EmployeeOtherInfoBean otherInfo = new EmployeeOtherInfoBean();

		RequestDispatcher dispatcher = null;

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
		bean.setDesignation(req.getParameter("desig"));
		try {
			bean.setDob(new SimpleDateFormat("dd-mm-yyyy").parse(req.getParameter("dob")));
			bean.setJoining_date(new SimpleDateFormat("dd-mm-yyyy").parse(req.getParameter("jdate")));
		} catch (ParseException e) {
			e.printStackTrace();
		}

		otherInfo.setId(Integer.parseInt(req.getParameter("id")));
		otherInfo.setIsmarried((req.getParameter("marst")));
		otherInfo.setPan((req.getParameter("pan")));
		otherInfo.setBlood_grp((req.getParameter("blgrp")));
		otherInfo.setChallenged(Boolean.parseBoolean(((req.getParameter("phch")))));
		otherInfo.setEmergency_contact_name((req.getParameter("emername")));
		otherInfo.setEmergency_contact_number(Integer.parseInt(req.getParameter("emernum")));
		otherInfo.setNationality((req.getParameter("nan")));
		otherInfo.setReligion((req.getParameter("rel")));
		otherInfo.setFather_name((req.getParameter("fname")));
		otherInfo.setMother_name((req.getParameter("mname")));
		otherInfo.setPassport(Integer.parseInt(req.getParameter("pass")));
		otherInfo.setAdhar(Integer.parseInt(req.getParameter("aad")));
		otherInfo.setSpouse_name(req.getParameter("sname"));
		
		bean.setOtherInfo(otherInfo);

		if (bean.getId() == 0 && bean.getPassword() == null && bean.getAge() == 0
				&& bean.getConfirmPassword() == null) {

			out.print("Enter all necessary details");
			dispatcher = req.getRequestDispatcher("./create");
			dispatcher.include(req, resp);

		} else {
			boolean saveData = dao.createEmployee(bean);
			out.print("<BR>");
			out.print("<BR>");
			out.print("<h3 style=\"color: blue\" class=\"head text-center\">");
			out.print("Employee Registered Successfully");
			out.print("<BR>");
			out.print("</h3>");
			req.setAttribute("empBean", bean);
			String url = "ShowEmployee.jsp";
		
			dispatcher = req.getRequestDispatcher(url);
			dispatcher.include(req, resp);
		}//End of if-else

	}//End of doPost()

}//End of class
