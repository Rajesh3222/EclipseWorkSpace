package com.ServletContext;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SecondServlet extends HttpServlet  {
@Override
public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	 javax.servlet.ServletConfig ctx= getServletConfig();
	  String d=ctx.getInitParameter("Developer");
	  resp.getWriter().println("control is in second Servlet");
	  resp.getWriter().println("Developer is "+d);
}
}
