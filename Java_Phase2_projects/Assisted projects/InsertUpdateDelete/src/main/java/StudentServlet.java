

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StudentServlet
 */
@WebServlet("/StudentServlet")
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
		int rollno=Integer.parseInt(request.getParameter("txtrollno"));
		String fname=request.getParameter("txtfname");
		String lname=request.getParameter("txtlname");
		Float marks=Float.parseFloat(request.getParameter("txtmarks"));
		String sub=request.getParameter("txtsub");
		
		//Establish Connection with database
		
			Connection con=Dbconnection.getconnection();	
			
			//Write Query
			
			String str="Insert into student (Rollno,Firstname,lastname,marks,Subject) values(?,?,?,?,?)";
			//string str= "update student set marks=? where rollno=?"
			//String str="delete from student where rollno=?"
			//to execute query create object of preparedSatement
			PreparedStatement  ps=con.prepareStatement(str);
			ps.setInt(1,rollno );
			ps.setString(2, fname);

			ps.setString(3, lname);
			ps.setFloat(4, marks);

			ps.setString(5, sub);
						
			//execute query
			int ans =ps.executeUpdate();
			PrintWriter out=response.getWriter();
			if(ans>0)
				out.println("Record inserted");
			else
				out.println("Record not inserted");
		
			//close connection
			con.close();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
}

}
