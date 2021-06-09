package com.java.base_patterns.behaviorals_patterns.observer;

import java.util.List;

public class Manager implements Observer{

    String name;

    public Manager(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> goods) {

        System.out.println("Dear " + name + "\nWe have changes in stock" + goods +
                "\n=====================================================================================\n");
    }
}
