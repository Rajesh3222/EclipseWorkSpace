package com.MVC.SIServlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBHandler {
	String driver="oracle.jdbc.driver.OracleDriver";
	String url ="jdbc:oracle:thin:@localhost:1521:xe";
	String user="system";
	String password="system";
	Connection con=null;
	ResultSet rs=null;
	Statement s=null;
	public int fetchT(String name) {
		// TODO Auto-generated method stub
	           int t=0;
		String sql="select time from Loan_Data where Name ='"+name+"'";
       try{
    	 Class.forName(driver);
    	 con=DriverManager.getConnection(url,user, password);
    	s= con.createStatement();
    	rs=s.executeQuery(sql);
    	rs.next();
    	t=rs.getInt(1);
    	
       }
       catch(Exception e){
    	   e.printStackTrace();
       }
       return t;
	}

	public  int fetchR(String name) {
		// TODO Auto-generated method stub
	    int r=0;
			String sql="select rate from Loan_Data where Name ='"+name+"'";
	       try{
	    	 Class.forName(driver);
	    	 con=DriverManager.getConnection(url,user, password);
	    	s= con.createStatement();
	    	rs=s.executeQuery(sql);
	    	rs.next();
	    	r=rs.getInt(1);
	    	
	    	
	       }
	       catch(Exception e){
	    	   e.printStackTrace();
	       }
	       return r;
		}
	

	public   int fetchP(String name) {
		// TODO Auto-generated method stub
		 int p=0;
			String sql="select principal from Loan_Data where Name ='"+name+"'";
	       try{
	    	 Class.forName(driver);
	    	 con=DriverManager.getConnection(url,user, password);
	    	s= con.createStatement();
	    	rs=s.executeQuery(sql);
	    	rs.next();
	    	p=rs.getInt(1);
	    	
	    	
	       }
	       catch(Exception e){
	    	   e.printStackTrace();
	       }
	       return p;
		}
	

}	
