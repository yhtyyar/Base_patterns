package com.java.base_patterns.structural_patterns.facade;

public class WorkingProcess {

    ToDoList toDoList = new ToDoList();
    JobInPharmacy jobInPharmacy = new JobInPharmacy();

    PharmacyManager pharmacyManager = new PharmacyManager();
    Pharmacist pharmacist = new Pharmacist();
    JuniorPharmacist juniorPharmacist = new JuniorPharmacist();

    public void beginningWork() {

        jobInPharmacy.doJob();
        toDoList.startWorking();

        pharmacyManager.jobOnToday(toDoList);
        pharmacist.jobOnToday(toDoList);
        juniorPharmacist.jobOnToday(toDoList);
    }

    public void EndOfTheWorkingDay() {

        jobInPharmacy.endJob();
        toDoList.finishWorking();

        pharmacyManager.jobOnToday(toDoList);
        pharmacist.jobOnToday(toDoList);
        juniorPharmacist.jobOnToday(toDoList);
    }
}
