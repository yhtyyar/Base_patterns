package com.java.base_patterns.generative_patterns.factory.specialist_factory;

import com.java.base_patterns.generative_patterns.factory.specialist.Ophthalmologist;
import com.java.base_patterns.generative_patterns.factory.specialist.Specialist;

public class OphthalmologistFactory implements SpecialistFactory{

    @Override
    public Specialist createSpecialist() {
        return new Ophthalmologist();
    }
}
