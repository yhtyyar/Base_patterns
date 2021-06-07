package com.java.base_patterns.generative_patterns.builder.medicine;

import com.java.base_patterns.generative_patterns.builder.ChecklistBuilder;
import com.java.base_patterns.generative_patterns.builder.Company;

public class Diclofenac extends ChecklistBuilder {

    @Override
    protected void buildName() {
        checklist.setName("Diclofenac");
    }

    @Override
    protected void buildCompany() {
        checklist.setCompany(Company.RENEWAL);
    }

    @Override
    protected void buildPrice() {
        checklist.setPrice(3);
    }
}
