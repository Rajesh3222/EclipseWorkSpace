package com.BookMyShow;

import java.util.*;
import java.util.Scanner;

public class MovieTicketsApp {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter total no of tickets");
		int t_tickets=scan.nextInt();
		System.out.println("Enter list of people with number of tickets they are going to purchase :");
		System.out.println("Type any non integer value to quit");
		List<Integer> peopleWithTickets=new ArrayList<Integer>();
		int val=0;
		while (scan.hasNextInt()) {
			 val =scan.nextInt();
			peopleWithTickets.add(val);
		}
	TicketsCalculation(t_tickets,peopleWithTickets);

	}


	public static void TicketsCalculation( int t_tickets,  List people){
		int bookedPeople=0;
		int peopleWithMoreTickets=0;
		 int count=0;
		 int count1=0;
		int tickets[]=new int[people.size()];
		for(int i=0; i<people.size();i++){
			tickets[i]=(Integer)people.get(i);
		}
	 
		 for(int i=0; i<tickets.length;i++) {
			 count=count+tickets[i];
			 if(count<=t_tickets || count1<t_tickets  ){
				 bookedPeople++;
				 if(tickets[i]> 1 && count<=t_tickets ){
					 peopleWithMoreTickets++;
					
				 }
				count1=count;
			 } 
			
			 }
			 
		 
	  
	   System.out.println("No of customers booked the ticket: "+bookedPeople);
	   System.out.println("No of customers booked more than one ticket: "+peopleWithMoreTickets);
	}
	}

