package com.java.base_patterns.behaviorals_patterns.interpreter;

public class SecondCheckingCondition implements Condition{

    @Override
    public boolean experience(String specialty, int year) {
        if (specialty.equalsIgnoreCase("junior pharmacist")){

            if (year >= 5) {
                return true;
            } else {
                return false;
            }
        } else if (specialty.equalsIgnoreCase("pharmacist")) {
            if (year >= 2) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
