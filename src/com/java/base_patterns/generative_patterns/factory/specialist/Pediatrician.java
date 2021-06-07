package com.java.base_patterns.generative_patterns.factory.specialist;

public class Pediatrician implements Specialist{

    @Override
    public void aboutWork() {

        System.out.println("Педиатр это врач который лечит болезни детей");

    }
}
