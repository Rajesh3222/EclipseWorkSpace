
public class Warrior extends Thread {
      String res1="Sarpastra";
      String res2="Garudastra";
      String res3="Pasupatastra";
      public void run(){
    	  if(getName().equals("karna")){
    		  karnaacqResource();
    	  }
    	  else{
    		  arjunaacqResource();
    	  }
      }
    	  public void karnaacqResource(){
    		  try{
    			  Thread.sleep(2000);
    			  synchronized (res1){
    				  System.out.println("Karna acquired sarpastra");
    				  Thread.sleep(2000);
    				  synchronized (res2){
    					  System.out.println("karna acquired Garudastra");
    					  Thread.sleep(2000);
    					  synchronized (res3){
    						  System.out.println("karna acquired Pasupatastra");
    						  Thread.sleep(2000);
    					  }
    				  }
    			  }
    		  }
    		  catch(Exception e){
    			  e.printStackTrace();
    		  }
    	  }
    	  public void arjunaacqResource(){
    		  try{
    			  Thread.sleep(2000);
    			  synchronized (res3){
    				  System.out.println("Arjuna acquired Pasupatastra");
    				  Thread.sleep(2000);
    				  synchronized (res2){
    					  System.out.println("Arjuna acquired Garudastra");
    					  Thread.sleep(2000);
    					  synchronized (res1){
    						  System.out.println("Arjuna acquired Sarpastra");
    						  Thread.sleep(2000);
    					  }
    				  }
    			  }
    		  }
    		  catch(Exception e){
    			  e.printStackTrace();
    		  }
    	  }
    	
    	  }
    		  
      

