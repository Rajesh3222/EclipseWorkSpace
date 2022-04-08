
public class SubTask3 extends Thread {
	public void run(){
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
