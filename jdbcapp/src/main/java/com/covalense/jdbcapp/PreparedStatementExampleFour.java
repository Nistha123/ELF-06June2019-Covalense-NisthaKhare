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
public final class PreparedStatementExampleFour {

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
			
			String dbUrl = "jdbc:mysql://mycoval-aws.cpd5dqeaqbqz.ap-south-1.rds.amazonaws.com:3306/awsDB";
			con = DriverManager.getConnection(dbUrl, "root", "Nistha11");
			
			log.info("Connection Impl classes====> " + con.getClass());

			// 3. Issues "SQL Queries" via "Connection"
			String query = "Insert into employee_info" + 
			" values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
			log.info("Queries " + query);
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, Integer.parseInt(args[0]));
			pstmt.setString(2, args[1]);
			pstmt.setInt(3, Integer.parseInt(args[2]));
			pstmt.setString(4, args[3]);
			pstmt.setDouble(5, Integer.parseInt(args[4]));
			pstmt.setInt(6, Integer.parseInt(args[5]));
			pstmt.setString(7, args[6]);
			pstmt.setString(8, args[7]);
			pstmt.setString(9, args[8]);
			pstmt.setInt(10, Integer.parseInt(args[9]));
			pstmt.setString(11, args[8]);
			pstmt.setInt(12, Integer.parseInt(args[11]));
			pstmt.setInt(13, Integer.parseInt(args[12]));
			int res = pstmt.executeUpdate();
			log.info("Query inserted" + res);
			
			
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
