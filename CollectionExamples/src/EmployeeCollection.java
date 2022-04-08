
import java.util.TreeSet;

public class EmployeeCollection  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       TreeSet<Employee> ts = new TreeSet<Employee>();
       Employee e1 =new Employee("Ramu",24,1072,40000);
       Employee e2 =new Employee("Karthik", 32, 1073,50000);
       Employee e3 =new Employee("Bharath",31, 1077,35000);
       Employee e4 =new Employee("Ashish",29,1087,52000);
            ts.add(e1);
            ts.add(e2);
            ts.add(e3);
            ts.add(e4);
            for(Employee e : ts){
            	System.out.println(e);
            }           
         TreeSet<Employee>ts1= new TreeSet<Employee>(new Helper());
         ts1.add(e1);
         ts1.add(e2);
         ts1.add(e3);
            ts1.add(e4);
            for(Employee e : ts1){
            	System.out.println(e);
            }   
	}

	
	

}
