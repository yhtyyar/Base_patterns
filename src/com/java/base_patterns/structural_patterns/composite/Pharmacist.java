package com.java.base_patterns.structural_patterns.composite;

public class Pharmacist implements Worker{

    @Override
    public void responsibilities() {
        System.out.println("Pharmacist: Advise patients and sell medical products, \n" +
                "prepares a prescription medication if necessary \n");
    }
}
