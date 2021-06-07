package com.java.base_patterns.generative_patterns.abstract_factory.ambulance_resuscitation;

import com.java.base_patterns.generative_patterns.abstract_factory.MedicalWorker;

public class ParamedicFromResuscitation implements MedicalWorker {
    @Override
    public void assistingTheDoctor() {
        System.out.println("A paramedic assists the doctor and, if necessary, can heal the patient himself");
    }
}
