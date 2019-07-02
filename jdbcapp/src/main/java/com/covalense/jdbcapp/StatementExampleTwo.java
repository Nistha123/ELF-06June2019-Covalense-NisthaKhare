package com.covalense.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

import lombok.extern.java.Log;

@Log
public final class StatementExampleTwo {

	public static void main(String[] args) {

		Connection con = null;
		Statement stmt = null;
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
			String query = "Insert into employee_info" + 
			"values(8,'Abhay',30,'male',10000,34889789,"
					+ "'abhay@gmail.com','Jr. Software Developer','1990-08-10',776867869,null,103,2);";
			log.info("Queries " + query);
			stmt = con.createStatement();
			int res = stmt.executeUpdate(query);
			log.info("Query inserted" + res);
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// 5. Close all "JDBC objects"

			try {
				if (con != null) {
					con.close();
					if (stmt != null) {
						stmt.close();
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
