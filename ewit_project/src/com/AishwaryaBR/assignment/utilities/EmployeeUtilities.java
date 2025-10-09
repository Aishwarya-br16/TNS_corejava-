package com.AishwaryaBR.assignment.utilities;

import com.AishwaryaBR.assignment.employees.Employee;

public class EmployeeUtilities {
	private EmployeeUtilities() {
	}
	public static double calculateBonus(Employee employee, double percentage) {
	        if (employee == null || percentage < 0) {
	            return 0.0;
	        }
	        double bonus = employee.getSalary() * percentage;
	        System.out.println(employee.getName() + " is receiving a bonus of $" + String.format("%.2f", bonus));
	        return bonus;
	}
	 public static void giveRaise(Employee employee, double amount) {
	        if (employee != null && amount > 0) {
	            double currentSalary = employee.getSalary();
	            employee.setSalary(currentSalary + amount); // Using the public setter
	            System.out.println(employee.getName() + " received a raise of $" + String.format("%.2f", amount) + ".");
	            System.out.println("New Salary: $" + String.format("%.2f", employee.getSalary()));
	        } else {
	            System.err.println("Cannot give a non-positive raise.");
	        }
	    }
	  static void displayKeyInfo(Employee employee) {
	        if (employee != null) {
	            System.out.println("--- Key Info (Internal Utility) ---");
	            System.out.println("ID: " + employee.getEmployeeId());
	            System.out.println("Name: " + employee.getName());
	            System.out.println("-----------------------------------");
	        }
	  }
}
	


