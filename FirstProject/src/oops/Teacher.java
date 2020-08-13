package oops;

import java.util.ArrayList;

public class Teacher {
	
	private short id; 
	private String name; 
	private ArrayList<String> courses;
	private Address address;
	
	
	public Teacher(int id, String name, ArrayList<String> courses) {
		this.id = (short) id;
		this.name = name;
		this.courses = courses;
	}
	public short getId() {
		return id;
	}
	public void setId(short id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<String> getCourses() {
		return courses;
	}
	public void setCourses(ArrayList<String> courses) {
		this.courses = courses;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", courses=" + courses + "]";
	}
	
	
	
	
}
