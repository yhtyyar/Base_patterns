package com.java.base_patterns.generative_patterns.builder;

public abstract class ChecklistBuilder {

    protected Checklist checklist;

    void createChecklist() {
        checklist = new Checklist();
    }

    protected abstract void buildName();
    protected abstract void buildCompany();
    protected abstract void buildPrice();

    Checklist getChecklist() {
        return checklist;
    }
}
