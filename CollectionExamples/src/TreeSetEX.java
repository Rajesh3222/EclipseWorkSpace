import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class TreeSetEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          CopyOnWriteArrayList ts= new CopyOnWriteArrayList()   ;    
          ts.add(10);
          ts.add(20);
          ts.add(30);
          ts.add(40);
          ts.add(50);
          ts.add(60);
          int elem=61;
                Iterator itr=  ts.iterator();
                 while(itr.hasNext()==true){
                	 System.out.println(itr.next());
                	 ts.add(elem++);
                 }
                 System.out.println(ts);
         /*System.out.println(ts);
          System.out.println(ts.headSet(125));
          System.out.println(ts.tailSet(125));
          System.out.println(ts.ceiling(125));
          System.out.println(ts.floor(125));
          System.out.println(ts.higher(125));
          System.out.println(ts.lower(125));*/
	}

}
