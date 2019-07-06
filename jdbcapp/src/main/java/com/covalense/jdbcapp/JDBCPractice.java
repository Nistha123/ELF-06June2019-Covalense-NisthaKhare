package com.covalense.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

import lombok.extern.java.Log;

@Log
public class JDBCPractice {
	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;

		Driver driver;
		try {
			driver = new Driver();
			DriverManager.registerDriver(driver);

			String dbUrl = "jdbc:mysql://localhost:3306:/covalene_db";
			con = DriverManager.getConnection(dbUrl, "root", "root");

			String query = "Select * from employee_info";
			st = con.createStatement();
			rs = st.executeQuery(query);

			while (rs.next()) {
				log.info("Id (PK)        ====> " + rs.getInt(1));
				log.info("Name     		 ====> " + rs.getString(2));
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
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (con != null) {
				try {
					con.close();
					if (st != null) {
						st.close();
						if (rs != null) {
							rs.close();
						}
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

		}

	}// end of main
}// end of class