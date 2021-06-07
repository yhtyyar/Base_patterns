package com.java.base_patterns.generative_patterns.builder;

public class Aggregator {

    ChecklistBuilder checklistBuilder;

    public void setBuilder(ChecklistBuilder builder) {

        checklistBuilder = builder;
    }

    Checklist buildChecklist() {

        checklistBuilder.createChecklist();
        checklistBuilder.buildName();
        checklistBuilder.buildCompany();
        checklistBuilder.buildPrice();

        Checklist checklist = checklistBuilder.getChecklist();

        return checklist;
    }
}
