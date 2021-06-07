package com.java.base_patterns.structural_patterns.composite;

public class PharmacyManager implements Worker{

    @Override
    public void responsibilities() {
        System.out.println("PharmacyManager: Monitor the work of pharmacists and order batches of medicine \n");
    }
}
