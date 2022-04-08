package com.java.serialiazation;



import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class StudentApp {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        Student s= new Student(30,"sai", 3334);
        String path="D:/JavaIO/Student.txt";
        FileOutputStream fos= new FileOutputStream(path);
        ObjectOutputStream oos= new ObjectOutputStream(fos);
        oos.writeObject(s);
	}

}
