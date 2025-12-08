package com.tnsif.springioc1;

public class Jio implements Sim {

    @Override
    public void calling() {
        System.out.println("Calling via Jio Sim card");
    }

    @Override
    public void browsing() {
        System.out.println("Browsing via Jio Sim card");
    }
}