package com.java.base_patterns.behaviorals_patterns.interpreter;

public class VerificationCommission {
    public static void main(String[] args) {

        Condition firstAnswer = getFirstAnswer();
        Condition secondAnswer = new SecondCheckingCondition();


        System.out.println("First response to a license for Pharmacist: " + firstAnswer.checking("pharmacist"));

        System.out.println("Second response to a license for Pharmacist: " +
                secondAnswer.experience("pharmacist",5));

    }

    public static Condition getFirstAnswer() {

        Condition juniorPharmacist = new CertificateVerification("junior pharmacist");
        Condition pharmacist = new CertificateVerification("pharmacist");

        return new FirstCheckingCondition(juniorPharmacist, pharmacist);
    }

}
