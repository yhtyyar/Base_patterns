package com.java.base_patterns.structural_patterns.bridge.transports;

public class CargoAirplane implements Transport{

    @Override
    public void transportCargo() {
        System.out.println("Cargo airplane, because the cargo airplane will deliver the cargo \n" +
                "very quickly but it will be very expensive. \n");
    }
}
