package com.java.base_patterns.behaviorals_patterns.chain;

public class Pharmacist extends Access{

    public Pharmacist(int securityLevel) {
        super(securityLevel);
    }

    @Override
    protected void write(String accessRequest) {
        System.out.println(accessRequest + ". Has access to the room where explosive, explosive and " +
                "flammable substances are stored");
    }
}
