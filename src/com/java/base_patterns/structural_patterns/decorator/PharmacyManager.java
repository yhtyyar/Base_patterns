package com.java.base_patterns.structural_patterns.decorator;

public class PharmacyManager extends StaffDecorator{

    public PharmacyManager(Staff staff) {
        super(staff);
    }

    public String managePharmacy() {
        return "Manage Pharmacy and orders a new batch of drugs.";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + managePharmacy();
    }
}
