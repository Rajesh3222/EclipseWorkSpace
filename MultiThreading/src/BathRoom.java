
public class BathRoom  implements Runnable{
          public void run(){
        	  try{
        		  System.out.println(Thread.currentThread().getName()+" is entering the bathroom");
        		  Thread.sleep(5000);
        		  System.out.println(Thread.currentThread().getName()+" is using the bathroom");
        		  Thread.sleep(5000);
        		  System.out.println(Thread.currentThread().getName()+"is exiting bathroom");
        		  Thread.sleep(5000);
        	  }
        	  catch(Exception e){
        		  e.printStackTrace();
        	  }
          }
}
