package com.AishwaryaBR.assignment.employees;

public class Employee {
	 private String name;
	 private String employeeId;
	 private double salary;
	 
	 public Employee(String name, String employeeId, double salary) {
	        this.name = name;
	        this.employeeId = employeeId;
	        this.salary = salary;
	  }
	 
	 public String getName() {
	        return name;
	  }
	 
	 public String getEmployeeId() {
	        return employeeId;
	 }
	 
	 public double getSalary() {
	        return salary;
	 }
	 
	 public void setName(String name) {
	        this.name = name;
	 }
	 
	 public void setSalary(double salary) {
	        if (salary >= 0) {
	            this.salary = salary;
	        } else {
	            System.err.println("Salary cannot be negative.");
	        }
	 }
	 
	    public String toString() {
	        return "Employee [ID: " + employeeId + ", Name: " + name + ", Salary: $" + String.format("%.2f", salary) + "]";
	    }
	}
	 



