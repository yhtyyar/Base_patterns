package com.java.base_patterns.behaviorals_patterns.template;

public abstract class QuestionnaireTemplate {

    public void showQuestionnaire(){
        System.out.println("Full name:_______________________________");
        System.out.println("Address:_________________________________");
        System.out.println("Tel:___________________");
        showGender();
        System.out.print(" your signature:__________");
    }

    public abstract void showGender();
}
