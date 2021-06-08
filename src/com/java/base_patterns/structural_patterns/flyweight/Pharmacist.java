package com.java.base_patterns.structural_patterns.flyweight;

public class Pharmacist implements Staff{

    @Override
    public void doJob() {
        System.out.println("Pharmacist: Advise patients and sell medical products, prepares  \n" +
                "a prescription medication if necessary.\n");
    }
}
