package com.tnsif.springioc1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

    public static void main(String[] args) {

        // Airtel obj = new Airtel();
        // obj.calling();

        ApplicationContext c = new ClassPathXmlApplicationContext("beans.xml");
        System.out.println("Configuration is loaded");

        Airtel a = (Airtel) c.getBean("airtel");
        a.browsing();
        a.calling();
        
        System.out.println();
        
        Jio j = (Jio) c.getBean("jio");
        j.browsing();
        j.calling();
    }
}