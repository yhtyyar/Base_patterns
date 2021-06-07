package com.java.base_patterns.structural_patterns.decorator;

public class StaffDecorator implements Staff{

    Staff staff;

    public StaffDecorator(Staff staff) {
        this.staff = staff;
    }

    @Override
    public String makeJob() {
        return staff.makeJob();
    }
}
