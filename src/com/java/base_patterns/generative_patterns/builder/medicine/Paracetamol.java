package com.java.base_patterns.generative_patterns.builder.medicine;

import com.java.base_patterns.generative_patterns.builder.ChecklistBuilder;
import com.java.base_patterns.generative_patterns.builder.Company;

public class Paracetamol extends ChecklistBuilder {

    @Override
    public void buildName() {
        checklist.setName("Paracetamol");
    }

    @Override
    public void buildCompany() {
        checklist.setCompany(Company.BIOHIMIK);
    }

    @Override
    public void buildPrice() {
        checklist.setPrice(1);
    }
}
