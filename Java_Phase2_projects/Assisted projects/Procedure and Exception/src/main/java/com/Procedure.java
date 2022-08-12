package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.CallableStatement;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Procedure")
public class Procedure extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Procedure() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		try {
		int productid=Integer.parseInt(request.getParameter("pid"));
		Connection con=DBconnection.get_connection();
		//Write sql command
		CallableStatement stmt=con.prepareCall("{call getAllproduct(?,?,?,?)}");
		stmt.setInt(1,productid);
	    stmt.registerOutParameter(2, Types.VARCHAR);
	    stmt.registerOutParameter(3, Types.INTEGER);

	    stmt.registerOutParameter(4, Types.INTEGER);
	    stmt.execute();
	    out.println("<table border=2>");
		out.println("<tr><th>product_id</th><th>product_name</th><th>price</th><th>quantity</th></tr>");
		out.println("<tr>");
		out.print("<td>"+productid+"</td>");
		out.print("<td>"+stmt.getString(2)+"</td>");
		out.print("<td>"+stmt.getInt(3)+"</td>");

		out.print("<td>"+stmt.getInt(4)+"</td>");
		out.println("</tr>");
	
	out.println("</table>");
			
			
		con.close();
	     
	}catch(Exception e) {
		e.printStackTrace();
	}

}
}
