import java.util.Comparator;

public class Helper implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		// TODO Auto-generated method stub
		if(e1.age>e2.age){
			return 1;
		}
		return -1;
	}

}
