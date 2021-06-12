package com.java.base_patterns.behaviorals_patterns.interpreter;

public class FirstCheckingCondition implements FirstCondition {

    private final FirstCondition condition1;
    private final FirstCondition condition2;

    public FirstCheckingCondition(FirstCondition condition1, FirstCondition condition2) {
        this.condition1 = condition1;
        this.condition2 = condition2;
    }

    @Override
    public boolean checking(String specialty) {

        return condition1.checking(specialty) || condition2.checking(specialty);
    }

}
