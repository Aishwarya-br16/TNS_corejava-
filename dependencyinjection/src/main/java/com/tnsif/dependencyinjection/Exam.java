package com.tnsif.dependencyinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
	
public class Exam {
	public static void main(String[] args) {
		
		/* Student s= new Student(); 
		 * s.setId(100); 
		 * s.setName("Geetha");
		 * System.out.println(s);
		 */
		
		ApplicationContext c=new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("Configuration is loaded");
		
		Student s1=(Student) c.getBean("student");
		s1.display();
	}
}