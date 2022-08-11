package com;

import java.sql.*;

public class DBconnection {
	static Connection conn=null;
	public static Connection get_connection() {
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url="jdbc:mysql://localhost:3306/productdetails";
			String username="root";
			String password="Savitha2@";
			
			conn=DriverManager.getConnection(url,username,password);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return conn;
		
	}
	

	
}
