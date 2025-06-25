//Going from index.html to servlet without using web.xml code
package com.example;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/callServlet1")
public class Servlet1 extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String un = req.getParameter("username");
		PrintWriter out = res.getWriter();
		out.print("<h1>Hello "+un.toUpperCase()+", Welcome to homepage by servlet1\n");
		RequestDispatcher rd = req.getRequestDispatcher("callServlet2");
		rd.include(req, res);
//		rd.forward(req, res);
	}
}
