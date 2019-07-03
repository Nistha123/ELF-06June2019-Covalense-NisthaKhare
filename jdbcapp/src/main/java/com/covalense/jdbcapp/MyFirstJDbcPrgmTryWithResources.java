package com.covalense.jdbcapp;

import java.sql.*;

import com.mysql.jdbc.Driver;

import lombok.extern.java.Log;

@Log
public final class MyFirstJDbcPrgmTryWithResources {

	public static void main(String[] args) {

		String dbUrl = "jdbc:mysql://localhost:3306/covalense_db";
		String query = "Select * from employee_info";

		try (Connection con = DriverManager.getConnection(dbUrl, "root", "root");
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(query);) {

			Class.forName("com.mysql.jdbc.Driver").newInstance();

			/*
			 * Driver driver = new Driver(); DriverManager.registerDriver(driver);
			 */

			log.info("Connection Impl classes====> " + con.getClass());

			while (rs.next()) {

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

			} // end of while

		} catch (SQLException | InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
		}

	}// end of main
}// end of class
