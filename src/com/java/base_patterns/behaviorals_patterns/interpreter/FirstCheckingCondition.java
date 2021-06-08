package com.java.base_patterns.behaviorals_patterns.interpreter;

public class FirstCheckingCondition implements Condition {

    private final Condition condition1;
    private final Condition condition2;

    public FirstCheckingCondition(Condition condition1, Condition condition2) {
        this.condition1 = condition1;
        this.condition2 = condition2;
    }

    @Override
    public boolean checking(String specialty) {

        return condition1.checking(specialty) || condition2.checking(specialty);
    }

}
