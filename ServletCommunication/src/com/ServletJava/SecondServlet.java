package com.ServletJava;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SecondServlet extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
          /*String info=  (String)req.getAttribute("info");
          );PrintWriter out;
          out=resp.getWriter();
          out.print("welcome "+info)
		HttpSession sess= req.getSession();
		String info =(String)sess.getAttribute("info");
		PrintWriter out;
        out=resp.getWriter();
        out.print("welcome "+info);
		*/
		Cookie[] cooks=req.getCookies();
		String info="";
	for(Cookie c: cooks){
		if(c.getName().equals("info")){
			info=c.getValue();
			}
	}
	PrintWriter out;
    out=resp.getWriter();
    out.print("welcome "+ info);
    
    
	}

}
