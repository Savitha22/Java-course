package BusinessLogic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Logout")
public class Logout extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Logout() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<center><p style=font-size:25px;color:red;>You are Successfully Logged out.....</p>");
		out.println(
                "<a href=\"LoginForm.html\">Go-Back To Home Page"+"</a>");
		out.close();
		session.invalidate();
	}

}
