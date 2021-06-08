package com.java.base_patterns.behaviorals_patterns.command;

public class TaskTracker {

    public void receiveGoods() {
        System.out.println("Received the goods from the supplier.");
    }

    public void markInJournalNewGoods() {
        System.out.println("We mark new products in the magazine.");
    }

    public void layOutTheGoods() {
        System.out.println("We put new products in their places");
    }

    public void selling() {
        System.out.println("We sell goods");
    }

    public void markInJournalSold() {
        System.out.println("We mark in the magazine what  sold");
    }
}
