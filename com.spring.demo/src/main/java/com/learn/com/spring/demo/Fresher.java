package com.learn.com.spring.demo;

public class Fresher {
       int uid;
       String name;
       int yop;
	public Fresher() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Fresher [uid=" + uid + ", name=" + name + ", yop=" + yop + "]";
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYop() {
		return yop;
	}
	public void setYop(int yop) {
		this.yop = yop;
	}
	public Fresher(int uid, String name, int yop) {
		super();
		this.uid = uid;
		this.name = name;
		this.yop = yop;
	}
}
