package com.learn.hibernate3.OnetoOneMapping;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;



@Entity
public class Students {
	@Id
     int rollno;
     String name;
     String Stream;
     int yop;
     @ManyToMany
   List<Bikes>bike;
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
	public String getStream() {
		return Stream;
	}
	public void setStream(String stream) {
		Stream = stream;
	}
	public int getYop() {
		return yop;
	}
	public void setYop(int yop) {
		this.yop = yop;
	}
	public List<Bikes> getBike() {
		return bike;
	}
	public void setBike(List<Bikes> bike) {
		this.bike = bike;
	}
	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Students(int rollno, String name, String stream, int yop, List<Bikes> bike) {
		super();
		this.rollno = rollno;
		this.name = name;
		Stream = stream;
		this.yop = yop;
		this.bike = bike;
	}
	
    

     
}
