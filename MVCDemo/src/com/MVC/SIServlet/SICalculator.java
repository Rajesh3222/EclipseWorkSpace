package com.MVC.SIServlet;




public class SICalculator {
	
	
     public static float Calculator(String name){
			DBHandler obj=new DBHandler();
			int p=obj.fetchP( name);
			int r=obj.fetchR(name);
		int t=obj.fetchT( name);
		float  si=(p*t*r)/100.0f;
		return si;
		}
		
	

	
}
