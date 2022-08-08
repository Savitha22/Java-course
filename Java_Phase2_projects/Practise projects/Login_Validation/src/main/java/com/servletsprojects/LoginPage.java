package com.servletsprojects;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginPage")
public class LoginPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
      
    

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username=request.getParameter("txtUsername");
		String password=request.getParameter("txtPassword");
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		
		if((username.equals("Savitha"))&&(password.equals("savitha@123"))) {
			out.println(
                    "<form action=\"LogoutPage\">" +
                    "<p style=\"text-align:right\";><input type=\"submit\"" +  "value=\"Logout\"></p>" +
                  
                    "</form>" );
			out.println("<center><h1>Welcome to our new Web Page creation "+username+ "</h1>");
			out.println("<br/><b>You are successfully login........ ");
			
			}
       
		else {
			RequestDispatcher rd = getServletContext().getRequestDispatcher("/Login.html");
			out.println("<center><p style=font-size:25px;color:red;>invalid username and password, Please try again 😯😯</p>");
			rd.include(request, response);}
		
	}

}
