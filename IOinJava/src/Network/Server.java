package Network;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Server extends Thread {
	public static void main(String[] args) {
		Server s= new Server();
		s.start();
	}

	public  void run(){
		// TODO Auto-generated method stub
		try{
			 Scanner scan  = new Scanner(System.in);
			ServerSocket ss = new ServerSocket(4000);
		      System.out.println("Server is ready");
		            Socket s= ss.accept();
		            System.out.println("Request accepted by Server");
		            InputStream is = s.getInputStream();
		            DataInputStream dis= new DataInputStream(is);
		            
		            OutputStream  os = s.getOutputStream();
			          DataOutputStream dos = new DataOutputStream(os);
			     
			         
		        	for (;;){
		        		String msg=  dis.readUTF();
		        	      System.out.println(msg);
		        	      if(msg.toLowerCase().equals("quit")==true){
		        	    	  System.exit(0);
		        	      }
		        		  System.out.println("Enter the msg for client");
		        		  msg=scan.nextLine();
		        		     dos.writeUTF(msg);
		        		   
		        
		          
		      
		        	
		          System.out.println(" Do you wanna Enter more messages?");
			      System.out.println("If you want to exit Enter Quit"); 
		        }
		        	 
		}
		catch(Exception e){
    		e.printStackTrace();
    	}
}
	

}
		         
		         
		        
	          
		        	
	


