package com.java.base_patterns.structural_patterns.proxy;

public interface Realization {

    void selling();

    default boolean recipePresented(){

        System.out.println("Recipe not presented");
        return  false;
    }
}
