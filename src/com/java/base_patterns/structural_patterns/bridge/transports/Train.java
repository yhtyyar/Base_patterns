package com.java.base_patterns.structural_patterns.bridge.transports;

public class Train implements Transport{

    @Override
    public void transportCargo() {
        System.out.println("train, because train is the safest delivery option, but railways are not built everywhere. \n");
    }
}
