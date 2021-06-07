package com.java.base_patterns.structural_patterns.composite;

public class CleaningWoman implements Worker{

    @Override
    public void responsibilities() {
        System.out.println("CleaningWoman: Cleaning of premises every day at lunchtime and " +
                "after the closing of the pharmacy\n");
    }
}
