package com.java.base_patterns.structural_patterns.facade;

public class Pharmacist {

    public void jobOnToday(ToDoList toDoList) {

        if (toDoList.isWorking()) {
            System.out.println("Advise patients and sell medical products, prepares " +
                    "a prescription medication if necessary.");
        } else {
            System.out.println("Pharmacist not in work");
        }
    }
}
