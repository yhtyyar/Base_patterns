package com.java.base_patterns.structural_patterns.proxy;

public class Pharmacist implements Realization{

    private String drugName;

    public Pharmacist(String drugName) {
        this.drugName = drugName;
    }

    public void question() {
        System.out.println("The patient asks if there is " + drugName);
    }


    @Override
    public void selling() {
        System.out.println("Selling " + drugName);
    }
}
