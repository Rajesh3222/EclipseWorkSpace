import java.util.Scanner;

public class Demo  extends Thread{

	public void run(){
		if(getName().equals("print")){
			printing();
		}
		else if(getName().equals("mul")){
			multiply();
		}
		else{
			banking();
		}
	}
public void banking(){
	Scanner scan= new Scanner(System.in);
	 System.out.println("Banking Activity started");
     System.out.println("Enter acc no and password");
     int acno=scan.nextInt();
     int pwd=scan.nextInt();
     System.out.println("Banking activity ended");
    
}
public void printing(){
	try{
		System.out.println("printing activity started");
    	for(int i=1;i<=5;i++){
    		System.out.println("Hexagon");
    		Thread.sleep(5000);
    	}
    	System.out.println("Printing activity ended");
    	}
    	catch(Exception e){
    		e.printStackTrace();
    	}
}

public void multiply(){
	try{
		System.out.println("Multiplication activity started");
		int a=123;
		int b=456;
		Thread.sleep(5000);
		int c=a*b;
		System.out.println(c);
		System.out.println("Multiplication activity ended");
	}
	catch(Exception e){
		e.printStackTrace();
			
}
}
}
