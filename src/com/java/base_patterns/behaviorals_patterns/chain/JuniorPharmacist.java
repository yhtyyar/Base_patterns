package com.java.base_patterns.behaviorals_patterns.chain;

public class JuniorPharmacist extends Access{

    public JuniorPharmacist(int securityLevel) {
        super(securityLevel);
    }

    @Override
    protected void write(String accessRequest) {
        System.out.println( accessRequest + ". Has access to a regular storage room");
    }
}
