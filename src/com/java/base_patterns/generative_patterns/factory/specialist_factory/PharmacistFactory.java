package com.java.base_patterns.generative_patterns.factory.specialist_factory;

import com.java.base_patterns.generative_patterns.factory.specialist.*;

public class PharmacistFactory implements SpecialistFactory{

    @Override
    public Specialist createSpecialist() {
        return new Pharmacist();
    }
}
