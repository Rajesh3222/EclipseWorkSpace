package com.Demo.com.learn.hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bike {
	@Id
   int Engine_num;
   String model;
   int cost;
public int getEngine_num() {
	return Engine_num;
}
public void setEngine_num(int engine_num) {
	Engine_num = engine_num;
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
public Bike(int engine_num, String model, int cost) {
	super();
	Engine_num = engine_num;
	this.model = model;
	this.cost = cost;
}
}
