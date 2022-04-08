package com.java.serialiazation;

import java.io.Serializable;

public class Student implements Serializable {
   int age;
   String name;
   transient int otp;
public Student(int age, String name, int otp) {
	super();
	this.age = age;
	this.name = name;
	this.otp=otp;
}
public void display(){
	System.out.println(name);
	System.out.println(age);
	System.out.println(otp);
}
}


