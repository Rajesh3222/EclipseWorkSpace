package com.AttendanceApp;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Assignment1 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the name of the person to know the attendance");
		String personName=scan.next();
	

		String jsonfile = "C:/Users/rbudamgu/Downloads/AttendanceRegister (1).json";
		JSONParser jsonParser = new JSONParser();
		try (FileReader reader = new FileReader(jsonfile)) {
			Object obj = jsonParser.parse(reader);
		JSONArray	 employeeList = (JSONArray) obj;
			EmployeeAttendance(employeeList, personName);

		}

		catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		catch (IOException e) {

			e.printStackTrace();
		} 
		catch (ParseException e) {
			e.printStackTrace();
		}
	}


	public static void EmployeeAttendance(JSONArray employeeList, String personName){
		System.out.println("Total Attendance of  "+personName+": ");
		for (int i = 0; i < employeeList.size(); i++) {
			JSONObject empinfo = (JSONObject) employeeList.get(i);
		
			if(personName.equals((String)empinfo.get("employeName"))){
				String name = (String) empinfo.get("employeName");
				String checkintime = (String) empinfo.get("checkinTime");
				String checkouttime = (String) empinfo.get("checkouttime");
				String date = (String) empinfo.get("date");
			     String dept =(String)empinfo.get("dept");
			    String checkinArray[]=checkintime.split(":");
			   String  checkoutArray[]=(checkouttime.split(":"));
			   int checkin=Integer.parseInt(checkinArray[0]);
			   int checkout=Integer.parseInt(checkoutArray[0]);
			   int totalhours=0;
			    totalhours=checkout-checkin;
				
			    System.out.println("PersonName: "+name+"  "+"checkintime: "+checkintime+"  "+"checkouttime: "+checkouttime+"  "+"date: "+date+"  "+"totalhours: "+totalhours);
			}
	   }
		
		
	}
}
