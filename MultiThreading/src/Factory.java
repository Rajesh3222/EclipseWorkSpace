
public class Factory {
	       int x;
      boolean producedornot=false;
     synchronized  public void put(int i){
    	  try{
    		  if(producedornot==true){
    			  wait();
    		  }
    		  
    			  x=i;
        		  System.out.println("I have put"+x+"in factory");
        		  producedornot=true;
        		  notify();
    		  
    	  }
    	  catch(Exception e){
    		  e.printStackTrace();
    	  }
      }
      synchronized public void get(){
    	  try{
    		  if(producedornot==false){
        		  wait();
        	  }
    			  System.out.println("I have taken"+x+"from the factory");
        		  producedornot=false;
        		  notify();
    		  
    		  
          }
    	  catch(Exception e){
    		  e.printStackTrace();
    	  }
    		  
    	  
    	 
}
}
