package com.learn.com.spring.demo;

/*import java.util.*;*/

public class Fresher1 {
      /* String name;
       List<String> bikes;
       Set<String> contacts;
       @Override
	public String toString() {
		return "Fresher1 [name=" + name + ", bikes=" + bikes + ", contacts=" + contacts + ", courses=" + courses + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getBikes() {
		return bikes;
	}
	public void setBikes(List<String> bikes) {
		this.bikes = bikes;
	}
	public Set<String> getContacts() {
		return contacts;
	}
	public void setContacts(Set<String> contacts) {
		this.contacts = contacts;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
	Map<String, String>courses;
	public Fresher1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Fresher1(String name, List<String> bikes, Set<String> contacts, Map<String, String> courses) {
		super();
		this.name = name;
		this.bikes = bikes;
		this.contacts = contacts;
		this.courses = courses;
	}*/
	String uid;
	String name;
	WiproOffer off;
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public WiproOffer getOff() {
		return off;
	}
	public void setOff(WiproOffer off) {
		this.off = off;
	}
	public Fresher1(String uid, String name, WiproOffer off) {
		super();
		this.uid = uid;
		this.name = name;
		this.off = off;
	}
	public Fresher1() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Fresher1 [uid=" + uid + ", name=" + name + ", off=" + off + "]";
	}
       
}
