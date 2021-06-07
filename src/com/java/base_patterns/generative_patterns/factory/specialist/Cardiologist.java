package com.java.base_patterns.generative_patterns.factory.specialist;

public class Cardiologist implements Specialist{

    @Override
    public void aboutWork() {

        System.out.println("Кардиолог это врач который лечит заболевания сердца ");
    }
}
