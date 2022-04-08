import java.util.LinkedList;

public class LinkedaListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   LinkedList ll= new LinkedList();
   ll.add(100);
   ll.add(200);
   ll.add(300);
   ll.add(400);
   ll.addFirst(999);
   ll.addLast(9999);
   System.out.println(ll);
   System.out.println(ll.get(4));
   System.out.println(ll.getFirst());
   System.out.println("peek =>"+ll.peek());
   System.out.println(ll);
   System.out.println("peekFirst=>"+ll.peekFirst());
   System.out.println(ll);
   System.out.println("peekLast=>"+ll.peekLast());
   System.out.println(ll);
   System.out.println("poll=>"+ll.poll());
   System.out.println(ll);
   System.out.println("pollFirst=>"+ll.pollFirst());
   System.out.println(ll);
   System.out.println("pollLast=>"+ll.pollLast());
   System.out.println(ll);
   ll.push(100);
   System.out.println(ll);
   ll.pop();
   System.out.println(ll);
   
   
   
	}

}
