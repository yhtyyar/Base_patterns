package com.java.base_patterns.structural_patterns.proxy;

public class WorkInPharmacy {
    public static void main(String[] args) {

        Realization realization = new ProxyRealization("Paracetamol");

        realization.recipePresented();
        realization.selling();



    }
}
