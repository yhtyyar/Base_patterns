package com.java.base_patterns.structural_patterns.bridge.transports;

public class Tanker implements Transport{

    @Override
    public void transportCargo() {
        System.out.println("tanker, because the tanker will deliver the cargo slowly but cheaply. \n");
    }
}
