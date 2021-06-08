package com.java.base_patterns.behaviorals_patterns.interpreter;

public interface Condition {

    default  boolean checking(String specialty){
        return false;
    }

    default boolean experience(String speciality, int year){
        return false;
    }
}
