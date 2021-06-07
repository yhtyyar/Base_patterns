package com.java.base_patterns.generative_patterns.abstract_factory;

import com.java.base_patterns.generative_patterns.abstract_factory.just_ambulance.AmbulanceTeamFactory;

public class AmbulanceCall {

    public static void main(String[] args) {

        MedicalTeamFactory medicalTeamFactory = new AmbulanceTeamFactory();

        MedicalSpecialist medicalSpecialist = medicalTeamFactory.getMedicalSpecialist();
        MedicalWorker medicalWorker = medicalTeamFactory.getMedicalWorker();

        System.out.println("Ambulance call...");
        System.out.println("Are ride from hospital...");

        medicalSpecialist.healsThePatient();
        medicalWorker.assistingTheDoctor();
    }
}
