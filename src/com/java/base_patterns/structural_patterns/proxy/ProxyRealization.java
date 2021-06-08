package com.java.base_patterns.structural_patterns.proxy;

public class ProxyRealization implements Realization {

    private final String drugName;
    private Pharmacist pharmacist;
    private boolean recipe;


    public ProxyRealization(String drugName) {
        this.drugName = drugName;

        Pharmacist pharmacist = new Pharmacist(drugName);
        pharmacist.question();
    }


    @Override
    public void selling() {

        if (recipe) {
            pharmacist = new Pharmacist(drugName);
            pharmacist.selling();

        } else {
            System.out.println("Recipe not presented");
        }

    }

    public boolean recipePresented(){

        System.out.println("Recipe presented");
        return recipe = true;
    }
}
