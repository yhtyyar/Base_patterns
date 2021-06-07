package com.java.base_patterns.generative_patterns.factory.specialist;

public class Neurologist implements Specialist{

    @Override
    public void aboutWork() {

        System.out.println("Невролог это врач который лечит заболевания связанные с нервной системой");
    }
}
