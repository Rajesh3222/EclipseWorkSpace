package Network;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client extends Thread {
	public static void main(String[] args) {
		Client c= new Client();
		c.start();
	}

	public void run() {
		// TODO Auto-generated method stub
		try{
			 Socket s= new Socket("127.0.0.1",4000);
			 
		      System.out.println("Request sent to Server");
		      OutputStream  os = s.getOutputStream();
		      DataOutputStream dos = new DataOutputStream(os);
		      Scanner scan = new Scanner(System.in);
		      InputStream is = s.getInputStream();
				DataInputStream dis=new DataInputStream(is);
		      for(;;){
		      System.out.println("Enter the msg for Server");
		    
		      String msg=scan.nextLine();
		      if(msg.toLowerCase().equals("quit")==true){
		    	  System.exit(0);
		      }
		      dos.writeUTF(msg);
				
				 msg=dis.readUTF();
		    System.out.println(msg);
			      
		      System.out.println(" Do you wanna Enter more messages?");
		      System.out.println("If you want to exit Enter Quit"); 
		      }
				
		}
		      catch(Exception e){
		    	  e.printStackTrace();
		      }
			
		}
     
	}


