package com.java.base_patterns.structural_patterns.decorator;

public class JuniorPharmacist implements Staff{

    @Override
    public String makeJob() {
        return "Advise patients and sell medical products. \n";
    }
}
