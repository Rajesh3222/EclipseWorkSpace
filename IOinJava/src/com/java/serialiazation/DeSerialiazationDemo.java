package com.java.serialiazation;

import java.io.FileInputStream;

import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerialiazationDemo {

	public static void main(String[] args) throws IOException, Throwable {
		// TODO Auto-generated method stub
		 String path="D:/JavaIO/Student.txt";
           FileInputStream fis= new FileInputStream(path);
           ObjectInputStream ois=new ObjectInputStream(fis);
           Student obj =(Student)ois.readObject();
           obj.display();
	}

}
