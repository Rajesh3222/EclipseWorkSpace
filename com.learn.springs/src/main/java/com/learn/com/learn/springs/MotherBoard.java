package com.learn.com.learn.springs;

public class MotherBoard {
     int chip_id;
     String brand;
	public int getChip_id() {
		return chip_id;
	}
	public void setChip_id(int chip_id) {
		this.chip_id = chip_id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
		
	}
	public MotherBoard(int chip_id, String brand) {
		super();
		this.chip_id = chip_id;
		this.brand = brand;
	
	}
	public MotherBoard() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "MotherBoard [chip_id=" + chip_id + ", brand=" + brand + "]";
	}
}
