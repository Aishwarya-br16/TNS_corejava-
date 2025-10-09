package com.AishwaryaBR.assignment.employees;

public class Manager extends  Employee {
	 private String department;
	 
	 public Manager(String name, String employeeId, double salary, String department) {
	        super(name, employeeId, salary);
	        this.department = department;
	  }
	 
	 public String getDepartment() {
	        return department;
	 }
	 public void setDepartment(String department) {
	        this.department = department;
	 }
	 public String toString() {
	        return super.toString().replace("]", ", Role: Manager, Department: " + department + "]");
	  }
	 
}
