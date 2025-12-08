package com.tnsif.dependencyinjection;

public class Student {
	
	private int id;
	private String name;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Student() {
		
	}
	
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	void display() {
		System.out.println("Student name is "+name+" id is "+id);
	}
	
	@Override
	public String toString() {
		return "Student info is [id=" + id + ", name=" + name + "]";
	}
	
}