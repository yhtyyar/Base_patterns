package com.java.base_patterns.generative_patterns.abstract_factory.ambulance_resuscitation;

import com.java.base_patterns.generative_patterns.abstract_factory.MedicalSpecialist;

public class Resuscitator implements MedicalSpecialist {

    @Override
    public void healsThePatient() {
        System.out.println("A resuscitator is a specialist engaged in maintaining and \n" +
                "restoring vital body functions in life-threatening conditions.");
    }
}
