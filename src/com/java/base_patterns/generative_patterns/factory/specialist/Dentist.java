package com.java.base_patterns.generative_patterns.factory.specialist;

public class Dentist implements Specialist{

    @Override
    public void aboutWork() {

        System.out.println("Стоматолог это врач который лечит зубные болезни");
    }
}
