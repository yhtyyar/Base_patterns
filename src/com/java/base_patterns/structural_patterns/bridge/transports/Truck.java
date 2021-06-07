package com.java.base_patterns.structural_patterns.bridge.transports;

public class Truck implements Transport{

    @Override
    public void transportCargo() {
        System.out.println("truck, because the truck will deliver the cargo relatively quickly and inexpensively. \n");
    }
}
