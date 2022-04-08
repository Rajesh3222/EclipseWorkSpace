package com.LoginPage;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException,IOException {
		// TODO Auto-generated method stub
		String Driver="oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="system" ;
		String password="system";
		String sql ="select  password  from UserDetails where email=?";
		Connection con = null;
		ResultSet rs=null;
		PreparedStatement ps=null;
		String Verification=null;
		Scanner scan= new Scanner(System.in);
try{
	// 1. loading the driver
	Class.forName(Driver);
	//2.Establish connection
	 con =DriverManager.getConnection(url,user ,password);
   ps=	 con.prepareStatement(sql);
	ps.setString(1, "sairajesh078@gmail.com");
	rs=ps.executeQuery();
	String user1=req.getParameter("uname");
	String pw=req.getParameter("pass");
PrintWriter out=resp.getWriter();
while(rs.next()){
	 Verification=rs.getString(1);
	 System.out.println(Verification);

}
System.out.println(pw);
	if(pw.equals(Verification)){
		out.println("Login successfull welcome "+user1);
	}
	else{
		out.println("wrong password");
	}
}
catch(Exception e){
	e.printStackTrace();
}
finally{
	try {
		con.close();
		rs.close();
		ps.close();
		scan.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	}
	}
}
