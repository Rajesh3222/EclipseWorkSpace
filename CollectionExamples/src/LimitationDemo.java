import java.util.ArrayDeque;

public class LimitationDemo {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		ArrayDeque ad = new ArrayDeque<>();
		ad.add(100);
		ad.add(200);
		ad.add(300);
		ad.add(400);
		ad.addFirst(999);
		System.out.println(ad);
		System.out.println(ad.getFirst());
		ad.addLast(9999);
		System.out.println(ad);
		

	}

}
