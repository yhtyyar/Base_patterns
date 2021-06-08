package com.java.base_patterns.structural_patterns.flyweight;

public class PharmacyManager implements Staff{

    @Override
    public void doJob() {
        System.out.println("Pharmacy Manager: Manage Pharmacy and orders a new batch of drugs.\n");
    }
}
