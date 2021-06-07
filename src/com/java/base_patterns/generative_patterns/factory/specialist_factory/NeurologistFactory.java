package com.java.base_patterns.generative_patterns.factory.specialist_factory;

import com.java.base_patterns.generative_patterns.factory.specialist.Neurologist;
import com.java.base_patterns.generative_patterns.factory.specialist.Specialist;

public class NeurologistFactory implements SpecialistFactory{

    @Override
    public Specialist createSpecialist() {
        return new Neurologist();
    }
}
