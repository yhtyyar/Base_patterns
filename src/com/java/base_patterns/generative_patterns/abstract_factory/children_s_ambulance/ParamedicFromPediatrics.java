package com.java.base_patterns.generative_patterns.abstract_factory.children_s_ambulance;

import com.java.base_patterns.generative_patterns.abstract_factory.MedicalWorker;

public class ParamedicFromPediatrics implements MedicalWorker {

    @Override
    public void assistingTheDoctor() {
        System.out.println("A paramedic assists the doctor and, if necessary, can heal the patient himself");
    }
}
