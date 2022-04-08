
public class Producer extends Thread {
	Factory ref;
public Producer(Factory ref){
	this.ref=ref;
}

       public void run(){
    	   int j=0;
    	  while(true){
    		  ref.put(++j);
    	  }
       }
}
