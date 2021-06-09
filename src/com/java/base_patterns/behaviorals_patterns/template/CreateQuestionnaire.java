package com.java.base_patterns.behaviorals_patterns.template;

public class CreateQuestionnaire {
    public static void main(String[] args) {

        QuestionnaireTemplate mr = new Mister();
        QuestionnaireTemplate mrs = new Misses();

        mr.showQuestionnaire();

        System.out.println("\n========================================\n");

        mrs.showQuestionnaire();
    }
}
