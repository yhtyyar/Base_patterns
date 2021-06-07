package com.java.base_patterns.structural_patterns.decorator;

public class Pharmacist extends StaffDecorator{

    public Pharmacist(Staff staff) {
        super(staff);
    }

    public String preparesMedication(){
        return "Prepares a prescription medication. \n";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + preparesMedication();
    }
}
