package Businesslogic;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;


@WebFilter("/FirstServlet")
public class FirstFilter implements Filter {

 
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
			PrintWriter out=response.getWriter();
			String role=request.getParameter("role"); 
		// pass the request along the filter chain
		if(role.equals("accountant"))
		chain.doFilter(request, response);
		else
			out.println("you are not allowed to access this page");
	}

	

}