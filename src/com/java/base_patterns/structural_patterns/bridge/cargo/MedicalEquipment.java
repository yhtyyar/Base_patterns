package com.java.base_patterns.structural_patterns.bridge.cargo;

import com.java.base_patterns.structural_patterns.bridge.transports.Transport;

public class MedicalEquipment extends Logistic {

    public MedicalEquipment(Transport transport) {
        super(transport);
    }

    @Override
    public void transportLogistic() {
        System.out.println("The vehicle for medical equipment will be a ");
        transport.transportCargo();
    }
}
