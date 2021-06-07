package com.java.base_patterns.generative_patterns.factory.specialist;

public class Pharmacist implements Specialist{

    @Override
    public void aboutWork() {

        System.out.println("Фармацевт это специалист который очень хорошо разбирается в лекарствах");

    }
}
