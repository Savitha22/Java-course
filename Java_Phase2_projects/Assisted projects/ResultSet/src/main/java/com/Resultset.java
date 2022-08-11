package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Resultset")
public class Resultset extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Resultset() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			PrintWriter out=response.getWriter();
			// get connection
			Connection con=DBconnection.get_connection();

			response.setContentType("text/html");
			out.println("<html><body>"); 
			
			// create sql command
			String sql="select * from product"; 
			Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
			out.println("<table border=1 width=50% height=10%>"); 
			out.println("<tr><th>product_id</th><th>product_name</th><th>price</th><th>quantity</th></tr>"); 

			//Execute query and stored in resultset
			ResultSet result=stmt.executeQuery(sql);
			
			out.println("Before Changes All Records...");
			//Read records from resultset
			while(result.next()) {
				out.println("<tr><td>"+result.getInt("product_id")+"<td>"+result.getString("product_name")+"<td>"+result.getInt("price")+"<td>"+result.getInt("quantity")+"<br>");	
				}
			out.println("</table>");  
		 	out.println("</html></body>"); 
			 
		 	
		 	response.setContentType("text/html");
			out.println("<html><body>"); 
			// inserting a new row
			result.moveToInsertRow();
			result.updateInt("product_id", 71);
			result.updateString("product_name", "Mouse");

			result.updateInt("price", 20000);

			result.updateInt("quantity", 5);
			result.insertRow();

			// updating 2nd row – changing name to Seetha
			result.absolute(2);
			result.updateString("product_name", "Table");
			result.updateRow();
			result.absolute(5);
			result.deleteRow();

			out.println("<table border=1 width=50% height=10%>"); 
			out.println("<tr><th>product_id</th><th>product_name</th><th>price</th><th>quantity</th></tr>"); 
          
			out.println("After Changes All Records...");
			result.beforeFirst();// to move cursor in begining of resultset
			
			while(result.next()) {
				out.println("<tr><td>"+result.getInt("product_id")+"<td>"+result.getString("product_name")+"<td>"+result.getInt("price")+"<td>"+result.getInt("quantity"));		}
			out.println("</table>");  
		 	out.println("</html></body>"); 
		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}
	}

