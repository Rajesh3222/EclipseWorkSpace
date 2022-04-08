package com.ServletJava;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class FirstServlet extends HttpServlet {
     @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	// TODO Auto-generated method stub
    	String user=req.getParameter("emailid");
    	String pass1=req.getParameter("pass");
    	//req dispatcher
    	/*req.setAttribute("info",user);
    	RequestDispatcher rd= req.getRequestDispatcher("s");
    	
    	rd.forward(req,resp);
    	*/
    	//Sessions
    /*HttpSession sess=	 req.getSession();
     sess.setAttribute("info", user);
    resp.sendRedirect("s");*/
    	//Cookies
    	Cookie cook = new Cookie("info", user);
    	resp.addCookie(cook);
    	resp.sendRedirect("s");
    	
    	
}
}
