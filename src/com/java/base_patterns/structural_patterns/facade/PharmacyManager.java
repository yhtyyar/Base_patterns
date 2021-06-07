package com.java.base_patterns.structural_patterns.facade;

public class PharmacyManager {

    public void  jobOnToday(ToDoList toDoList) {

        if (toDoList.isWorking()) {
            System.out.println("Manage Pharmacy. ");
        } else {
            System.out.println("Orders a new batch of drugs and then leaves work.");
        }
    }
}
