package com.Demo.com.learn.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

public class Students {
	@Id
       int rollno;
       String name;
      String branch;
      
       int yop;
	public Students(int rollno, String name, String branch, int yop) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.branch = branch;
		this.yop = yop;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getbranch() {
		return branch;
	}
	public void setbranch(String branch) {
		this.branch = branch;
	}
	public int getYop() {
		return yop;
	}
	public void setYop(int yop) {
		this.yop = yop;
	}
       
}
