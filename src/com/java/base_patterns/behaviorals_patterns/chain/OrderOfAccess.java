package com.java.base_patterns.behaviorals_patterns.chain;

public class OrderOfAccess {

    public  void accessToPremises(){

        Access access = new JuniorPharmacist(SecurityLevel.LOW_LEVEL);
        Access pharmacistAccess = new Pharmacist(SecurityLevel.HIGH_LEVEL);
        Access pharmacyManagerAccess = new PharmacyManager(SecurityLevel.HIGHEST_LEVEL);

        access.setAccess(pharmacistAccess);
        pharmacistAccess.setAccess(pharmacyManagerAccess);


        access.permissionToAccessThePremises
                ("Junior Pharmacist",SecurityLevel.LOW_LEVEL);
        System.out.println("\n============================================================\n");

        access.permissionToAccessThePremises
                ("Pharmacist",SecurityLevel.HIGH_LEVEL);
        System.out.println("\n============================================================\n");

        access.permissionToAccessThePremises
                ("Pharmacy manager", SecurityLevel.HIGHEST_LEVEL);

    }
}
