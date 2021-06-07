package com.java.base_patterns.generative_patterns.abstract_factory.children_s_ambulance;

import com.java.base_patterns.generative_patterns.abstract_factory.MedicalSpecialist;
import com.java.base_patterns.generative_patterns.abstract_factory.MedicalTeamFactory;
import com.java.base_patterns.generative_patterns.abstract_factory.MedicalWorker;

public class Childern_sAmbulanceFactory implements MedicalTeamFactory {

    @Override
    public MedicalSpecialist getMedicalSpecialist() {
        return new Pediatrician();
    }

    @Override
    public MedicalWorker getMedicalWorker() {
        return new ParamedicFromPediatrics();
    }
}
