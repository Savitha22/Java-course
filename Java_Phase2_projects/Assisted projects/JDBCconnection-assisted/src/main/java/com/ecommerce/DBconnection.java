package com.ecommerce;
import java.sql.*;

public class DBconnection {
	static Connection conn;
	public static Connection get_connection(String URL, String user, String pwd) {
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			 conn=DriverManager.getConnection(URL, user, pwd);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return conn;
		
	}
	

	
}

