package com.java.base_patterns.structural_patterns.facade;

public class StartWorking {
    public static void main(String[] args) {

        WorkingProcess workingProcess = new WorkingProcess();

        workingProcess.beginningWork();
        System.out.println("\n=========================================================\n");
        workingProcess.EndOfTheWorkingDay();
    }
}
