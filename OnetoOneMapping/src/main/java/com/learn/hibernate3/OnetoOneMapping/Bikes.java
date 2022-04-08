package com.learn.hibernate3.OnetoOneMapping;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;




@Entity
public class Bikes {
	@Id
     int Engine_NO;
     String model;
     int cost;
     @ManyToMany
     List<Students>StList;
	public int getEngine_NO() {
		return Engine_NO;
	}
	public void setEngine_NO(int engine_NO) {
		Engine_NO = engine_NO;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public List<Students> getStList() {
		return StList;
	}
	public void setStList(List<Students> stList) {
		StList = stList;
	}
	public Bikes(int engine_NO, String model, int cost, List<Students> stList) {
		super();
		Engine_NO = engine_NO;
		this.model = model;
		this.cost = cost;
		StList = stList;
	}
	public Bikes() {
		super();
		// TODO Auto-generated constructor stub
	}

}