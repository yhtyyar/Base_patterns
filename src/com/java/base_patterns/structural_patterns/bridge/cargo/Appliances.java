package com.java.base_patterns.structural_patterns.bridge.cargo;

import com.java.base_patterns.structural_patterns.bridge.transports.Transport;

public class Appliances extends Logistic {

    public Appliances(Transport transport) {
        super(transport);
    }

    @Override
    public void transportLogistic() {
        System.out.println("The vehicle for household appliances will be a ");
        transport.transportCargo();
    }
}
