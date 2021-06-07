package com.java.base_patterns.structural_patterns.facade;

public class ToDoList {

    private boolean working;

    public boolean isWorking() {
        return working;
    }

    public void startWorking() {
        System.out.println("Working day has begun");
        working = true;
    }

    public void finishWorking() {
        System.out.println("Working day has finished");
        working = false;
    }
}
