package com.tnsif.firstpackage;

public class Person {
	private String personName;
	protected int personAge;
	String personCity;
	
	//Go to Source Generate Getters and Setters Select all
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName=personName;
	}
	public int getPersonAge() {
		return personAge;
	}
	public void setPersonAge(int personAge) {
		this.personAge=personAge;
	}
	public String getPersonCity() {
		return personCity;
	}
	public void setPersonCity(String personCity) {
		this.personCity=personCity;
	}
	
	void display() {
		System.out.println(personName+" "+personAge+" "+personCity);
	}	
}