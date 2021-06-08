package com.java.base_patterns.structural_patterns.flyweight;

import java.util.HashMap;
import java.util.Map;

public class PersonnelDepartment {

    private static final Map<String, Staff> staffInPharmacy = new HashMap<>();

    public Staff getStaffBySpecialty(String specialty) {

        Staff staff = staffInPharmacy.get(specialty);

        if (staff == null) {

            switch (specialty) {

                case "junior pharmacist":
                    System.out.println("Hiring junior Pharmacist...");
                    staff = new JuniorPharmacist();
                    break;

                case "pharmacist":
                    System.out.println("Hiring Pharmacist....");
                    staff = new Pharmacist();
                    break;

                case "pharmacy manager":
                    System.out.println("Hiring Pharmacy Manager...");
                    staff = new PharmacyManager();
                    break;

                default:
                    System.out.println("This specialty does not work in a pharmacy");
                    break;
            }

            staffInPharmacy.put(specialty, staff);
        }

        return staff;
    }
}
