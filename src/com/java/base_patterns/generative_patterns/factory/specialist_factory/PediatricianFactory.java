package com.java.base_patterns.generative_patterns.factory.specialist_factory;

import com.java.base_patterns.generative_patterns.factory.specialist.Pediatrician;
import com.java.base_patterns.generative_patterns.factory.specialist.Specialist;

public class PediatricianFactory implements SpecialistFactory{

    @Override
    public Specialist createSpecialist() {
        return new Pediatrician();
    }
}
