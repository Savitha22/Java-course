package com;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnection {
	static Connection con = null;

	public static Connection getconnection() {
		try {
			// Step 1 :load Driver class. Class.forName() tells class loader to load Driver
			// class in memory at runtime
			Class.forName("com.mysql.cj.jdbc.Driver");
			// Step2 : Connection- Database url, username, password
			// DriverManager is available in java.sql
			String url = "jdbc:mysql://localhost:3306/savitha";
			String user = "root";
			String password = "Savitha2@";
			con = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	
	}
}
