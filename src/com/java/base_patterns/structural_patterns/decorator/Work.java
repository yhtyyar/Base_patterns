package com.java.base_patterns.structural_patterns.decorator;

public class Work {
    public static void main(String[] args) {

        Staff staff = new PharmacyManager(new Pharmacist(new JuniorPharmacist()));

        System.out.println(staff.makeJob());
    }
}
