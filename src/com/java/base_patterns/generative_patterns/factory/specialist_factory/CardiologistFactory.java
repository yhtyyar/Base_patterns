package com.java.base_patterns.generative_patterns.factory.specialist_factory;

import com.java.base_patterns.generative_patterns.factory.specialist.Cardiologist;
import com.java.base_patterns.generative_patterns.factory.specialist.Specialist;

public class CardiologistFactory implements SpecialistFactory{

    @Override
    public Specialist createSpecialist() {
        return new Cardiologist();
    }
}
