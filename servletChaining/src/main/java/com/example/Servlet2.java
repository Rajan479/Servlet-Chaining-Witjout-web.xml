package com.example;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/callServlet2")
public class Servlet2 extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String un = req.getParameter("username");
		PrintWriter out = res.getWriter();
		out.print("<h1>Hello "+un.toUpperCase()+", Welcome to homepage by servlet2");
	}
}
