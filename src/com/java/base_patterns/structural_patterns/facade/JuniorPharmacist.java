package com.java.base_patterns.structural_patterns.facade;

public class JuniorPharmacist {

    public void jobOnToday(ToDoList toDoList) {

        if (toDoList.isWorking()) {
            System.out.println("Advise patients and sell medical products");
        } else{
            System.out.println("JuniorPharmacist not in work");
        }
    }
}
