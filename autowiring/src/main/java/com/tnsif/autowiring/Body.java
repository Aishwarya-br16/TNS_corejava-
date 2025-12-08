package com.tnsif.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Body {

	public static void main(String[] args) {

		ApplicationContext c = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("Configuration is loaded");
		Human human = (Human) c.getBean("human");
		human.startPumping();

	}

}