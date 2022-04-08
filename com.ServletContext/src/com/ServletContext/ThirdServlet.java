package com.ServletContext;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ThirdServlet extends HttpServlet {
@Override
public  void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	 javax.servlet.ServletConfig ctx= getServletConfig();
	  String d=ctx.getInitParameter("Developer");
	  PrintWriter out = resp.getWriter();
	out.println("control is in Third Servlet \n");

	  out.println("Developer is "+d);
}
}
