package com.java.base_patterns.generative_patterns.abstract_factory.children_s_ambulance;

import com.java.base_patterns.generative_patterns.abstract_factory.MedicalSpecialist;

public class Pediatrician implements MedicalSpecialist {

    @Override
    public void healsThePatient() {

        System.out.println("A pediatrician is a specialist treating childhood diseases");
    }
}
