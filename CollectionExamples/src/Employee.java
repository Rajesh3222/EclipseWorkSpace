import java.lang.Comparable;
public class Employee  implements Comparable<Employee>{
       String name;
       int age;
       int isn;
       int salary;
	public Employee(String name, int age, int isn, int salary) {
		super();
		this.name = name;
		this.age = age;
		this.isn = isn;
		this.salary = salary;
	}
    
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getIsn() {
		return isn;
	}

	public void setIsn(int isn) {
		this.isn = isn;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int compareTo(Employee emp) {
		// TODO Auto-generated method stub
		return this.getName().compareTo(emp.getName());
	}
	public String toString() {
		return  name +"   "+age +"   " +"   " +isn+"   "  +salary ;
	}
	
}


	
