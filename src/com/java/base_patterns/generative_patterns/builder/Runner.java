package com.java.base_patterns.generative_patterns.builder;

import com.java.base_patterns.generative_patterns.builder.medicine.*;

public class Runner {
    public static void main(String[] args) {

        Aggregator aggregator = new Aggregator();


        aggregator.setBuilder(new Diclofenac());
        Checklist checklist = aggregator.buildChecklist();
        System.out.println(checklist);

        aggregator.setBuilder(new Panadol());
        Checklist checklist2 = aggregator.buildChecklist();
        System.out.println(checklist2);

        aggregator.setBuilder(new Paracetamol());
        Checklist checklist3 = aggregator.buildChecklist();
        System.out.println(checklist3);

        aggregator.setBuilder(new Voltaren());
        Checklist checklist4 = aggregator.buildChecklist();
        System.out.println(checklist4);
    }
}
