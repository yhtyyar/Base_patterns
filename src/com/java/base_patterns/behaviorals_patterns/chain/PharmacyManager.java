package com.java.base_patterns.behaviorals_patterns.chain;

public class PharmacyManager extends Access{

    public PharmacyManager(int securityLevel) {
        super(securityLevel);
    }

    @Override
    protected void write(String accessRequest) {
        System.out.println(accessRequest + ". Has access to premises where narcotic drugs are stored");
    }
}
