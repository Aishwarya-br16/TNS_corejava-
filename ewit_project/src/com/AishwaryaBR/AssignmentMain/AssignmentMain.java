package com.AishwaryaBR.AssignmentMain;
import com.AishwaryaBR.assignment.employees.Manager;
import com.AishwaryaBR.assignment.employees.Developer;
import com.AishwaryaBR.assignment.employees.Employee;
import com.AishwaryaBR.assignment.utilities.EmployeeUtilities;

public class AssignmentMain {

	public static void main(String[] args) {
		System.out.println("--- Employee Management System Demo ---");
		
		Manager manager = new Manager("Alice Johnson", "M1001", 120000.00, "Human Resources");
        Developer developer = new Developer("Bob Smith", "D2002", 95000.00, "Java");

        System.out.println("\n--- Initial Employee Details ---");
        System.out.println(manager);
        System.out.println(developer);

    

        System.out.println("\n--- Performing Operations with EmployeeUtilities ---");
        System.out.println("\n*** Manager Raise ***");
        EmployeeUtilities.giveRaise(manager, 5000.00);

       
        System.out.println("\n*** Developer Bonus ***");
        EmployeeUtilities.calculateBonus(developer, 0.05); // 5% bonus

        
        developer.setProgrammingLanguage("Python");

        System.out.println("\n--- Final Employee Details ---");
        System.out.println(manager);
        System.out.println(developer);

        
        System.out.println("\nManager's new salary (via public getter): $" + String.format("%.2f", manager.getSalary()));

        
    }
}
		




