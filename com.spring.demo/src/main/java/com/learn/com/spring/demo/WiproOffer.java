package com.learn.com.spring.demo;

public class WiproOffer {
      String designation;
      int salary;
	public WiproOffer(String designation, int salary) {
		super();
		
		this.designation = designation;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "WiproOffer [designation=" + designation + ", salary=" + salary + "]";
	}
	public WiproOffer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
}
