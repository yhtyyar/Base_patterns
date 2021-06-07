package com.java.base_patterns.generative_patterns.abstract_factory.ambulance_resuscitation;

import com.java.base_patterns.generative_patterns.abstract_factory.MedicalSpecialist;
import com.java.base_patterns.generative_patterns.abstract_factory.MedicalTeamFactory;
import com.java.base_patterns.generative_patterns.abstract_factory.MedicalWorker;

public class AmbulanceResuscitationFactory implements MedicalTeamFactory {
    @Override
    public MedicalSpecialist getMedicalSpecialist() {
        return new Resuscitator();
    }

    @Override
    public MedicalWorker getMedicalWorker() {
        return new ParamedicFromResuscitation();
    }
}
