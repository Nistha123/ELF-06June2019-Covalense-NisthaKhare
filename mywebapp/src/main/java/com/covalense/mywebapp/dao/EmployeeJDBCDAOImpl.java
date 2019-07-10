package com.covalense.mywebapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.covalense.mywebapp.beans.EmployeeInfoBean;
import com.mysql.jdbc.Driver;

import lombok.extern.java.Log;

@Log
public final class EmployeeJDBCDAOImpl implements EmployeeDAO
{
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	public ArrayList<EmployeeInfoBean> getAllEmployeeInfo() {

		String dbUrl = "jdbc:mysql://localhost:3306/covalense_db";
		String query = "Select * from employee_info";
		try (Connection con = DriverManager.getConnection(dbUrl, "root", "root");
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(query);) {

			Class.forName("com.mysql.jdbc.Driver").newInstance();

			ArrayList<EmployeeInfoBean> beans = new ArrayList<EmployeeInfoBean>();
			while (rs.next()) {
				EmployeeInfoBean bean = new EmployeeInfoBean();
				log.info("Id (PK)        ====> " + rs.getInt("ID"));
				log.info("Name     		 ====> " + rs.getString("NAME"));
				log.info("age     		 ====> " + rs.getInt("AGE"));
				log.info("Gender  		 ====> " + rs.getString("GENDER"));
				log.info("salary  		 ====> " + rs.getDouble("SALARY"));
				log.info("phone   		 ====> " + rs.getInt("PHONE"));
				log.info("email   		 ====> " + rs.getDate("JOINING_DATE"));
				log.info("designation    ====> " + rs.getInt("ACCNT_NO"));
				log.info("dob            ====> " + rs.getString("EMAIL"));
				log.info("Acnt_no        ====> " + rs.getString("DESIGNATION"));
				log.info("joining_date   ====> " + rs.getDate("DOB"));
				log.info("Dept_ID        ====> " + rs.getInt("DEPT_ID"));
				log.info("Manager_ID     ====> " + rs.getInt("MANAGER_ID"));
				beans.add(bean);

			} // end of while
			return beans;
		} catch (SQLException | InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
			return null;
		}
	}// end of main

	public EmployeeInfoBean getEmployeeInfo(String id) {
		try {
			return getEmployeeInfo(Integer.parseInt(id));
		} catch (NumberFormatException e) {
			e.printStackTrace();
			return null;
		}
	}// end of method

	public EmployeeInfoBean getEmployeeInfo(int id) {
		try {
			// 1. Load the "Driver"
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			String dbUrl = "jdbc:mysql://localhost:3306/covalense_db";
			con = DriverManager.getConnection(dbUrl, "root", "root");
			log.info("Connection Impl classes====> " + con.getClass());

			// 3. Issues "SQL Queries" via "Connection"
			String query = "select * from employee_info where id=?";
			log.info("Queries " + query);
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, id);
			rs = pstmt.executeQuery();

			// 4. "Process the Results" returned by "SQL Queries"
			EmployeeInfoBean bean = new EmployeeInfoBean();
			while (rs.next()) {				
				bean.setId(rs.getInt("ID"));
				bean.setName(rs.getString("NAME"));
				bean.setAge(rs.getInt("AGE"));
				bean.setGender(rs.getString("GENDER"));
				bean.setSalary(rs.getDouble("SALARY"));
				bean.setPhone(rs.getInt("PHONE"));
				bean.setJoining_date(rs.getDate("JOINING_DATE"));
				bean.setAccountNo(rs.getInt("ACCNT_NO"));
				bean.setEmail(rs.getString("EMAIL"));
				bean.setDesignation(rs.getString("DESIGNATION"));
				bean.setDob(rs.getDate("DOB"));
				bean.setDepartmentId(rs.getInt("DEPT_ID"));
				bean.setManagerId(rs.getInt("MANAGER_ID"));
				
			} // end of while
			return bean;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		} finally {
			// 5. Close all "JDBC objects"
			try {
				if (con != null) {
					con.close();
					if (pstmt != null) {
						pstmt.close();
					}
					if (rs != null) {
						rs.close();
					}
				}
			} catch (SQLException e) {
				e.printStackTrace();
			} // end of try-catch block
		}
	}// end of method

	@Override
	public boolean createEmployeeInfo(EmployeeInfoBean bean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateEmployeeInfo(EmployeeInfoBean bean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteEmployeeInfo(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteEmployeeInfo(String id) {
		// TODO Auto-generated method stub
		return false;
	}
}// end of class
