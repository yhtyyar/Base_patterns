package com.java.base_patterns.generative_patterns.abstract_factory;

public interface MedicalTeamFactory {

    MedicalSpecialist getMedicalSpecialist();

    MedicalWorker getMedicalWorker();
}
