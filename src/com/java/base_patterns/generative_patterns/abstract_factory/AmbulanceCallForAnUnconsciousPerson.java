package com.java.base_patterns.generative_patterns.abstract_factory;

import com.java.base_patterns.generative_patterns.abstract_factory.ambulance_resuscitation.AmbulanceResuscitationFactory;

public class AmbulanceCallForAnUnconsciousPerson {

    public static void main(String[] args) {

        MedicalTeamFactory medicalTeamFactory = new AmbulanceResuscitationFactory();

        MedicalSpecialist medicalSpecialist = medicalTeamFactory.getMedicalSpecialist();
        MedicalWorker medicalWorker = medicalTeamFactory.getMedicalWorker();

        System.out.println("Calling an ambulance for an unconscious person...");
        System.out.println("Are ride from hospital...");

        medicalSpecialist.healsThePatient();
        medicalWorker.assistingTheDoctor();
    }
}
