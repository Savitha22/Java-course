

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DisplayInfo")
public class DisplayInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public DisplayInfo() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		out.println("<html><body>"); 
		//get Connection
		Connection con=Dbconnection.getconnection();
		
		//create Sql command
		String query="select * from student";
		Statement stmt = con.createStatement();
		out.println("<table border=1 width=50% height=10%>"); 
		out.println("<tr><th>Rollno</th><th>Firstname</th><th>lastname</th><th>marks</th><th>Subject</th></tr>"); 
	
		//execute sql command and store output in resultset
		ResultSet rs = stmt.executeQuery(query);
		
		//Read records from resultset
		while (rs.next()) {
			out.println("<tr><td>"+rs.getInt("Rollno")+"<td>"+rs.getString("Firstname") +"<td>"+ rs.getString("lastname") +"<td>"+rs.getFloat("marks")+"<td>"+rs.getString("Subject"));
		}
		out.println("</table>");  
	 	out.println("</html></body>");  
	 	con.close(); 
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	
	

}
}
