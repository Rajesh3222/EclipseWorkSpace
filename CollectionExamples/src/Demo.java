import java.util.*;
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           ArrayList al = new ArrayList();
            al.add(10);
            al.add(20);
            al.add(30);
            al.add(40);
            System.out.println(al);
            System.out.println(al.size());
            ArrayList al2= new ArrayList();
            al2.add(10);
            al2.add(20);
            al2.add(300);
            al2.add(400);
            al.retainAll(al2);
            System.out.println(al);
            al.add(2,999);
            al.add(1,1000);
            System.out.println(al);
            al.set(3, 3);
            System.out.println(al);
             
           
	}

}
