
public class ProblemDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
               BathRoom b= new BathRoom();
               Thread t1= new Thread(b);
               Thread t2= new Thread(b);
               Thread t3= new Thread(b);
               t1.setName("Boy");
               t2.setName("girl");
               t3.setName("other");
               t1.start();
               t2.start();
               t3.start();
	}

}
