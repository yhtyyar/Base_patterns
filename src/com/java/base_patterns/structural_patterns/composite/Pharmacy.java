package com.java.base_patterns.structural_patterns.composite;

public class Pharmacy {
    public static void main(String[] args) {

        TeamForPharmacy team = new TeamForPharmacy();

        Worker pharmacyManager = new PharmacyManager();
        Worker firstPharmacist = new Pharmacist();
        Worker secondPharmacist = new Pharmacist();
        Worker firstJuniorPharmacist = new JuniorPharmacist();
        Worker secondJuniorPharmacist = new JuniorPharmacist();
        Worker cleaningWoman = new CleaningWoman();

        team.addWorker(pharmacyManager);
        team.addWorker(firstPharmacist);
        team.addWorker(secondPharmacist);
        team.addWorker(firstJuniorPharmacist);
        team.addWorker(secondJuniorPharmacist);
        team.addWorker(cleaningWoman);

        team.createPharmacy();
    }
}
