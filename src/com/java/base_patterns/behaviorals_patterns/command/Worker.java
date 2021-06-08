package com.java.base_patterns.behaviorals_patterns.command;

public class Worker {

    Task receiveGoods;
    Task markInJournalNewGoods;
    Task layOutTheGoods;
    Task selling;
    Task markInJournalSold;


    public Worker(Task receiveGoods, Task markInJournalNewGoods, Task layOutTheGoods, Task selling, Task markInJournalSold) {
        this.receiveGoods = receiveGoods;
        this.markInJournalNewGoods = markInJournalNewGoods;
        this.layOutTheGoods = layOutTheGoods;
        this.selling = selling;
        this.markInJournalSold = markInJournalSold;
    }


    public void receiveGoodsRecord() {
        receiveGoods.execute();
    }

    public  void markInJournalNewGoodsRecord() {
        markInJournalNewGoods.execute();
    }

    public void layOutTheGoodsRecord() {
        layOutTheGoods.execute();
    }

    public void sellingRecord() {
        selling.execute();
    }

    public void markInJournalSold() {
        markInJournalSold.execute();
    }
}
