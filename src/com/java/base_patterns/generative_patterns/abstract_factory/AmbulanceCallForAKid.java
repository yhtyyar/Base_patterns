package com.java.base_patterns.generative_patterns.abstract_factory;

import com.java.base_patterns.generative_patterns.abstract_factory.children_s_ambulance.Childern_sAmbulanceFactory;

public class AmbulanceCallForAKid {

    public static void main(String[] args) {

        MedicalTeamFactory medicalTeamFactory = new Childern_sAmbulanceFactory();

        MedicalSpecialist medicalSpecialist = medicalTeamFactory.getMedicalSpecialist();
        MedicalWorker medicalWorker = medicalTeamFactory.getMedicalWorker();

        System.out.println("Ambulance call for a kid ...");
        System.out.println("Are ride from hospital...");

        medicalSpecialist.healsThePatient();
        medicalWorker.assistingTheDoctor();
    }

}
