package com.java.base_patterns.behaviorals_patterns.command;

import com.java.base_patterns.behaviorals_patterns.command.tasks.*;

public class TasksForToday {
    public static void main(String[] args) {


        TaskTracker taskTracker = new TaskTracker();

        Worker worker = new Worker(
                new ReceiveGoods(taskTracker),
                new MarkInJournalNewGoods(taskTracker),
                new LayOutTheGoods(taskTracker),
                new Selling(taskTracker),
                new MarkInJournalSold(taskTracker)
        );

        worker.receiveGoodsRecord();
        worker.markInJournalNewGoodsRecord();
        worker.layOutTheGoodsRecord();
        worker.sellingRecord();
        worker.markInJournalSold();
    }
}
