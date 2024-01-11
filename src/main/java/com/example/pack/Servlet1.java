package com.example.pack;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Servlet1
 */


public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname = request.getParameter("username");
		String password = request.getParameter("pswd");
		PrintWriter pw = response.getWriter();
		RequestDispatcher rd;
		
		if("Devasheesh".equals(uname) && "Dev@123".equals(password))
		{
			rd = request.getRequestDispatcher("/Servlet2");
			rd.forward(request, response);
		}
		else
		{
			
			rd = request.getRequestDispatcher("/index.html");
			rd.include(request, response);
			pw.println("<h1>Enter the Correct Username and password</h1>");
		}
	}

}
