package com.java.base_patterns.generative_patterns.builder.medicine;

import com.java.base_patterns.generative_patterns.builder.ChecklistBuilder;
import com.java.base_patterns.generative_patterns.builder.Company;

public class Voltaren extends ChecklistBuilder {

    @Override
    protected void buildName() {
        checklist.setName("Voltaren");
    }

    @Override
    protected void buildCompany() {
        checklist.setCompany(Company.BAYER);
    }

    @Override
    protected void buildPrice() {
        checklist.setPrice(15);
    }
}
