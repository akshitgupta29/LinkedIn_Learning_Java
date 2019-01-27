package com.test.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet ("/getServlet")
public class GetServlet extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doGet(req, resp);
		String value = req.getParameter("name");
		String htmlResponse = "<html><h3> Welcome to Servlet </h3> </html>";
		PrintWriter write = resp.getWriter();
		write.write(htmlResponse + " " + value );
	}
}
