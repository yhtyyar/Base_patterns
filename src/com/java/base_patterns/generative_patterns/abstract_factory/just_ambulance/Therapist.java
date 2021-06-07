package com.java.base_patterns.generative_patterns.abstract_factory.just_ambulance;

import com.java.base_patterns.generative_patterns.abstract_factory.MedicalSpecialist;

public class Therapist implements MedicalSpecialist {
    @Override
    public void healsThePatient() {
        System.out.println("A doctor determines the patient's diagnoses and treats him");
    }
}
