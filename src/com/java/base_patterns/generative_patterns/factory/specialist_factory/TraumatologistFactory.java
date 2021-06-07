package com.java.base_patterns.generative_patterns.factory.specialist_factory;

import com.java.base_patterns.generative_patterns.factory.specialist.Specialist;
import com.java.base_patterns.generative_patterns.factory.specialist.Traumatologist;

public class TraumatologistFactory implements SpecialistFactory{

    @Override
    public Specialist createSpecialist() {
        return new Traumatologist();
    }
}
