package com.java.base_patterns.behaviorals_patterns.command.tasks;

import com.java.base_patterns.behaviorals_patterns.command.Task;
import com.java.base_patterns.behaviorals_patterns.command.TaskTracker;

public class LayOutTheGoods implements Task {

    TaskTracker taskTracker;

    public LayOutTheGoods(TaskTracker taskTracker) {
        this.taskTracker = taskTracker;
    }


    @Override
    public void execute() {
        taskTracker.layOutTheGoods();
    }
}
