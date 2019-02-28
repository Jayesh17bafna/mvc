package com.testdb;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.*;
@WebServlet("/TestDbServlet")
public class TestDbServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		String url = "jdbc:h2:tcp://localhost/~/demo";
		String user = "sa";
		String pass = "";
		
		
		try {
			Class.forName("org.h2.Driver");
		Connection con = DriverManager.getConnection(url,user,pass);
		con.close();
		}
	catch(Exception ex)
		{
		ex.printStackTrace();
		throw new ServletException(ex);
		}
	}

}
