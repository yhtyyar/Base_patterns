package com.java.base_patterns.generative_patterns.factory.specialist_factory;

import com.java.base_patterns.generative_patterns.factory.specialist.Dentist;
import com.java.base_patterns.generative_patterns.factory.specialist.Specialist;

public class DentistFactory implements SpecialistFactory{

    @Override
    public Specialist createSpecialist() {
        return new Dentist();
    }
}
