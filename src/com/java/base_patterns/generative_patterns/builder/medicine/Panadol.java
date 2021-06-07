package com.java.base_patterns.generative_patterns.builder.medicine;

import com.java.base_patterns.generative_patterns.builder.ChecklistBuilder;
import com.java.base_patterns.generative_patterns.builder.Company;

public class Panadol extends ChecklistBuilder {

    @Override
    public void buildName() {
        checklist.setName("Panadol");
    }

    @Override
    public void buildCompany() {
        checklist.setCompany(Company.BAYER);
    }

    @Override
    public void buildPrice() {
        checklist.setPrice(10);
    }
}
