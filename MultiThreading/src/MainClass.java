
public class MainClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("Main activity is started and resources are allocated");
         SubTasks s1= new SubTasks();
         SubTask2 s2= new SubTask2();
         SubTask3 s3= new SubTask3();
         s1.start();
         s2.start();
         s3.start();
        System.out.println(s1.isAlive()); 
        System.out.println(s2.isAlive()); 
         System.out.println(s3.isAlive());
         s1.join();
         s2.join();
         s3.join();
         System.out.println(s1.isAlive()); 
         System.out.println(s2.isAlive()); 
          System.out.println(s3.isAlive());
          System.out.println("Main Activity is ended and resources are deallocated");
         
         
	}

}
