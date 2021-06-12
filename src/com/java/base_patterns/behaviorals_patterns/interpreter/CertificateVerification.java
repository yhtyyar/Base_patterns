package com.java.base_patterns.behaviorals_patterns.interpreter;

public class CertificateVerification implements FirstCondition {

    private final String certificate;

    public CertificateVerification(String certificate) {
        this.certificate = certificate;
    }


    @Override
    public boolean checking(String specialty) {

        if (specialty.contains(certificate)) {
            return true;
        } else {
            return false;
        }
    }
}
