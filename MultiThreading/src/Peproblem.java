
public class Peproblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Factory f= new Factory();
            new Producer(f).start();
            new Consumer(f).start();
	}

}
