package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/dboperation")
public class dboperation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public dboperation() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			PrintWriter out=response.getWriter();
	Connection con=DBconnection.get_connection();
	Statement stmt=con.createStatement();
	stmt.executeUpdate("create database sathivelu");
    out.println("Created database: sathivelu");
    stmt.executeUpdate("use sathivelu");
    out.println("Selected database: sathivelu");
    stmt.executeUpdate("drop database sathivelu");
    stmt.close();
    out.println("Dropped database: sathivelu");

	
	}
		catch(Exception e) {
			e.printStackTrace();
		}

	
	}
}
