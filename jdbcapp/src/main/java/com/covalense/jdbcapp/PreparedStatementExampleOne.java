package com.covalense.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

import lombok.extern.java.Log;

@Log
public final class PreparedStatementExampleOne {

	public static void main(String[] args) {

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			// 1. Load the "Driver"
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			// 2. Get the "DB Connection" via "Driver"
			//String dbUrl = "jdbc:mysql://localhost:3306/covalense_db?user=root&password=root";
			//con = DriverManager.getConnection(dbUrl);
			
			String dbUrl = "jdbc:mysql://localhost:3306/covalense_db";
			con = DriverManager.getConnection(dbUrl, "root", "root");
			
			log.info("Connection Impl classes====> " + con.getClass());

			// 3. Issues "SQL Queries" via "Connection"
			String query = "select * from employee_info where id=?";
			log.info("Queries " + query);
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, Integer.parseInt(args[0]));
			rs = pstmt.executeQuery();
			

			// 4. "Process the Results" returned by "SQL Queries"
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

		} catch (SQLException e) {
			e.printStackTrace();
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
				// TODO Auto-generated catch block
				e.printStackTrace();

			} // end of try-catch block
		}

	}// end of main
}// end of class
