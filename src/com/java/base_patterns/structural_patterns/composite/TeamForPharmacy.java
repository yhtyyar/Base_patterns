package com.java.base_patterns.structural_patterns.composite;

import java.util.ArrayList;
import java.util.List;

public class TeamForPharmacy {

    private List<Worker> workers = new ArrayList<>();

    public void addWorker(Worker worker) {
        workers.add(worker);
    }

    public void createPharmacy() {
        System.out.println("Open a new pharmacy...\n");

        for (Worker worker : workers) {
            worker.responsibilities();
        }
    }
}
