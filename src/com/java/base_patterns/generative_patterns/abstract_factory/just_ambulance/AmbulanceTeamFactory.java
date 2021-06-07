package com.java.base_patterns.generative_patterns.abstract_factory.just_ambulance;

import com.java.base_patterns.generative_patterns.abstract_factory.MedicalSpecialist;
import com.java.base_patterns.generative_patterns.abstract_factory.MedicalTeamFactory;
import com.java.base_patterns.generative_patterns.abstract_factory.MedicalWorker;

public class AmbulanceTeamFactory implements MedicalTeamFactory {

    @Override
    public MedicalSpecialist getMedicalSpecialist() {
        return new Therapist();
    }

    @Override
    public MedicalWorker getMedicalWorker() {
        return new Paramedic();
    }
}
