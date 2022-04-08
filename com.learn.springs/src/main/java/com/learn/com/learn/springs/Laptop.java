package com.learn.com.learn.springs;

import org.springframework.beans.factory.annotation.Autowired;

public class Laptop {
     /*String model;
     String brand;
     String os;
     MotherBoard mb;
	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Laptop(String model, String brand, String os, MotherBoard mb) {
		super();
		this.model = model;
		this.brand = brand;
		this.os = os;
		this.mb = mb;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	public MotherBoard getMb() {
		return mb;
	}
	public void setMb(MotherBoard mb) {
		this.mb = mb;
	}
	@Override
	public String toString() {
		return "Laptop [model=" + model + ", brand=" + brand + ", os=" + os + ", mb=" + mb + "]";
	}*/

	MotherBoard mb;

	public MotherBoard getMb() {
		return mb;
	}
	
	public void setMb(MotherBoard mb) {
		this.mb = mb;
	System.out.println("Setter method");
	}

	public Laptop(MotherBoard mb) {
		super();
		this.mb = mb;
	System.out.println("parameterized constructor");
	}

	@Override
	public String toString() {
		return "Laptop [mb=" + mb + "]";
	}
	@Autowired
	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("0-Parameterized constructor");
	}
     
}
