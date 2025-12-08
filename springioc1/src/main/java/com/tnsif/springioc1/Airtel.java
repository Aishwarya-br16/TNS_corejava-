package com.tnsif.springioc1;

public class Airtel implements Sim {

    @Override
    public void calling() {
        System.out.println("Calling via Airtel Sim card");
    }

    @Override
    public void browsing() {
        System.out.println("Browsing via Airtel Sim card");
    }
}