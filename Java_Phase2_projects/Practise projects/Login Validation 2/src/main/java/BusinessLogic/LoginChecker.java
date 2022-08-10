package BusinessLogic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/LoginChecker")
public class LoginChecker extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public LoginChecker() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname=request.getParameter("txtUsername");
		String pword=request.getParameter("txtPassword");
		PrintWriter out=response.getWriter();
		if(uname.equalsIgnoreCase("Savitha") && pword.equals("savitha@123")){
			out.println("You are Welcomed");
		}
		else
			out.println("Invalid Username or Password");
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname=request.getParameter("txtUsername");
		String pword=request.getParameter("txtPassword");
		PrintWriter out=response.getWriter();
		
		
		RequestDispatcher rd;
		if(uname.equals("Savitha") && pword.equals("savitha@123")) {
			HttpSession session=request.getSession(true);
			session.setAttribute("username", uname);
			rd=request.getRequestDispatcher("Welcome");
			rd.forward(request, response);
		}
		else {
			rd=request.getRequestDispatcher("LoginForm.html");
			rd.include(request, response);
			out.println("<center><p style=font-size:25px;color:red;>invalid username and password, Please try again 😯😯</p>");
			
	}
	}
}
