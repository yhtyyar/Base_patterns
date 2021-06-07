package com.java.base_patterns.generative_patterns.factory.specialist;

public class Ophthalmologist implements Specialist{

    @Override
    public void aboutWork() {

        System.out.println("Офтальмолог это врач который лечит глазные болезни");
    }
}
