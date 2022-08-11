import java.sql.*;

public class Dbconnection {
	static Connection con=null;
	public static Connection getconnection() {
		try {

			// Step 1 :load Driver class. Class.forName() tells class loader to load Driver
			// class in memory at runtime
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//step2 create  the connection object 
		// DriverManager is available in java.sql
		String url= "jdbc:mysql://localhost:3306/savitha";
		String uname="root";
		String pword="Savitha2@";
		con=DriverManager.getConnection(url,uname,pword); 
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		return con;
		
		
	}

}
